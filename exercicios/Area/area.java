public class area {
    private double valor1;
    private double valor2;
    private double valor3;
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setValor1(double valor1){
        this.valor1 = valor1;
    }

    public void setValor2(double valor2){
        this.valor2 = valor2;
    }

    public void setValor3(double valor3){
        this.valor3 = valor3;
    }

    public double calcularArea () {
        if (nome.equals("retangulo")){
            return valor1 * valor2;
    } else if (nome.equals("circulo")){
            return valor1*valor1*3.14;
        } else if (nome.equals("trapezio")){
            return (valor1*valor2) *valor3/2;

        }
        return 0;
    }



}



