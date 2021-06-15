package controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Libri
 */
@WebServlet("/libri")
public class Libri extends HttpServlet {
	
	ArrayList<String> libri = new ArrayList<>();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		libri.add("Il signore degli anelli 1");
		libri.add("Il signore degli anelli 2");
		libri.add("Il signore degli anelli 3");

		if (request.getParameter("id") != null) {// ------------------------Se mi passa l'id
			int id = Integer.parseInt(request.getParameter("id"));// ------Stampo il corrispettivo
			response.getWriter().append(libri.get(id));

		} else {
			response.getWriter().append(libri.toString());// --------------Altrimenti stampo tutto
		}

	}// Fine doGet

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if(request.getParameter("titolo") != null) {
			libri.add(request.getParameter("titolo"));
		}
		response.setContentType("text/html");
		response.getWriter().append("<a href='libri'>Libri</a>");
		
			
	}
}
