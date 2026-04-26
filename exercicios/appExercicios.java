
import java.util.Scanner;
public class appExercicios {
    public static void main(String[] args) {
      IdadePessoa idade1 = new IdadePessoa();
    Scanner ler = new Scanner(System.in);

        System.out.println("informe seu nome");
    String nome = ler.nextLine();


        System.out.println("informe sua idade");
        int year = ler.nextInt();

      idade1.setIdade(year);
        System.out.println("nome:" + nome + "idade:" + year);
      idade1.VerificarIdade();
    }
}
