<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add New Contact</title>
    <!-- Link to your CSS file for styling (or Bootstrap CDN) -->
    <link rel="stylesheet" href="style.css"> 
</head>
<body>
    <div class="container">
        <h2>Add New Contact</h2>
        <form action="AddContactServlet" method="post">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" required><br>
            </div>
            <br>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required><br>
            </div>
            <br>
            <div class="form-group">
                <label for="phone">Number:</label>
                <input type="tel" id="phone" name="phone" pattern="[0-9]{10}" placeholder="e.g., 1234567890" required><br>
            </div>
            <br>
            <div class="form-group">
                <button type="submit">Add Contact</button>
                <button type="reset">Clear</button>
            </div>
        </form>
         <p style="color: blue; font-size: 16px;"><a href="viewContacts.jsp">View All Contacts</a></p>
    </div>
</body>
</html>




