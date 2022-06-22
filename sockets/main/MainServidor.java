package sockets.main;

import java.io.IOException;

import sockets.mesas.Mesas;


//Clase principal que hará uso del servidor
public class MainServidor
{
    public static void main(String[] args) throws IOException
    {
        Mesas serv = new Mesas(); //Se crea el servidor

        System.out.println("Iniciando servidor\n");
        serv.startServer(); //Se inicia el servidor
    }
}

