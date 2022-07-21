package exercici2;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Adrià", "Martí", 30);
		String str = "Soc un string";
		int num = 7;
		
		List<Object> myList = new ArrayList<Object>();
		myList.add(persona1);
		myList.add(str);
		myList.add(num);
		
		GenericMethods.printGenerics(myList);


		// NO FUNCIONA PERQUE EL PRIMER PARAMETRE HA DE SER DE TIPUS PERSONA
		//System.out.println(new GenericMethods("Soc un String", persona1, 32));
		//System.out.println(new GenericMethods(32, "souc un string", persona1));
	}
	
	

}


 /* 
 * - Exercici 2 Modifica l'apartat anterior de manera que els arguments del
 * mètode genèric siguin una llista d'arguments de variable indefinida.
 */
