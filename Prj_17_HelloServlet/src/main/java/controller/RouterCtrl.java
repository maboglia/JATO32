package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RouterCtrl
 */
@WebServlet("/gestione")
public class RouterCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TodoCtrl tc = new TodoCtrl();
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//qui inizia il doc html
		request.getRequestDispatcher("header.jsp").include(request, response);
		//aggiungi form
		request.getRequestDispatcher("form.html").include(request, response);
		
		//passare alla vista l'elenco dei todo
		request.setAttribute("elenco", tc.getTodos());
		request.getRequestDispatcher("list.jsp").include(request, response);
		
		//chiudo con il footer
		request.getRequestDispatcher("footer.jsp").include(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("todo")!= null) {
			tc.addTodo(request.getParameter("todo"));
		}
		doGet(request, response);
		
	}

}
