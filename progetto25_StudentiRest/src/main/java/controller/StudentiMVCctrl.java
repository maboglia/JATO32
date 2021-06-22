package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.StudenteDAO;
import dal.StudenteDAOImpl;

/**
 * Servlet implementation class StudentiRestCTRL
 */
@WebServlet("/studentimvc")//Rotta servlet
public class StudentiMVCctrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentiMVCctrl() {
        super();
       System.out.println("Servlet costruita");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //utente chiama studenti, toncat creerà un oggetto 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudenteDAO sd = new StudenteDAOImpl();
		sd.findAll().forEach(s -> {
			try {
				response.getWriter().append("<h1> " + s.getCognome()+ "</h1>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		System.out.println("Mi hai chiamato via GET");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Mi hai chiamato via POST");
		//doGet(request, response);
	}

}
