package senac.java;

import senac.java.Services.Servidor;
//import senac.java.View.Screens;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        Servidor servidor = new Servidor();
//        Screens screens = new Screens();

        servidor.apiServer();
//        screens.StartScreen();
    }
}