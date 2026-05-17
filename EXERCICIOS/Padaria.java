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


    public double calcularTotal() {
        return precoUnitario * quantidade;
    }
    public double buscarPreco(String item) {
        switch (item) {
            case "coxinha":
                precoUnitario = 2.0;
                break;
            case "pao":
                precoUnitario = 1.5;
                break;
            case "pastel":
                precoUnitario = 3.0;
                break;
            case "cafe":
                precoUnitario = 2.5;
                break;

            case "bauru":
                precoUnitario = 8.0;
                break;

                default:
                System.out.println("Item não tem");
                precoUnitario = 0;
                break;
        }

        return precoUnitario;
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
