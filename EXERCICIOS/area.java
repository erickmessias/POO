public class area {
    private double area;;

    public area () {
    }

    public area (double raio){
        area = 3.14 * raio * raio;
        System.out.println("Voce calculou area de um circulo");
        System.out.println("Essa é a area do circulo: " + area);

    }

    public area(double base,double altura){
        area = base * altura;
        System.out.println("Voce calculou area de um reatngulo");
        System.out.println("Essa é a area do retangulo: " + area);


    }

    public area(double baseMaior,double baseMenor,double altura){
        area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("Voce calculou area de um trapezio");
        System.out.println("Essa é a area do trapezio: " + area);

    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}



