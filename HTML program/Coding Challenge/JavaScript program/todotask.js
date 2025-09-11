const now = new Date();
document.writeln(now.toString());

const start  = new Date("2025-08-01T09:00:00Z");
const end = new Date("2025-08-01T17:30:00Z");

const diffMs = end -start; // milliseconds
const diffHours = diffMs/(1000*60*60);

document.writeln(`Congratulations you have worked : ${diffHours}`);



// --- Todo List Functionality ---
const taskInput = document.getElementById('taskInput'); 
const addTaskBtn = document.getElementById('addTaskBtn'); 
const removeTaskBtn = document.getElementById('removeTaskBtn'); 
const showTasksBtn = document.getElementById('showTasksBtn'); 
const taskList = document.getElementById('taskList'); 

let tasks = []; // Array to store tasks

// Function to add a task
addTaskBtn.addEventListener('click', () => {
    const taskText = taskInput.value.trim();
    if (taskText !== '') {
        tasks.push(taskText);
        renderTasks();
        taskInput.value = ''; // Clear input field
    } else {
        alert('Please enter a task!');
    }
});


removeTaskBtn.addEventListener('click', () => {
    if (tasks.length > 0) {
        tasks.pop(); // Removes the last task
        renderTasks();
    } else {
        alert('No tasks to remove!');
    }
});


showTasksBtn.addEventListener('click', () => {
    renderTasks();
});


function renderTasks() {
    taskList.innerHTML = ''; 
    tasks.forEach((task, index) => {
        const listItem = document.createElement('li');
        listItem.textContent = task;
        
        const deleteIndividualBtn = document.createElement('button');
        deleteIndividualBtn.textContent = 'X';
        deleteIndividualBtn.onclick = () => {
            tasks.splice(index, 1); 
            renderTasks();
        };
        listItem.appendChild(deleteIndividualBtn);
        taskList.appendChild(listItem);
    });
}


// --- Calculator Functionality ---
const num1Input = document.getElementById('num1'); 
const num2Input = document.getElementById('num2'); 
const operationSelect = document.getElementById('operationSelect'); 
const calculateBtn = document.getElementById('calculateBtn'); 
const resultDisplay = document.getElementById('calculatorResult'); 

calculateBtn.addEventListener('click', () => {
    const num1 = parseFloat(num1Input.value);
    const num2 = parseFloat(num2Input.value);
    const operation = operationSelect.value;
    let result;

    if (isNaN(num1) || isNaN(num2)) {
        resultDisplay.textContent = 'Error: Invalid input';
        return;
    }

    switch (operation) {
        case 'add':
            result = num1 + num2;
            break;
        case 'subtract':
            result = num1 - num2;
            break;
        case 'multiply':
            result = num1 * num2;
            break;
        case 'divide':
            if (num2 !== 0) {
                result = num1 / num2;
            } else {
                resultDisplay.textContent = 'Error: Division by zero';
                return;
            }
            break;
        default:
            resultDisplay.textContent = 'Error: Invalid operation';
            return;
    }
    resultDisplay.textContent = `Result: ${result}`;
});
