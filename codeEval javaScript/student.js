document.getElementById('timetable-link').addEventListener('click', function(event) {
    event.preventDefault();
    var timetableContainer = document.getElementById('timetable-container');
    if (timetableContainer.style.display === 'none') {
        timetableContainer.style.display = 'block';
    } else {
        timetableContainer.style.display = 'none';
    }
});

// Optional: Further JavaScript for dynamic content or interactions.
