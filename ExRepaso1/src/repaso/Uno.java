package repaso;

import java.util.Scanner;

public class Uno {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		String marca;
		double precio;
		System.out.println("Introduce marca ");
	    marca = entrada.nextLine();
		
		System.out.println("Introduce precio ");
		precio= entrada.nextDouble();
		Funciones.mostrarPrecio(precio, marca);

	
	
	int año;
	System.out.println("¿Cuántos años llevas en la empresa? ");
	año= entrada.nextInt();
	System.out.println("el sueldo final es "+Funciones.calcularSueldo(año));

		System.out.println("Introduce el número a multiplicar: ");
		int num = entrada.nextInt();
		int vector[] = new int[4];
		System.out.println("introduce el vector:");
		Funciones.pedir_vector(vector);
		System.out.println("Tu vector es ");
		Funciones.mostrar_vector(vector);
		Funciones.multiplicaPorNum(vector, num);
		System.out.println("El resultado es");
		Funciones.mostrar_vector(vector);

}
}


