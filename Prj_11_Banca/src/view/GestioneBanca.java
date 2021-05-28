package view;

import java.util.ArrayList;

import controller.Filiale;
import model.Cliente;
import model.ContoCorrente;
import model.Movimento;

public class GestioneBanca {

	public static void main(String[] args) {
		
		Filiale bancaIntesa1 = new Filiale("Fil.1 - Via Roma 1");
		Filiale bancaIntesa2 = new Filiale("Fil.2 - Via Po 2");
		
		Cliente c = bancaIntesa1.addCliente("rebecca");
		ContoCorrente cc = bancaIntesa1.apriConto();
		
		bancaIntesa1.collegaContoCliente(c, cc);
		
		bancaIntesa1.versamento(cc, 100);
		double richiediSaldo = bancaIntesa1.richiediSaldo(cc);
		bancaIntesa1.versamento(cc, 50);
		bancaIntesa1.prelievo(cc, 75);
		bancaIntesa1.richiediSaldo(cc);
		ArrayList<Movimento> estrattoConto = bancaIntesa1.estrattoConto(cc);
		
		for (Movimento movimento : estrattoConto) {
			System.out.println(movimento);
		}
		
		
	}
	
}
