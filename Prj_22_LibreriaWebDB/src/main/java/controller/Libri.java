package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.LibroDAO;
import model.Libro;

/**
 * Servlet implementation class Libri
 */
@WebServlet("/libri")
public class Libri extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Libri() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LibroDAO ld = new LibroDAO();
		System.out.println(ld.findAll());
		Libro l = ld.findAll().get(4);
		ld.addLibro(l);
//		ld.deleteLibro(25);
//		l.setPagine(1500);
//		ld.updateLibro(l);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
