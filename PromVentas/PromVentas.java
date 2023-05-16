
/**
 * Write a description of class PromVentas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PromVentas
{
 public static void main(String[] args){  
 
 Scanner sc = new Scanner(System.in);
 String[] identificaciones = new String[50];
 String[] nombres = new String[50];
 String[] cajas = new String[50];
 double[] ventauno = new double[50];
 double[] ventados = new double[50];
 double[] ventatres = new double[50];
 // definir variables
 int numeroCajeros, ventas;
 String identificacion, nombre, caja;
 double venta1, venta2, venta3;
 double promedio = 0;
 //para saber cuantas veces se repite el ciclo
 System.out.println("Digite la cantidad de Cajeros a ingresar: ");
 //SC OBJETO DE LA LIBRERIA SCANNER
 numeroCajeros = sc.nextInt();
 for(int i = 0; i< numeroCajeros; i++){
     System.out.println("digite la identificacion del cajero: ");
     identificacion = sc.next();
     System.out.println("digite el nombre de estudiantes: ");
     nombre = sc.next();
     System.out.println("digite el numero de la caja: ");
     caja = sc.next();
     System.out.println("digite 3 ventas: ");
     //ventas = sc.nextInt();
   
     System.out.println("digite la venta 1: ");
     venta1 = sc.nextDouble();
     System.out.println("digite la venta 2: ");
     venta2 = sc.nextDouble();
     System.out.println("digite la venta 3: ");
     venta3 = sc.nextDouble();
     identificaciones[i] = identificacion;
     nombres[i] = nombre;
     cajas[i] = caja;
     ventauno[i] = venta1;
     ventados[i]= venta2;
     ventatres[i] = venta3;
  }
  for(int i = 0; i< numeroCajeros; i++){
      promedio = promedio + ((ventauno[i] + ventados[i]+ ventatres[i])/3)/ numeroCajeros;

  }
       System.out.println("el promedio de las ventas del supermercado es: " + promedio);

  }
}
