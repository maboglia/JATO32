package view;

import controller.OrdineCtrl;

public class Pizzeria {

	public static void main(String[] args) {
		OrdineCtrl oc = new OrdineCtrl();
		
		oc.nuovoOrdine();
		oc.addPizza("margherita", 5);
		oc.addPizza("prosciutto", 5.5);
		oc.addPizza("melanzane", 6);
		oc.addPizza("4 stagioni", 7);
		oc.addPizza("gorgo e pere", 8);

//		oc.chiudiOrdine();
		
		System.out.println(oc.chiudiOrdine());
		
	}

}
