//package senac.java.View;
//import java.util.Scanner;
//import senac.java.Domain.Salesperson;
//import senac.java.Domain.Users;
//import senac.java.Domain.Products;
//import senac.java.Services.Roteamento;
//
//public class ScreensCadastro {
//
//        static Scanner sc = new Scanner(System.in);
//
//        static Roteamento rotas = new Roteamento();
//
//
//
//    public static void sellerScreen(){
//        Salesperson salesperson = new Salesperson();
//        String responseAgainSeller = "";
//
//        System.out.println("");
//        System.out.println("Insira seu nome: ");
//        salesperson.name = sc.nextLine();
//        System.out.println("Insira seu sobrenome: ");
//        salesperson.lastName = sc.nextLine();
//        System.out.println("Insira seu número de celular: ");
//        salesperson.phoneNumber = sc.nextLine();
//        System.out.println("Insira seu CPF: ");
//        salesperson.cpf = sc.nextLine();
//        System.out.println("Insira seu Email: ");
//        salesperson.email = sc.nextLine();
//        System.out.println("Insira seu endereço: ");
//        salesperson.address = sc.nextLine();
//
//        System.out.println("");
//        System.out.println("Informações obtidas:");
//        System.out.println("Nome: " + salesperson.name);
//        System.out.println("Sobrenome: " + salesperson.lastName);
//        System.out.println("Número de celular: " + salesperson.phoneNumber);
//        System.out.println("CPF: " + salesperson.cpf);
//        System.out.println("Email: " + salesperson.email);
//        System.out.println("Endereço: " + salesperson.address);
//
//        System.out.println("");
//        System.out.println("Deseja cadastrar um vendedor novamente? (SIM para cadastrar novamente, NAO para voltar a tela inicial ou SAIR para sair do programa");
//        responseAgainSeller = sc.nextLine().toUpperCase();
//        rotas.rotasEndSeller(responseAgainSeller);
//
//
//
//    }
//
//    public static void userScreen(){
//        Users user = new Users();
//        String responseAgainUser = "";
//
//        System.out.println("");
//        System.out.println("Insira seu nome:");
//        user.name = sc.nextLine();
//        System.out.println("Insira seu sobrenome:");
//        user.lastName = sc.nextLine();
//        System.out.println("Insira sua idade:");
//        user.age = Integer.parseInt(sc.nextLine());
//        System.out.println("Insira seu endereço:");
//        user.address = sc.nextLine();
//        System.out.println("Insira seu email:");
//        user.email = sc.nextLine();
//        System.out.println("Insira sua senha:");
//        user.password = sc.nextLine();
//        System.out.println("Insira seu CPF:");
//        user.cpf = sc.nextLine();
//
//        System.out.println("");
//        System.out.println("Informações obtidas:");
//        System.out.println("Nome: " + user.name);
//        System.out.println("Sobrenome: " + user.lastName);
//        System.out.println("Idade: " + user.age);
//        System.out.println("Endereço: " + user.address);
//        System.out.println("Email: " + user.email);
//        System.out.println("CPF: " + user.cpf);
//
//        System.out.println("");
//        System.out.println("Deseja cadastrar um cliente novamente? (SIM para cadastrar novamente, NAO para voltar a tela inicial ou SAIR para sair do programa");
//        responseAgainUser = sc.nextLine().toUpperCase();
//        rotas.rotasEndUser(responseAgainUser);
//
//    }
//
//    public static void productsScreen(){
//        Products products = new Products();
//        String responseAgainProducts = "";
//
//        System.out.println("");
//        System.out.println("Insira o nome do produto");
//        products.pName = sc.nextLine();
//        System.out.println("Insira o preço do produto");
//        products.pPrice = sc.nextLine();
//        System.out.println("Insira a cor do produto");
//        products.pColor = sc.nextLine();
//        System.out.println("Insira a descrição do produto");
//        products.pDescription = sc.nextLine();
//        System.out.println("Insira a quantidade do produto");
//        products.pQuantity = Integer.parseInt(sc.nextLine());
//        System.out.println("Insira uma imagem do produto");
//        products.img = sc.nextLine();
//
//        System.out.println("");
//        System.out.println("Informações obtidas:");
//        System.out.println("Nome do produto: " + products.pName);
//        System.out.println("Preço: " + products.pPrice);
//        System.out.println("Cor: " + products.pColor);
//        System.out.println("Descrição: " + products.pDescription);
//        System.out.println("Quantidade: " + products.pQuantity);
//        System.out.println("Imagem: " + products.img);
//
//        System.out.println("");
//        System.out.println("Deseja cadastrar um produto novamente? (SIM para cadastrar novamente, NAO para voltar a tela inicial ou SAIR para sair do programa");
//        responseAgainProducts = sc.nextLine().toUpperCase();
//        rotas.rotasEndProducts( responseAgainProducts);
//    }
//}
