package senac.java.Services;

import com.sun.net.httpserver.Headers;

import com.sun.net.httpserver.HttpServer;  // Criar um servidor
import com.sun.net.httpserver.HttpExchange;  //  Envia a requisicao do front pro back (passa pelos caminhos)
import com.sun.net.httpserver.HttpHandler; //

import java.io.IOException; //Erros do servidor e o que fazer
import java.net.InetSocketAddress; // Protocolo de leitura da internet // ele quem abre o caminho para as informacoes na internet

import senac.java.Controllers.ProductController;
//import senac.java.Controllers.UserController;
import senac.java.Controllers.SalesPersonController;

public class Servidor {


    public void apiServer() throws IOException{


        HttpServer server = HttpServer.create(new InetSocketAddress(8080),
                0);

//        HttpHandler userHandler = new UserController.UserHandler();
        HttpHandler salesPersonHandler = new SalesPersonController.SalesPersonHandler();
        HttpHandler productHandler = new ProductController.ProductsHandler();

        server.createContext("/api/vendedor", exchange -> {

            configureCors(exchange);
            salesPersonHandler.handle(exchange);
        });
//        server.createContext("/api/usuario",  exchange -> {
//            configureCors(exchange);
//            userHandler.handle(exchange);
//                });


        server.createContext("/api/produtos", exchange -> {
            configureCors(exchange);
            productHandler.handle(exchange);
                });



        server.setExecutor(null);
        System.out.println("Servidor Iniciado");
        server.start();
    }

    private void configureCors(HttpExchange exchange) {

        Headers headers = exchange.getResponseHeaders();

        String requestOrigin = exchange.getResponseHeaders().getFirst("Origin");
        if (requestOrigin != null) {
            headers.set("Access-Control-Allow-Origin", requestOrigin);
        }
        headers.set("Access-Control-Allow-Origin", "*");
        headers.set("Access-Control-Allow-Methods", "GET,OPTIONS,POST,PUT,DELETE");
        headers.set("Access-Control-Allow-Headers", "Content-Type, Authorization");
        headers.set("Access-Control-Allow-Credentials", "true");
        headers.set("Access-Control-Max-Age","3600");
    }

}