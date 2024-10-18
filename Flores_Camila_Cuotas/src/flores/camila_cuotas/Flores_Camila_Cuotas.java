/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flores.camila_cuotas;

import java.util.Scanner;


public class Flores_Camila_Cuotas {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----- CUOTAS MENSUALES ------- ");
     
        double MontoPrestamo;
        double TasaintMensual;
        double PorSeguro;
        double ComisionCuota;
        double pestamo;
        int plazomeses;
        
       
        
        //valores fijos
        plazomeses = 24;
        TasaintMensual = 0.05;
        ComisionCuota = 0.03;
        PorSeguro = 0.25;
        SeguroMensual = 0.14;
     
        double InteresTotal = MontoPrestamo*TasaintMensual*plazomeses;
        double cuotabase = (MontoPrestamo+InteresTotal)/plazomeses;
        double SeguroMensual = cuotabase*PorSeguro;
        double CuotaMensual = cuotabase+SeguroMensual+ComisionCuota;
        double TotalPagar = CuotaMensual*plazomeses;
        double cuotabase = (MontoPrestamo+InteresTotal)/plazomeses;
        
       
       //programa
        System.out.println("Ingresar la cantidad del prestamo: ");
        MontoPrestamo = entrada.nextDouble();
        
        System.out.println("Para esa cantidad, su Tasa de interes mensual equivale a 5% ");
        TasaintMensual = 0.05;
        
        System.out.println("Para esa cantidad, su comision por cuota es de 3% ");
        ComisionCuota = 0.03;
        
        System.out.println("y su seguro seria de 25% ");
        PorSeguro = 0.25;
       
        
        System.out.println("Esa cantidad tiene un plazo de hasta 24 meses hasta su vencimiento");
        plazomeses = 24;
  
    
        System.out.println("Su interes total seria de: " + MontoPrestamo*TasaintMensual*plazomeses);
        System.out.println("El interes total de su prestamo seria:" + MontoPrestamo*TasaintMensual*plazomeses);
        
        

        
        
         
        
        
        
                
        

        
        
        

        
        
                
      
            
        
        
        
        
      
        
    }
    
}
