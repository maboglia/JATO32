package view;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import model.Pizza;

public class Reflection {

	public static void main(String[] args) {
		
		
		Pizza p = new Pizza();
		
		Class<? extends Pizza> class1 = p.getClass();
		
		System.out.println(class1);
		System.out.println(class1.getName());
		System.out.println(class1.getSimpleName());
		
		Constructor<?>[] constructors = class1.getConstructors();
		System.out.println(constructors.length);
		
		Constructor<?> constructor = constructors[1];
		try {
			Object oggetto = constructor.newInstance();
		
			
			
			
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
