public class Main {
    public static void main(String[] args) {
        filme meuFilme = new filme();
        meuFilme.nome ="Vingadores";
        meuFilme.anoLancamento= 2019;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.avalia(5);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.ExibirFicha();
        System.out.println(meuFilme.avaliacao);
        System.out.println(meuFilme.totalAvaliacao);
        System.out.println(meuFilme.mediaAvaliacao());
    }
}