package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ingressoController extends HttpServlet{
	
	@RequestMapping("/teste")
	public String execute() {
		System.out.println("teste-spring");
		return "menu";
	}

	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/menu.jsp");
        rd.forward(req, resp);
		
	}
	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("ENTROU");
		try {
		
	        String teste = request.getParameter("ingresso");
	        System.out.println(teste);
	        request.setAttribute("teste", teste);
	        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/menu.jsp");
	        rd.forward(request, response);
        
		}catch (Exception e){
			System.out.println("catch");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/menu.jsp");
	        rd.forward(request, response);
		}

        
   }
	
}
