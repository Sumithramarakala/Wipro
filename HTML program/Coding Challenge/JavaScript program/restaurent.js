 
        const menuForm = document.getElementById('menu-form');
        const itemIdInput = document.getElementById('item-id');
        const itemNameInput = document.getElementById('item-name');
        const itemDescriptionInput = document.getElementById('item-description');
        const itemCategoryInput = document.getElementById('item-category');
        const itemPriceInput = document.getElementById('item-price');
        const itemAvailabilitySelect = document.getElementById('item-availability');
        const menuTableBody = document.querySelector('#menu-table tbody');
        const cancelEditButton = document.getElementById('cancel-edit');

        let menuItems = []; 

        // Simulated API Calls (using Promises)
        function apiCreateItem(item) {
            return new Promise(resolve => {
                setTimeout(() => {
                    item.id = Date.now(); 
                    menuItems.push(item);
                    saveMenuItems();
                    resolve(item);
                }, 500); 
            });
        }

        function apiGetAllItems() {
            return new Promise(resolve => {
                setTimeout(() => {
                    resolve(menuItems);
                }, 300); 
            });
        }

        function apiUpdateItem(updatedItem) {
            return new Promise(resolve => {
                setTimeout(() => {
                    const index = menuItems.findIndex(item => item.id === updatedItem.id);
                    if (index !== -1) {
                        menuItems[index] = updatedItem;
                        saveMenuItems();
                        resolve(updatedItem);
                    } else {
                        resolve(null); 
                    }
                }, 500); 
            });
        }

        function apiDeleteItem(id) {
            return new Promise(resolve => {
                setTimeout(() => {
                    const initialLength = menuItems.length;
                    menuItems = menuItems.filter(item => item.id !== id);
                    saveMenuItems();
                    resolve(menuItems.length < initialLength); 
                }, 300); 
            });}
        
        function saveMenuItems() {
            localStorage.setItem('menuItems', JSON.stringify(menuItems)); 
        }

        function loadMenuItems() {
            const storedItems = localStorage.getItem('menuItems');
            if (storedItems) {
                menuItems = JSON.parse(storedItems); 
            }
            displayMenuItems();
        }

    
        function displayMenuItems() {
            menuTableBody.innerHTML = '';
            menuItems.forEach(item => {
                const row = menuTableBody.insertRow();
                row.insertCell().textContent = item.name;
                row.insertCell().textContent = item.description;
                row.insertCell().textContent = item.category;
                row.insertCell().textContent = `$${item.price.toFixed(2)}`;
                row.insertCell().textContent = item.availability;

                const actionsCell = row.insertCell();
                const editButton = document.createElement('button');
                editButton.textContent = 'Edit';
                editButton.onclick = () => editItem(item.id); // Call editItem with item ID
                actionsCell.appendChild(editButton);

                const deleteButton = document.createElement('button');
                deleteButton.textContent = 'Delete';
                deleteButton.onclick = () => deleteItem(item.id); // Call deleteItem with item ID
                actionsCell.appendChild(deleteButton);
            });
        }

        // Handling Form Submission
        menuForm.addEventListener('submit', async (event) => {
            event.preventDefault();

            const newItem = {
                name: itemNameInput.value,
                description: itemDescriptionInput.value,
                category: itemCategoryInput.value,
                price: parseFloat(itemPriceInput.value),
                availability: itemAvailabilitySelect.value
            };

            if (itemIdInput.value) {
                // Editing existing item
                newItem.id = parseInt(itemIdInput.value);
                await apiUpdateItem(newItem);
                alert('Menu item updated!');
            } else {
                // Adding new item
                await apiCreateItem(newItem);
                alert('Menu item added!');
            }

            menuForm.reset();
            itemIdInput.value = ''; 
            displayMenuItems();
        });

        
        function editItem(id) {
            const itemToEdit = menuItems.find(item => item.id === id);
            if (itemToEdit) {
                itemIdInput.value = itemToEdit.id;
                itemNameInput.value = itemToEdit.name;
                itemDescriptionInput.value = itemToEdit.description;
                itemCategoryInput.value = itemToEdit.category;
                itemPriceInput.value = itemToEdit.price;
                itemAvailabilitySelect.value = itemToEdit.availability;
            }
        }

        
        async function deleteItem(id) {
            if (confirm('Are you sure you want to delete this item?')) {
                await apiDeleteItem(id);
                alert('Menu item deleted!');
                displayMenuItems();
            }
        }

        
        cancelEditButton.addEventListener('click', () => {
            menuForm.reset();
            itemIdInput.value = '';
        });

        
        document.addEventListener('DOMContentLoaded', () => {
            loadMenuItems();
            displayMenuItems();
        });
    
