    import  java.util.Scanner;
    public class Atividade3 {

    public static void main(String[] args) {
    Scanner vox = new Scanner(System.in);
    float Valor1, Valor2;

    System.out.println("Digite o Primeiro Valor.");
    Valor1 = vox.nextFloat();

    System.out.println("Digite o Segundo Valor.");
    Valor2 = vox.nextFloat();

    System.out.println("--/--Resutado das Operações--/--");
    System.out.println("Soma");
    System.out.println(Valor1 + Valor2);
    System.out.println("Subtração");
    System.out.println(Valor1 - Valor2);
    System.out.println("Multiplicação");
    System.out.println(Valor1 * Valor2);
    System.out.println("Divisão");
    System.out.println(Valor1 / Valor2);
    System.out.println("Resto da Divisão");
    System.out.println(Valor1 % Valor2);
    vox.close();
     }
}
