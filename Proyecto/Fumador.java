package Proyecto;
import java.io.DataOutputStream;
import java.io.IOException;
import Proyecto.Conexion;

public class Fumador extends Conexion {
    private int Elemento;
    private String nombre;
    private boolean activo = false;

    public static void main(String[] args) throws IOException
    {
        Fumador cli = new Fumador(1,"ernesto"); //Se crea el cliente

        System.out.println("Iniciando cliente\n");
        cli.startClient(); //Se inicia el cliente
    }

    public Fumador(int recurso, String nombre ) throws IOException{
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

       public void startClient() //Método para iniciar el cliente
       {
           try
           {
               //Flujo de datos hacia el servidor
               salidaServidor = new DataOutputStream(cs.getOutputStream());

               //Se enviarán dos mensajes
               for (int i = 0; i < 2; i++)
               {
                   //Se escribe en el servidor usando su flujo de datos
                   salidaServidor.writeUTF("Este es el mensaje número " + (i+1) + "\n");
               }

               cs.close();//Fin de la conexión

           }
           catch (Exception e)
           {
               System.out.println(e.getMessage());
           }
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
