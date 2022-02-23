/**
 * 
 */
package repaso;

import java.util.Scanner;

/**
 * @author Virginia
 *
 */
public class Funciones {
	public  static void mostrarPrecio(double precio, String marca) {
		double descuento;
		double precioFinal;
		
		if(marca.equals("Honda")) {
			descuento=precio* 0.05;
		}else if (marca.equals("yamaha")) {
			descuento= precio*0.08;
		}else if(marca.equals("Suzuki")){
			descuento= precio* 0.1;
		}else {
			descuento= precio*0.02;
		}
		precioFinal= precio-descuento;
		System.out.printf(" La moto %s vale %.2f con" + " un descuento de %.2f "+
		" y precio final de %.2f", marca, precio, descuento, precioFinal);
	}
	public static  double calcularSueldo(int año) {
		double sueldo= 40000;
		double incremento= 0;
		 double sueldoFinal;
		
		if(año>10) {
			incremento= sueldo*0.1;
		}else if(año>5 && año<10) {
			incremento= sueldo*0.07;
		}else if(año > 3 && año<=5) {
			incremento = sueldo*0.05;
		}else if(año <=3 && año> 0) {
			incremento= sueldo*0.05;
		}else {
			incremento=0;
		}
		sueldoFinal= sueldo+incremento;
		return sueldoFinal;
	}
	

	public static void  pedir_vector(int v[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Introduce el elemento %d: ", i);
			v[i] = entrada.nextInt();
		}
	}
	
	
	public static void  mostrar_vector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d ", v[i]);
		}
		System.out.println();
	}
	
	public static void multiplicaPorNum(int v[], int num) {
		for( int i=0; i< v.length; i++) {
			v[i]=v[i]*num;
		}
	}
		
		
	}
	
	
	
	


