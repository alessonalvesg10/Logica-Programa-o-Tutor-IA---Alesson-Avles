import java.util.Scanner;
public class Atividade6 {
    public static void main(String [] args){
    Scanner vox = new Scanner(System.in);
    float ValorSalario, ValorBonus, Desconto, SalarioFinal;
    Desconto = 0.1f;

    System.out.println("Digite seu Salario");
    ValorSalario = vox.nextFloat();

    System.out.println("Digite o Valor Bonus");
    ValorBonus = vox.nextFloat();

    SalarioFinal = ValorSalario + ValorBonus;

    System.out.println("Seu Salario Final " + (SalarioFinal - (SalarioFinal * Desconto)));
    vox.close();
    }
}