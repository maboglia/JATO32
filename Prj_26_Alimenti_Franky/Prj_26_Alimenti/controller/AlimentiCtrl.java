package controller;

import java.sql.SQLException;
import java.util.List;

import dal.AlimentoDAO;
import dal.AlimentoDAOImpl;
import model.Alimento;

public class AlimentiCtrl {

	public static void main(String[] args) {
		
		AlimentoDAO ad = new AlimentoDAOImpl();
		
		try {
			
			
			
			List<Alimento> tutti = ad.findAll();
			
			for (Alimento alimento : tutti) {
				
				System.out.println(alimento.getProdotto());
				
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
