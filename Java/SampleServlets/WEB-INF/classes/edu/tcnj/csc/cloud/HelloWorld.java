/* 
 * HelloWorld.java
 * 
 * The College of New Jersey
 * Cloud Research Group
 * Last Modified: 2/2/12
 * 
 * An example of a servlet that prints 'Hello World' and the Date at the time
 * the page is accessed to the screen. Output is written in Text and HTML.
 */
package edu.tcnj.csc.cloud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * A class that extends HttpServlet. This HelloWorld servlet once accessed writes Hello World to the 
 * browser along with the date/time the servlet was accessed.
 * 
 */
public class HelloWorld extends HttpServlet {
	  public void doGet (HttpServletRequest request,
	                     HttpServletResponse response)
	    throws ServletException, IOException
	  {
		  // Set Responses to be typed in HTML format
		  response.setContentType("text/html");
		  // Create writer object to write to browser/document
		  PrintWriter out = response.getWriter();
		  // Write an HTML H2 header to the page
		  out.println("<h2>Hello World Servlet</h2>");
		  // Write Hello World to the page
		  out.println("Hello World!");
		  // Get the current date using java util and convert to string. Then print
		  // to the page
		  out.println("<br>Today is: " + (new java.util.Date().toString()) );
		  // Print an html link to go back to index.html
		  out.println("<br><a href='index.html'><< Go Back</a>");
	  }
	  // If data is sent using the 'POST' method it will simply call the 'GET' method to process
	  // the data. The roles can be reversed. In this example no data is sent via GET or POST.
	  // These methods are here for templating purposes.
	  public void doPost(HttpServletRequest request,
	          HttpServletResponse response)
	        		  throws ServletException, IOException {
		    doGet(request, response);
	  }
}