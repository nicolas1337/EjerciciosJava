package Ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {
	private Scanner Teclado;
	private String nombre;
	private int sueldo;
public void carga(){
	Teclado=new Scanner(System.in);
	System.out.printf("ingrese su nombre : ");
	nombre=Teclado.next();
	System.out.printf("ingrese su sueldo");
	sueldo=Teclado.nextInt();
}
public void imprimir(){
	System.out.println("Nombre: "+ nombre);
	System.out.println("Su sueldo es: "+ sueldo);
}
public void impuestos(){
	if(sueldo>=3000){
		System.out.println("Su sueldo es mayor a 3000 usted debe pagar impuestos");
	}
}
public static void main(String[] ar){
	Ejercicio6 Ejercicio61;
	Ejercicio61=new Ejercicio6();
	Ejercicio61.carga();
	Ejercicio61.imprimir();
	Ejercicio61.impuestos();
}
}
