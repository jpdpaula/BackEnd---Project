//package senac.java.Services;
//
//import static java.lang.System.exit;
//
//import senac.java.View.Screens;
//import senac.java.View.ScreensCadastro;
//
//public class Roteamento {
//
//    static ScreensCadastro screensCadastro = new ScreensCadastro();
//    static Screens screens = new Screens();
//    public static void rotas(int response){
//
//
//        switch (response){
//            case 1:
//                screensCadastro.sellerScreen();
//            break;
//            case 2:
//                screensCadastro.userScreen();
//                break;
//            case 3:
//                screensCadastro.productsScreen();
//                break;
//            case 4:
//                System.out.println("");
//                System.out.println("Programa Encerrado");
//                exit(0);
//                break;
//            default:
//                System.out.print("");
//                System.out.println("Por favor, escolha uma das opções:");
//                System.out.println("");
//                screens.StartScreen();
//                break;
//        }
//    }
//
//    public static void rotasEndSeller(String responseAgainSeller){
//
//        if(responseAgainSeller.equals("SIM")){
//            ScreensCadastro.sellerScreen();
//        }else if (responseAgainSeller.equals("NAO") | responseAgainSeller.equals("NÃO")){
//            Screens.StartScreen();
//        }else if (responseAgainSeller.equals("SAIR")){
//            System.out.println("");
//            System.out.println("Programa Encerrado");
//            System.exit(0);
//        }else{
//            System.out.println("");
//            System.out.println("Nenhuma resposta detectada. Voltando para tela inical");
//            System.out.println("");
//            Screens.StartScreen();
//        }
//    }
//
//    public static void rotasEndUser(String responseAgainUser){
//
//        if(responseAgainUser.equals("SIM")){
//            ScreensCadastro.sellerScreen();
//        }else if (responseAgainUser.equals("NAO") | responseAgainUser.equals("NÃO")){
//            Screens.StartScreen();
//        }else if (responseAgainUser.equals("SAIR")){
//            System.out.println("");
//            System.out.println("Programa Encerrado");
//            System.exit(0);
//        }else{
//            System.out.println("");
//            System.out.println("Nenhuma resposta detectada. Voltando para tela inical");
//            System.out.println("");
//            Screens.StartScreen();
//        }
//    }
//    public static void rotasEndProducts(String responseAgainProducts){
//
//        if(responseAgainProducts.equals("SIM")){
//            ScreensCadastro.sellerScreen();
//        }else if (responseAgainProducts.equals("NAO") | responseAgainProducts.equals("NÃO")){
//            Screens.StartScreen();
//        }else if (responseAgainProducts.equals("SAIR")){
//            System.out.println("");
//            System.out.println("Programa Encerrado");
//            System.exit(0);
//        }else{
//            System.out.println("");
//            System.out.println("Nenhuma resposta detectada. Voltando para tela inical");
//            System.out.println("");
//            Screens.StartScreen();
//        }
//}}
