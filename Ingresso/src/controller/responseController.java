package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class responseController extends HttpServlet {

	
	 protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       

	        String teste = request.getParameter("ingresso");
	        System.out.println(teste);
	        
	        request.setAttribute("teste", teste);
	        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/menu.jsp");
	        rd.forward(request, response);
	   }
}
