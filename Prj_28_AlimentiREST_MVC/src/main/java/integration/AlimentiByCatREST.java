package integration;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import entities.Alimento;
import service.AliementoServiceImpl;
import service.AlimentoService;

/**
 * Servlet implementation class AlimentiREST
 */
@WebServlet("/api/alimentibycat")
public class AlimentiByCatREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private AlimentoService service = null;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlimentiByCatREST() {
        super();
        System.out.println("servlet costruita");
        this.service = new AliementoServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Vuoi ricevere tutti gli alimenti");
		
		String catRichiesta = request.getParameter("cat");
		
		
		List<Alimento> alimenti = this.service.findByCat(catRichiesta);
		
		JSONArray json = new JSONArray();
		
		for (Alimento a : alimenti) {
			JSONObject obj = new JSONObject();
			obj.put("categoria", a.getCategoria());
			obj.put("prodotto", a.getProdotto());
			
			
			json.put(obj);
		}
		
		response.setContentType("application/json");
		
		response.getWriter().append(json.toString());
	}

}
