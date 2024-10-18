/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labprojects1;

import java.util.Scanner;

/**
 *
 * @author 50494
 */
public class Flores_Camila_Empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
        String nombre;
        int HorasTrabajadas;
        double TarifaHora;
        double Salario;
        
        
        System.out.println("----- Boleta del Empleado ------- ");
        
        System.out.println("Favor ingresar su nombre completo: ");
        nombre = entrada.nextLine();
        
        System.out.println("Favor ingresar su numero de horas trabajadas al mes: ");
        HorasTrabajadas = entrada.nextInt();
        
        System.out.println("Favor ingresar su tarifa por hora (en Lempiras): ");
        TarifaHora = entrada.nextDouble();
        
        Salario = (TarifaHora*HorasTrabajadas/4);
        
      
        System.out.println("El salario semanal de " +nombre + " es de:" +Salario + "Lempiras semanales");       
    }
             
       
        
    }
    
}
