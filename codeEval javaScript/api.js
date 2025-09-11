const generateUserBtn = document.getElementById('generateUserBtn');
const avatar = document.getElementById('avatar'); 
const fullname = document.getElementById('fullname'); 


const email = document.getElementById('email'); 

const apiUrl = 'https://randomuser.me/api/'; // Random user API endpoint


function fetchRandomUser() {
    fetch(apiUrl)
        .then(response => {
            if (!response.ok) {
                throw new Error(`HTTP error! Status: ${response.status}`);
            }
            return response.json();
        })
        .then(data => {
            const user = data.results[0]; 
            
            
            avatar.src = user.picture.large; 
            fullname.textContent = `${user.name.first} ${user.name.last}`; 
            email.textContent = user.email; 
        })
        .catch(error => {
            console.error('Error fetching random user:', error);
            fullname.textContent = 'Error fetching user data.';
            email.textContent = '';
            avatar.src = '';
        });
}

generateUserBtn.addEventListener('click', fetchRandomUser); //


fetchRandomUser();
