import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o salário atual do funcionário: ");
        double salarioinicial = sc.nextDouble();

        double novoSalario = salarioinicial * 1.15;

        System.out.println("O novo salário do funcionário com o aumento de 15% fica: R$" + novoSalario);

        sc.close();
    }
}