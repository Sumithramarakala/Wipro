//package com.example.contactmanager.servlet;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Servlet implementation class AddContactServlet
// */
//@WebServlet("/AddContactServlet")
//public class AddContactServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public AddContactServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}

package com.example.contactmanager.servlet;

//import com.contactmanager.model.Contact; // Import the Contact class
import com.example.contactmanager.model.*;

import java.io.IOException;
import java.util.ArrayList; // Import ArrayList
import java.util.List;     // Import List
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet; // Annotation for mapping servlet
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;   // Import HttpSession

@WebServlet("/AddContactServlet") // Map this Servlet to the URL /AddContactServlet
public class AddContactServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form parameters
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        // Create a new Contact object
        Contact newContact = new Contact(name, email, phone );

        // Get the current session, or create a new one if it doesn't exist
        HttpSession session = request.getSession();

        // Retrieve the contacts list from the session
        // If the list doesn't exist yet, create a new one
        List<Contact> contacts = (List<Contact>) session.getAttribute("contacts");
        if (contacts == null) {
            contacts = new ArrayList<>();
        }

        // Add the new contact to the list
        contacts.add(newContact);

        // Store the updated list back into the session
        session.setAttribute("contacts", contacts);

        // Redirect to the viewContacts.jsp page to display all contacts
        response.sendRedirect("viewContacts.jsp"); 
    }
}

