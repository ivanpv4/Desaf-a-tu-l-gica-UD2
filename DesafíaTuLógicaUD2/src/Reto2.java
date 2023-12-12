import java.util.Scanner;
public class Reto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, contador;
		contador = 0;
		boolean bandera = true;
		
		do {
			System.out.print("Escriba un número positivo para mostrar ese y los 20 siguientes: ");
			numero = sc.nextInt();
			if (numero > 0) {
				while (contador <= 20) {
					System.out.print(numero + " ");
					numero++;
					contador++;
				}
				bandera = false;
			} else {
				System.out.println("El número introducido no es válido");
			}
		} while (bandera);
		
		sc.close();

	}

}
