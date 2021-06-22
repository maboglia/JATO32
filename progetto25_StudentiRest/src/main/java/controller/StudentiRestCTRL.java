package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentiRestCTRL
 */
@WebServlet("/studenti")//Rotta servlet
public class StudentiRestCTRL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentiRestCTRL() {
        super();
       System.out.println("Servlet costruita");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //utente chiama studenti, toncat creerà un oggetto 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String json = "[\"nome\":\" Rebecca \"]"; //è un array[]
		String json1 = "{\"nome\":\" Rebecca \"}"; //è un oggetto {}
		System.out.println("Mi hai chiamato via GET");
		
		response.getWriter().append(json1);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Mi hai chiamato via POST");
		//doGet(request, response);
	}

}
