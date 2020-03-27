package com.uca.capas.servlets;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub


		String user=req.getParameter("userName");
		String pass=req.getParameter("userPassword");
		
		PrintWriter out=res.getWriter();

		if(user.equals("admin")&&pass.equals("root")) {
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>" + "Login correcto"+ "</h1>");
		out.println("</body>");
		out.println("</html>");
		}
                 
                else {
                	out.println("<html>");
        		out.println("<body>");
        		out.println("<h4>" + "Login incorrecto" +"</h4>");
        		out.println("</body>");
        		out.println("</html>");
        		}
		
	}

}