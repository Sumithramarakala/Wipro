
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.example.contactmanager.model.Contact" %> <%--  Import the Contact class  --%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Contacts</title>
    <link rel="stylesheet" href="style.css"> 
</head>
<body style="color: blue; font-size: 16px;">
    <div class="container" style="color: black; font-size: 16px;">
        <h2 >All Contacts</h2>
        <% 
            List<Contact> contacts = (List<Contact>) session.getAttribute("contacts");
            if (contacts != null && !contacts.isEmpty()) {
        %>
            <table>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Phone</th>
                    </tr>
                </thead>
                <tbody>
                    <% 
                        for (Contact contact : contacts) { 
                    %>
                        <tr>
                             <%-- <td><%= contact.getName() %></td> This should now work  --%>
                             <td><%=contact.getFirstName() %></td>
                            <td><%= contact.getEmail() %></td>
                            <td><%= contact.getPhone() %></td>
                        </tr>
                    <% 
                        } 
                    %>
                </tbody>
            </table>
        <% 
            } else { 
        %>
            <p>No contacts added yet. <!--  <a href="addContact.jsp">Add a new contact</a>.</p>-->
        <% 
            } 
        %>
        <p><a href="AddContact.jsp">Add New Contact</a></p>
    </div>
</body>
</html>



