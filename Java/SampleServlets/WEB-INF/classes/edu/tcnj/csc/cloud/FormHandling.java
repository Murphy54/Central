/*
 * FormHandling.java
 * 
 * The College of New Jersey
 * Cloud Research Group
 * Last Modified: 2/2/12
 * 
 * An example of a servlet that will handle data sent from a form using the 'GET' or 'POST'
 * method and output the results into an HTML form.
 */
package edu.tcnj.csc.cloud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 
 * A Servlet class that will handle data sent from form.html using the method 'GET'
 * The class will read the parameters of the form indibidually and print the results in 
 * an HTML table.
 */
public class FormHandling extends HttpServlet {
	  public void doGet (HttpServletRequest request,
	                     HttpServletResponse response)
	    throws ServletException, IOException
	  {
		  // Set Responses to be typed in HTML format
		  response.setContentType("text/html");
		  // Create writer object that will write to the document / browser
		  PrintWriter out = response.getWriter();
		  // Print an HTML Header
		  out.println("<h2>Form Handling Servlet</h2>");
		  // Print beginning of HTML table to organize data
		  out.println("<table border='0'>");
		  	  // Retrieve the data sent from the form with the parameter named "name"
		  	  String name = request.getParameter("name");
		  	  // Print row and cell of table to contain Name
			  out.println("<tr><td>");
			  // Print name in cell
			  out.println("Name: "+name);
			  // Close off row and cell of table
			  out.println("</tr></td>");
			  // Retrieve the data sent from the form with the parameter named "email"
			  String email = request.getParameter("email");
			  // Print row and cell of table to contain Email
			  out.println("<tr><td>");
			  // Print email in cell
			  out.println("Email: "+email);
			  // Close off row and cell of table
			  out.println("</tr></td>");
			  // Retrieve the data sent from the form with the parameter named academicYear (this was a dropdown menu)
			  String year = request.getParameter("academicYear");
			  // Print row and cell of table to contain Academic Year
			  out.println("<tr><td>");
			  // Print academic year
			  out.println("Academic Year: "+year);
			  // Close off row and cell of table
			  out.println("</tr></td>");
		  // Close off table
		  out.println("</table>");
		  out.println("<br><a href='index.html'><< Go to Index</a>");
		  // Close writer
		  out.close();
	  }
	  // In this case the form submitted the data using GET (it declared method='GET')
	  // In this doPost method I simply stating that if information is sent using POST
	  // to handle the data using the doGet method above. 
	  // The roles can be reversed and you can have separate methods for information sent
	  // via GET and POST from the same page or multiple pages.
	  public void doPost(HttpServletRequest request,
	          HttpServletResponse response)
	        		  throws ServletException, IOException {
		    // Call doGet method to handle the request and send a response
		    doGet(request, response);
	  }
}