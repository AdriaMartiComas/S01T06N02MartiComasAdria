package exercici2;

public class GenericMethods<T, S, V> {
	Persona ob1;
	S ob2;
	V ob3;

	public GenericMethods(Persona ob1, S ob2, V ob3) {
		this.ob1 = ob1;
		this.ob2 = ob2;
		this.ob3 = ob3;
	}

	public static void printGenericMethods(Persona... persones) {
		for (Persona obj : persones) {
			System.out.println(obj + " ");
		}
	}

	@Override
	public String toString() {
		return "GenericMethods [ob1=" + ob1 + ", ob2=" + ob2 + ", ob3=" + ob3 + "]";
	}

}
