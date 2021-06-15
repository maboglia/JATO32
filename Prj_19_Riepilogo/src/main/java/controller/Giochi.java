package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Dado;


@WebServlet("/giochi") //<-indica la rotta per raggiungere il servlet
public class Giochi extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//(Test)?vero:falso;
		
		String g = (request.getParameter("gioco")!=null)?request.getParameter("gioco"):"";
		response.setContentType("text/html");//MIME type
		if(g.equals("dadi")) {
			response.getWriter().append("<h1>Puoi giocare a " + g + "</h1>");
			Dado d1 = new Dado();
			Dado d2 = new Dado();
			for (int i = 0; i < 10; i++) {
				
				d1.lancia();
				d2.lancia();
				response.getWriter().append("\nDado n1: " + d1.valore()).append("\nDado n2: " + d2.valore());
				if(d1.valore()==d2.valore()) {
				response.getWriter().append("\nHai vinto!");
				}
			}//end for
			
		} else {
			response.getWriter().append("Benvenuto nei miei giochi!");
		}//end else
	
	}//end doGet
	
}
