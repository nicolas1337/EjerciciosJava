package Ejercicio5;
import java.util.Scanner;
public class Ejercicio5{
	public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int suma,valor,cant;
        suma=0;
        cant=0;
        do {
            System.out.print("Ingrese un valor (9999 para finalizar):");
            valor=teclado.nextInt();
            if (valor!=9999 ) {
                suma=suma+valor;
                cant++;
            
            }
        
        }
         while (valor!=9999);
        	if (suma==0) {
            System.out.print("El valor es cero");
           
        } else if (suma>0){
            System.out.print("El valor es mayor a cero");
        }
        else  {
        	System.out.print("el valor es menor a cero   ");
        }
        System.out.print("      La Suma es :   ");
        System.out.print(suma);
	}
	
}