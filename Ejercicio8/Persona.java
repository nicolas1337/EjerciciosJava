package Ejercicio8;
import java.util.Scanner;
public class Persona {
	public Scanner Teclado;
	public String nombre;
	public int edad;
	public int sueldo;
public void CargaDatos(){
	Teclado=new Scanner(System.in);
	System.out.println("Ingrese su nombre: ");
	nombre=Teclado.next();
	System.out.println("ingrese su edad: ");
	edad=Teclado.nextInt();
}
public void ImprimirDatos(){
	System.out.println("Nombre: "+ nombre);
	System.out.println("Edad: "+ edad);
}
public static class Empleado extends Persona{
public void CargaSueldo(){
		System.out.println("Ingrese su sueldo: ");
		sueldo=Teclado.nextInt();
}
public void ImprimirSueldo(){
		System.out.println("Su sueldo es : " + sueldo);
}
public static void main(String[] ar){
			Empleado Empleado1;
			Empleado1=new Empleado();
			Empleado1.CargaDatos();
			Empleado1.CargaSueldo();
			Empleado1.ImprimirDatos();
			Empleado1.ImprimirSueldo();
		}
	}
}




