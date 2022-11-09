package evaluacion_ejemplo;

import java.util.Scanner;

public class Evaluacion_ejemplo 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        float[] calificaciones = new float[5];
        float calif = 0;
        float promedio = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Teclea las calificaiones: ");
        System.out.println("Fundamentos de programación:");
        System.out.println("No. Control: 05010269");
        for(int i = 0; i<5;i++)
        {
            do
            {
                System.out.print("Teclea la calificación para la U" + (i+1) + " (0-100) :");
                calif = lector.nextFloat();
                if(calif<0 || calif>100)
                    System.out.println("Calificación no válida --> " + calif +" <-- (0-100)");
            }while(calif<0 || calif>100);
            calificaciones[i] = calif;
        }
        for(float dato:calificaciones)
        {
            promedio+=dato;
        }
        promedio = promedio/5;
        
        if(promedio>=70)
        {
            System.out.println("El alumno aprobo :)");
            int temp = (int)promedio/10;
            System.out.print("Promedio: " + promedio + " ");
            for(int i = 1; i<=temp; i++)
            {
                System.out.print("*");
            }
        }
        else
        {
            System.out.println("El alumno no aprobo el curso :(");
            int temp = (int)promedio/10;
            System.out.print("Promedio: " + promedio + " ");
            for(int i = 1; i<=temp; i++)
            {
                System.out.print("*");
            }
        }
        System.out.println("");
    }
}
