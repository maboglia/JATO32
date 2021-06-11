package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gestione")
public class Gestione extends HttpServlet {

	public Gestione() {
		System.out.println("servlet costruita");
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().append("test");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		
		String titolo = request.getParameter("titolo");
		int pagine = Integer.parseInt(request.getParameter("nPagine"));
		double prezzo = Double.parseDouble(request.getParameter("prezzo"));
		
		Libreria.addLibro(titolo, pagine, prezzo);
		
		resp.sendRedirect("index.jsp?page=listLibro");

	}
	
	
	

}
