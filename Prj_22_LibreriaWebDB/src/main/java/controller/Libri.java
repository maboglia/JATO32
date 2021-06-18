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
       LibroDAO ld;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Libri() {
        super();
        ld = new LibroDAO();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println(ld.findAll());
//		Libro l = ld.findAll().get(4);
//		ld.addLibro(l);
//		ld.deleteLibro(25);
//		l.setPagine(1500);
//		ld.updateLibro(l);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setAttribute("libri", ld.findAll());
		request.getRequestDispatcher("Books.jsp").forward(request, response);
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("titolo")!=null) {
			
			String titolo = request.getParameter("titolo");
			double prezzo = Double.parseDouble(   request.getParameter("prezzo"));
			double prezzo_iva = Double.parseDouble(request.getParameter("prezzo_iva"));
			int pagine = Integer.parseInt( request.getParameter("pagine"));
			int editore_id =Integer.parseInt( request.getParameter("editore_id"));
			
			Libro l = new Libro(0, titolo, pagine, editore_id, prezzo_iva, prezzo);
			
			ld.addLibro(l);
		}

		
		doGet(request, response);
	}
	
	
}