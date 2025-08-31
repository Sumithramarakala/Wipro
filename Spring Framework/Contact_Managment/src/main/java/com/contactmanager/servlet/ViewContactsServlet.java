package com.contactmanager.servlet;

import com.contactmanager.model.ContactStore;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ViewContactsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("contacts", ContactStore.getContacts());
        RequestDispatcher rd = req.getRequestDispatcher("viewContact.jsp");
        rd.forward(req, res);
    }
}
