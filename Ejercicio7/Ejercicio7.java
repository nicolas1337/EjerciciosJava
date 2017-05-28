package Ejercicio7;
import java.util.Scanner;
public class Ejercicio7{
	private Scanner Teclado;
	private int num1;
	private int num2;
	private int suma;
	private int resta;
	private int multi;
	private int divi;
public void Carga(){
	Teclado=new Scanner(System.in);
	System.out.println("Ingrese el primer número: ");
	num1=Teclado.nextInt();
	System.out.println("Ingrese el segundo número: ");
	num2=Teclado.nextInt();
}
public void Suma(){
	suma=num1+num2;
	System.out.println("La suma de "+ num1 + " y " + num2 + " es : " + suma);	
}
public void Resta(){
	resta=num1-num2;
	System.out.println("La resta de "+ num1 + " y " + num2 + " es : " + resta);
}
public void Multiplicacion(){
	multi=num1*num2;
	System.out.println("La multiplicacion de "+ num1 + " y " + num2 + " es : " +multi);	
}
public void Division(){
	divi=num1/num2;
	System.out.println("La division de "+ num1 + " y " + num2 + " es : " + divi);	
}
public static void main(String[] ar){
	Ejercicio7 Ejercicio71;
	Ejercicio71=new Ejercicio7();
	Ejercicio71.Carga();
	Ejercicio71.Suma();
	Ejercicio71.Resta();
	Ejercicio71.Multiplicacion();
	Ejercicio71.Division();
}
}
