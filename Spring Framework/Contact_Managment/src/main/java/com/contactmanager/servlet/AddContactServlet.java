package com.contactmanager.servlet;

import com.contactmanager.model.Contact;
import com.contactmanager.model.ContactStore;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AddContactServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");

        Contact contact = new Contact(name, email, phone);
        ContactStore.addContact(contact);

        res.sendRedirect("contacts.jsp");
    }
}
