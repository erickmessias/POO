public class filme {
    String nome;
    int anoLancamento;
    boolean IncluidoPLano;
    double avaliacao;
    int totalAvaliacao;
    int duracaoEmMinutos;

   public void ExibirFicha(){
        System.out.println("nome do filme" + nome);
        System.out.println("ano"+ anoLancamento);
    }

   public void avalia(double nota){
        avaliacao += nota;
        totalAvaliacao++;
    }

    double mediaAvaliacao(){
       return avaliacao / totalAvaliacao;


    }
}
