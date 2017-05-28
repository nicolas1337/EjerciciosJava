package Ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {
	private Scanner Teclado;
	private int Num;
public void inicializar(){
	Teclado=new Scanner(System.in);
	System.out.println("Ingrese un numero positivo:");
	Num=Teclado.nextInt();
	if(Num<=0){
		System.out.println("El número ingresado no es positivo");
	}else if(Num<=9 && Num>=1){
		System.out.println("El número es de 1 cifra");
	}else if(Num<=99){
		System.out.println("El número es de 2 cifras");
	}else if(Num<=999){
		System.out.println("El número es de 3 cifras");
	}else if(Num<=9999){
		System.out.println("El número es de 4 cifras");
	}else if(Num<=99999){
		System.out.println("El número es de 5 cifras");
	}
	else
		System.out.println("El número es de mas de 5 cifras");
	}
public static void main(String[] ar) {
	Ejercicio2 Ejercicio21;
	Ejercicio21=new Ejercicio2();
	Ejercicio21.inicializar();	
}
}
