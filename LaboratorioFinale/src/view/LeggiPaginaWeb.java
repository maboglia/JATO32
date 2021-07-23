package view;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class LeggiPaginaWeb {

	public static void main(String[] args) {
		

		try {
			URL url = new URL("https://restcountries.eu/rest/v2/name/italy");
			InputStream is = url.openStream();
			BufferedInputStream bis = new BufferedInputStream(is);
			
			StringBuilder sb = new StringBuilder();
			
			while (true) {
				int data = bis.read();
				if(data == -1) break;
				else 
					sb.append( (char) data);
			}
			String pagina = sb.toString();
			
			
			
			PizzeriaDemo.stampaHTML(pagina, "files/paginaWeb.html");
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
