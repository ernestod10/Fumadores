package sockets.main;

import java.io.IOException;

import sockets.fumadores.Fumadores;


//Clase principal que hará uso del cliente
public class MainCliente
{
    public static void main(String[] args) throws IOException
    {
        Fumadores cli = new Fumadores(); //Se crea el cliente

        System.out.println("Iniciando cliente\n");
        cli.startClient(); //Se inicia el cliente
    }
}

