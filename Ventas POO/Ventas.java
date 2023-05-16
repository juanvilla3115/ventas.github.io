
/**
 * Write a description of class Ventas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ventas
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int numeroCajeros;
    VentasPOO[] losCajeros = new VentasPOO[50];
    String identificacion, nombre, caja;
    double venta1, venta2, venta3;
    double promedio = 0;System.out.println("Digite la cantidad de Cajeros: ");
    numeroCajeros = sc.nextInt();
    for( int i = 0; i< numeroCajeros; i++){
    System.out.println("digite la id del Cajero: ");
    identificacion= sc.next();
    System.out.println("digite el nombre del Cajero: ");
    nombre= sc.next();
    System.out.println("digite el numero de la caja: ");
    caja= sc.next();
    System.out.println("digite 3 ventas: ");
    System.out.println("digite la venta 1: ");
    venta1= sc.nextDouble();
    System.out.println("digite la venta 2: ");
    venta2= sc.nextDouble();
    System.out.println("digite la venta 3: ");
    venta3= sc.nextDouble();
    VentasPOO unCajero = new VentasPOO();
    unCajero.identificacion = identificacion;
    unCajero.nombre = nombre;
    unCajero.caja= caja;
    unCajero.ventauno= venta1;
    unCajero.ventados= venta2;
    unCajero.ventatres= venta3;
    losCajeros[i] = unCajero;
   
    }
    for(int i = 0; i < numeroCajeros; i++){
    double sum = (losCajeros[i].ventauno + losCajeros[i].ventados + losCajeros[i].ventatres)/3;
    promedio = promedio + sum / numeroCajeros;
    }
    System.out.println(" EL PROMEDIO DE VENTAS DEL SUPERMERCADO ES: " + promedio);
  }
}
