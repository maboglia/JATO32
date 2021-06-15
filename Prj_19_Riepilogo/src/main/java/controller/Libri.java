package controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Libro;


@WebServlet("/libri")
public class Libri extends HttpServlet {
	
	ArrayList<Libro> libri = new ArrayList<>();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("application/json");
		
		if(request.getParameter("id")!=null) {
			
			int id = Integer.parseInt(request.getParameter("id"));
			response.getWriter().append(libri.get(id).toString());
			
		} else {
			
			response.getWriter().append(libri.toString());
			
		}
		
	}//end doGet

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getParameter("titolo")!=null) {
			
			Libro l = new Libro(request.getParameter("titolo"), 10);
			libri.add(l);
			
		}
		
		doGet(request, response);
			
		//response.setContentType("text/html");
		//response.getWriter().append("<a href='libri'>Libri</a>");
			
	}//end doPost
	
}








