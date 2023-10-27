package senac.java.Controllers;


import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import senac.java.Domain.Salesperson;
import senac.java.Services.ResponseEndPoints;

import org.json.JSONObject;


public class SalesPersonController {

    static ResponseEndPoints res = new ResponseEndPoints();

    public  static List<Salesperson> salespersonList = new ArrayList<>();
    public static class SalesPersonHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            String response = "";


            if ("GET".equals(exchange.getRequestMethod())){
                List<Salesperson> getAllFromArray = Salesperson.getAllSalesPerson(salespersonList);

                Salesperson salesPersonJson = new Salesperson();



                if (!getAllFromArray.isEmpty()){
                    for (Salesperson salesperson : getAllFromArray) {
                        System.out.println("Imagem:" + salesperson.getpImg());
                        System.out.println("Name: " + salesperson.getpName());
                        System.out.println("Last Name: " + salesperson.getpPrice());
                        System.out.println("Age: " + salesperson.getpDescri());

                        System.out.println("");
                    }

                 res.enviarResponseJson(exchange,salesPersonJson.arrayToJson(getAllFromArray),200);
                } else {
                    response = "Dados não encontrados";
                    res.enviarResponse(exchange,response);
                }
            }
            else if ("POST".equals(exchange.getRequestMethod())){
               try(InputStream requestBody = exchange.getRequestBody()) {
                   JSONObject json = new JSONObject(new String(requestBody.readAllBytes()));

                   Salesperson salesperson = new Salesperson(
                           json.getString("pImg"),
                           json.getString("pName"),
                           json.getString("pPrice"),
                           json.getString("pDescri")

                   );

                   salespersonList.add(salesperson);

                   res.enviarResponseJson(exchange,salesperson.toJson(), 200);
               } catch (Exception e) {
                   response = e.toString();
                   res.enviarResponse(exchange, response);
               }
            } else if ("OPTIONS".equals(exchange.getRequestMethod())) {
                exchange.sendResponseHeaders(204, -1);
                exchange.close();
                return;
            }else if ("PUT".equals(exchange.getRequestMethod())) {
                res.enviarResponse(exchange, response);
            }
            else if ("DELETE".equals(exchange.getRequestMethod())) {
                res.enviarResponse(exchange, response);

            } else {
                res.enviarResponse(exchange, response);
            }
        }
    }
}