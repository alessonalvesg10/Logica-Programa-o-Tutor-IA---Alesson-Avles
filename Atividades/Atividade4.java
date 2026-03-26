import java.util.Scanner;
public class Atividade4 {
    public static void main (String[] args) {
    Scanner vox = new Scanner(System.in);
    int DataNasc;

    System.out.println("Seu ano de Nascimento");
    DataNasc = vox.nextInt();
    
    System.out.println("Sua idade em 2026 é " + (2026 - DataNasc) + " anos");

    System.out.println("Sua idade em 2050 é " + (2050 - DataNasc) + " anos");
    vox.close();
    }
}