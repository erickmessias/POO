public class FormatadorTexto {
    private String resultado;

    public FormatadorTexto() {

    }

    public FormatadorTexto(String texto) {
        resultado = texto.toUpperCase();
        System.out.println("Texto em maiúsculo: " + resultado);

    }


    public FormatadorTexto(String texto, boolean inverter) {
            if(inverter == true){
                resultado = new StringBuilder(texto).reverse().toString();
                System.out.println("Texto invertido: " + resultado);
            } else {
                System.out.println(texto);
            }

    }


    public FormatadorTexto(String texto, int repeticoes) {
            resultado = texto.repeat(repeticoes);
            System.out.println("Texto repetido " + resultado);
    }


    public void setResultado(String resultado) {
            this.resultado = resultado;
    }


    public String getResultado() {
            return this.resultado;
        }


    }

