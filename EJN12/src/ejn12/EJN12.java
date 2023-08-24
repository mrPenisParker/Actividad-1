/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio 12 (Salario)
package ejn12;
//importamos la clase Scanner para introducir informacion
import java.util.Scanner;
public class EJN12 {
    public static void main(String[] args) {
        int hours, value, pay, reten; //asignamos las variables tipo "int"
        Scanner entrada = new Scanner(System.in); //texto que anuncia a la entrada
        System.out.println("Ingrese las horas de trabajo: ");
        hours = entrada.nextInt();
        System.out.println("Ingrese el pago por hora: ");
        value = entrada.nextInt();
        pay = hours*value; //realizamos las respectivas operaciones
        reten = (pay*25)/200;
        System.out.println("El salario bruto del trabajador es: " + pay); //imprimimos los resultados
        System.out.println("La retencion en la fuente es: " + reten);
        System.out.println("El salario neto del trabajador es: " + (pay-reten));
                    }
        } 
        