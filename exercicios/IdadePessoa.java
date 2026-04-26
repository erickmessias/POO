import org.w3c.dom.ls.LSOutput;

public class IdadePessoa {

    private String nome;
    private int idade;


    public int getIdade() {
        return idade;
    }

    public void setIdade( int idade) {
     this.idade = idade;
    }
    public String getNome(){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public void VerificarIdade (){
        if(idade >= 18){
            System.out.println("È maior de idade");

        }else{
            System.out.println("É menor de idade");
        }
    }


}
