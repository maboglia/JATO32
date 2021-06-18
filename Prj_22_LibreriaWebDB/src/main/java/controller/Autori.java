package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import database.AutoreDAO;
import database.AutoreDAOImpl;
import model.Autore;

/**
 * Servlet implementation class Autori
 */
@WebServlet("/autori")
public class Autori extends HttpServlet {
	private static final long serialVersionUID = 1L;
    AutoreDAO ad;   

    
    public Autori() {
        super();
        ad = new AutoreDAOImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println(ad.findById(3));
		ad.deleteById(23);
		Autore b = ad.findById(3);
		b.setCognome("Francesco");
		ad.update(b);
		
		
		for (Autore a : ad.findAll()) {
			System.out.println(a);
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = "Pippo", cognome = "Pluto", nazionalita = "Marte";
		
		ad.addAutore(new Autore(0, nome, cognome, nazionalita));
		
		
		doGet(request, response);
	}

}
