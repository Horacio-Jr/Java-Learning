package Null.Object.Patern;

public class MainTeste {

    public static Pessoa personalData(){
        Pessoa pessoa = new Pessoa();
        if (pessoa.getNome() != null){
            return pessoa;
        } else {
            return new PessoaNull();
        }
    }

    public static void main(String [] args){
        Pessoa p = personalData();
        System.out.println(p.getSexo());
    }

}
