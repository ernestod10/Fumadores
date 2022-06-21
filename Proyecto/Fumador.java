package Proyecto;
import java.io.DataOutputStream;
import java.io.IOException;
import Proyecto.Conexion;

public class Fumador extends Conexion {
    private int Elemento;
    private String nombre;
    private boolean activo = false;

    public Fumador(String nombre, int recurso) throws IOException{
    super("Fumador");
    this.setElemento(recurso);
    this.setNombre(nombre);} 




        /* El proceso utilizara este metodo para determinar si los materiales de la mesa le sirven para empezar a fumar.
       return si puede o no fumar  */
       public boolean puedoFumar(int a, int b){
           try
           {
               activo = false;
               if ((a + b + Elemento) == 3)
               {
                   activo = true;
                   Enrrollando();
                   Fumando();
               }
           }
               catch (InterruptedException ex) {;}
           return activo;
       }

       /** Inicia el proceso de enrrollado del cigarrillo...  */
       public void Enrrollando() throws InterruptedException {
           System.out.println(this.getNombre() + "Enrrollando cigarrillo...");
           Thread.sleep(1 * 600);
       }
       /**
        * El proceso que será consumido cuando todo este listo.
        * Se detiene el hilo principal para simular el proceso.     */

            public void Fumando() throws InterruptedException {
           System.out.println("Empezando a fumar....");
           Thread.sleep((int) 2000);
           System.out.println("Termina de fumar...");
       }
   //constructores y metodos
   public int getElemento(){
       return Elemento;
   }

   public void setElemento(int Elemento){
       this.Elemento = Elemento;
   }

   public String getNombre(){
       return nombre;
   }

   public void setNombre(String nombre){
       this.nombre = nombre;
   }

   public boolean isActivo(){
       return activo;
   }

   public void setActivo(boolean activo){
       this.activo = activo;
   }

}
