package exercici1;

public class App {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Adrià", "Martí", 30);

		System.out.println(new GenericMethods(persona1, "Soc un String", 32));

		// NO FUNCIONA PERQUE EL PRIMER PARAMETRE HA DE SER DE TIPUS PERSONA
		//System.out.println(new GenericMethods("Soc un String", persona1, 32));
		//System.out.println(new GenericMethods(32, "souc un string", persona1));
	}

}

/*
 * - Exercici 1 Modifica l'exercici anterior de manera que un dels arguments del
 * mètode genèric no sigui genèric.
 */
