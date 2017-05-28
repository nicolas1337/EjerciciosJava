package Ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {
	private Scanner Teclado;
	private int Precio;
	private int Cantidad;
	private int Total;
public void inicializar(){
	Teclado=new Scanner(System.in);
	System.out.println("Ingrese el precio del producto:");
	Precio=Teclado.nextInt();
	System.out.println("Ingrese la cantidad:");
	Cantidad=Teclado.nextInt();
	Total=Precio * Cantidad;
}
public void imprimir(){
	System.out.println("Debe abonar:"+Total);
}
public static void main(String[] ar) {
	 Ejercicio1 Ejercicio11;
	 Ejercicio11=new Ejercicio1();
	 Ejercicio11.inicializar();
	 Ejercicio11.imprimir();
	 }
}
