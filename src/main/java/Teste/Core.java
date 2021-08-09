package Teste;

public class Core {
    public static void main(String[]args){
        BasicOperators basicOperators = new MathOperations();
        double vl = basicOperators.sum(2,1);
        double vlr = basicOperators.division(2,0);
        System.out.println(basicOperators.fact(10));
    }
}
