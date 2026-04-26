public class Pedido {
    private String item;
    private int quantidade;
    private double precoUnitario;


    public Pedido(){

        System.out.println("----------- BEM VINDO A PADARIA DO MESSIAS--------------");

    }

    public Pedido(String item){
        System.out.println("seu pedido é " + item);
        System.out.println("\n AGUARDE SEU PEDIDO..........................");
    }

    public Pedido (String item, int quantidade){
        System.out.println("Você pediu um " + item + "\nCom essa quantidade: " + quantidade);
        System.out.println("\n AGUARDE SEU PEDIDO..........................");
    }
    public Pedido (String item, int quantidade,double precoUnitario){
        precoUnitario = 6.99;
        System.out.println("Voce pediu um " +item + " \n Nessa quantidade:" + quantidade + "\n No valor de " + precoUnitario + " cada");
        System.out.println("\n AGUARDE SEU PEDIDO..........................");

    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
