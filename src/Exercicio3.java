import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        
        String nome = "William";
        System.out.println("ola, meu nome e" +  nome);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por Favor, digite seu sobrenome;");
        String sobrenome = scanner.nextLine();

        scanner.close();

        String nomecompleto = nome + "" +sobrenome;
        System.out.println("seu nome completo e: " + nomecompleto);

        
        
    }
}
