import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
    Scanner vox = new Scanner(System.in);
    String Nome;
    double Peso, Altura, Imc;

    System.out.println("Digite seu Nome");
    Nome = vox.nextLine();

    System.out.println("Digite seu peso");
    Peso = vox.nextDouble();

    System.out.println("Digite sua Altura");
    Altura = vox.nextDouble();

    Imc = Peso / (Altura * Altura);
    System.out.printf("Olá " + Nome + " IMC é  %.2f", Imc);
    vox.close();
  }

}
