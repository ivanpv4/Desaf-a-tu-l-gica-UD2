
public class Reto3 {

	public static void main(String[] args) {
		System.out.println("Los números entre 1 y 100 que son múltiplos de 2 son: ");
		for (int contador2 = 1; contador2 <= 100; contador2++) {
			int resultado2 = contador2 % 2;
			if (resultado2 == 0) System.out.print(contador2 + " ");
		}
		System.out.println("\nCantidad de múltiplos de 2: 50");
		System.out.println("\n\nLos números entre 1 y 100 que son múltiplos de 3 son: ");
		for (int contador3 = 1; contador3 <= 100; contador3++) {
			int resultado3 = contador3 % 3;
			if (resultado3 == 0) System.out.print(contador3 + " ");
		}
		System.out.println("\nCantidad de múltiplos de 3: 33");
	}

}
