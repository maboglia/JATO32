package view;

import java.util.List;

import model.Pizza;

public class Formattatore {

	public static String paginator(String s) {
		
		StringBuilder pagina = new StringBuilder();
		
		pagina.append("<html>");
		pagina.append("<head>");
		pagina.append("</head>");

		pagina.append("<body>");
		
		pagina.append(s);
		
		
		pagina.append("</body>");
		
		pagina.append("</html>");
		
		return pagina.toString();
	}
	
	public static String tabella(List<Pizza> pizze) {
		
		StringBuilder tabella = new StringBuilder();
		
		tabella.append("<table>\n");
		
		for (Pizza pizza : pizze) {
			tabella.append("<tr>");
				tabella.append("<td>");
				tabella.append(pizza.getNome());
				tabella.append("</td>");
			
				tabella.append("<td>");
				
					tabella.append("<ul>");
					pizza.getIngredienti().forEach(i -> tabella.append("<li>"+i+"</li>"));
					tabella.append("</ul>");
					
				tabella.append("</td>");

				tabella.append("<td>");
				tabella.append(pizza.getPrezzo());
				tabella.append("</td>");

			tabella.append("</tr>\n");
		}
		
		tabella.append("</table>\n");
		
		return tabella.toString();
	}
	
	
}
