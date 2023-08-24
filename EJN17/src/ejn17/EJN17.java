/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio 17 (Area y Circunferencia)
package ejn17;
//importamos la clase Scanner para introducir informacion
import java.util.Scanner;
public class EJN17 {
    public static void main(String[] args) {
        double r, a, c; //asignamos las variables tipo "int"
        Scanner entrada = new Scanner(System.in); //texto que anuncia a la entrada
        System.out.println("Ingresa el radio del circulo"); //nueva entrada
        r = entrada.nextDouble();
        a = Math.PI * Math.pow(r,2); //realizamos las respectivas operaciones
        c = r*2*Math.PI;
        System.out.println("El area del circulo es: " + a); //imprimimos los resultados
        System.out.println("La circunferencia del circulo es: " + c);
    }
}
