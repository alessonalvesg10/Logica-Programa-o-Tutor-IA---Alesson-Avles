import java.util.Scanner;
public class Atividade2 {
  public static  void main(String[] args) {
  Scanner vox = new Scanner (System.in);
  System.out.print("Qual seu nome? ");
  String Nome = vox.nextLine();
  System.out.print("Qual sua idade? ");
  int idade = vox.nextShort();
  System.out.println("Olá " + Nome + " você tem " + idade + " anos ");
  vox.close();  

  }
}