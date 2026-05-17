
import java.util.Scanner;
public class app {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pedido cardapio = new Pedido();
        System.out.println("informe seu pedido");

        String cliete = ler.nextLine();
        cardapio.setItem(cliete);



        System.out.println("informe a quantidade");
        int quant = ler.nextInt();
        cardapio.setQuantidade(quant);
        cardapio.setPrecoUnitario(cardapio.buscarPreco(cliete));

        System.out.println("Você pediu " +cardapio.getQuantidade() +" " +cardapio.getItem());
        System.out.println("Seu pedido esta no valor de: "+cardapio.calcularTotal());


        }
    }


