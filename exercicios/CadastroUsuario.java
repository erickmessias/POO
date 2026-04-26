import java.sql.SQLOutput;

public class CadastroUsuario {

    String email;
    String senha;
    int idade;


    public CadastroUsuario() {

    }

    public CadastroUsuario(String email) {
        System.out.println("email: " + email );
        System.out.println("sua senha é 123");
        idade = 0;
        System.out.println("idade: " + idade);


        System.out.println("preencha os outros requesitos para mudar idade e senha");


    }

    public CadastroUsuario(String email,String senha) {
        System.out.println("email: " + email );
        System.out.println("senha: " + senha);
        idade = 0;
        System.out.println("idade: " + idade);

        System.out.println("preencha os outros requesitos para alterara a idade ");


    }

    public CadastroUsuario(String email,String senha,int idade) {
        System.out.println("email: " + email );
        System.out.println("senha: " + senha);
        System.out.println("idade: " + idade);
        System.out.println("TODOS OS DADOS PREENCHIDOS");
        System.out.println("CADASTRO CONCLUIDO");



    }



    public void setSenha(String senha) {
        this.senha = senha;
    }



    public String getSenha() {
        return senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
