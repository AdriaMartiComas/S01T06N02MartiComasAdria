package exercici2;



public class App {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Adrià", "Martí", 30);
		Persona persona2 = new Persona("Maria", "Rull", 33);
		Persona persona3 = new Persona("Felipe", "Santos", 37);
		Persona persona4 = new Persona("Nil", "Gasol", 25);


		System.out.println("2 persones");
		GenericMethods.printGenericMethods(persona1, persona3);
		System.out.println("4 persones");
		GenericMethods.printGenericMethods(persona1, persona2, persona3, persona4);

 
		
	}
	
	

}


 /* 
 * - Exercici 2 Modifica l'apartat anterior de manera que els arguments del
 * mètode genèric siguin una llista d'arguments de variable indefinida.
 */
