import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ganho por hora");
        double ganhos = input.nextInt ();
        System.out.print("Horas de trabalho");
        int horas = input.nextInt();
        input.close();
        double salario = (ganhos*horas);
        System.out.println("Salario do mes"+salario);
        
    }
}
