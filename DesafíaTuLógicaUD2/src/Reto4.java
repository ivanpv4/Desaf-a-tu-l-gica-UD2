import java.util.Scanner;
public class Reto4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, orden;
		
		System.out.println("Introduce 3 números: ");
		System.out.print("El primer número es: "); 
		num1 = sc.nextInt();
		System.out.print("El segundo número es: "); 
		num2 = sc.nextInt();
		System.out.print("El tercer número es: "); 
		num3 = sc.nextInt();
		
		System.out.print("Elige cómo ordenar los números. Pulsa '1' para que sea de manera ascendente y '2' para que sea descendente: ");
		orden = sc.nextInt();
		
		switch (orden) {
		case 1 : if (num1 <= num2 && num2 <= num3) {
			System.out.println("Números ordenados en ascendente: " + num1 + ", " + num2 + ", " + num3);
		} else if (num1 <= num3 && num3 <= num2) {
			System.out.println("Números ordenados en ascendente: " + num1 + ", " + num3 + ", " + num2);
		} else if (num2 <= num1 && num1 <= num3) {
			System.out.println("Números ordenados en ascendente: " + num2 + ", " + num1 + ", " + num3);
		} else if (num2 <= num3 && num3 <= num1) {
			System.out.println("Números ordenados en ascendente: " + num2 + ", " + num3 + ", " + num1);
		} else if (num3 <= num1 && num1 <= num2) {
			System.out.println("Números ordenados en ascendente: " + num3 + ", " + num1 + ", " + num2);
		} else {
			System.out.println("Números ordenados en ascendente: " + num3 + ", " + num2 + ", " + num1);
		}
		break;
		case 2: if (num1 >= num2 && num2 >= num3) {
			System.out.println("Números ordenados en descendente: " + num1 + ", " + num2 + ", " + num3);
		} else if (num1 >= num3 && num3 >= num2) {
			System.out.println("Números ordenados en descendente: " + num1 + ", " + num3 + ", " + num2);
		} else if (num2 >= num1 && num1 >= num3) {
			System.out.println("Números ordenados en descendente: " + num2 + ", " + num1 + ", " + num3);
		} else if (num2 >= num3 && num3 >= num1) {
			System.out.println("Números ordenados en descendente: " + num2 + ", " + num3 + ", " + num1);
		} else if (num3 >= num1 && num1 >= num2) {
			System.out.println("Números ordenados en descendente: " + num3 + ", " + num1 + ", " + num2);
		} else {
			System.out.println("Números ordenados en descendente: " + num3 + ", " + num2 + ", " + num1);
		}
		break;
		default: System.out.println("Orden inválida");
		
		}
		
		sc.close();
	}

}
