//package com.example.contactmanager.servlet;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * Servlet implementation class ContactManagerServlet
// */
//@WebServlet("/ContactManagerServlet")
//public class ContactManagerServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//    /**
//     * Default constructor. 
//     */
//    public ContactManagerServlet() {
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

import com.example.contactmanager.model.Contact;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ContactManagerServlet")
public class ContactManagerServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private List<Contact> contacts = new ArrayList<>(); // Using ArrayList to store contacts

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Display all contacts
        request.setAttribute("contacts", contacts); // Set the list of contacts as an attribute for JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("/viewContacts.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Add new contact
        // Get parameters, create Contact object, add to list, and redirect (code omitted for brevity, see source for full code)
    }
}

