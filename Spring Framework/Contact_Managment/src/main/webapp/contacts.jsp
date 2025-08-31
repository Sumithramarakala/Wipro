<%@ page import="java.util.List" %>
<%@ page import="com.contactmanager.model.Contact" %>
<%
  List<Contact> contacts = (List<Contact>) request.getAttribute("contacts");
%>
<!DOCTYPE html>
<html>
<head>
  <title>Contacts</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>
<body class="container mt-5">
  <h2>My Contacts</h2>
   <table class="table table-bordered mt-3">
    <thead>
      <tr>
        <th>Name</th><th>Email</th><th>Phone</th>
      </tr>
    </thead>
    <tbody>
     <% if (contacts != null && !contacts.isEmpty()) { 
           for(Contact c : contacts) { %>
             <tr>
               <td><%= c.getName() %></td>
               <td><%= c.getEmail() %></td>
               <td><%= c.getPhone() %></td>
             </tr>
      <%   } 
         } else { %>
        <tr><td colspan="3">Contact Added.</td></tr>
      <% } %>
   
  <p style=color:green>Contact Added Successfully.</p>
  <a href="index.jsp" class="btn btn-secondary" style=color:black>Back</a>
</body>
</html>
