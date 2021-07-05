package controller;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.LibroDAO;
import model.Pubblicazione;

/**
 * Servlet implementation class LibriCtrl
 */
@WebServlet("/books")
public class LibriCtrl extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		LibroDAO ld = new LibroDAO();
		
		Collections.sort(ld.getLibri());
		
		for (Pubblicazione l : ld.getLibri()) {
			//System.out.println(l);
		}
	
		Comparator<Pubblicazione> compLibri = new Comparator<Pubblicazione>() {

			@Override
			public int compare(Pubblicazione corrente, Pubblicazione successivo) {
				
				return (int) Math.round(corrente.getPrezzo() - successivo.getPrezzo());
			}
		
		};
		Collections.sort(ld.getLibri(), compLibri);
	System.out.println("riordino----------------------------------");	
		for (Pubblicazione l : ld.getLibri()) {
		//	System.out.println(l);
		}
		
		List<Pubblicazione> ll= ld.getLibri()
			.stream()
			.filter(l->l.getPrezzo()<25)
			.filter(l->l.getPrezzo()>4)
			.collect(Collectors.toList());
		
		
		for (Pubblicazione pubblicazione : ll) {
			System.out.println(pubblicazione);
		}
		
		// TODO Auto-generated method stub
		response.getWriter().append("Sto ragionando...");
	}

}
