import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ganho por hora");
        double ganhos = input.nextInt ();
        System.out.print("Horas de trabalho");
        int horas = input.nextInt();
        input.close();
        double salarioBruto = (ganhos*horas);
        double ImpostoRenda = (salarioBruto*0.11);
        double Inss =  (salarioBruto*0.08);
        double Sindicato = (salarioBruto*0.05);
        double SalarioLiquido = (salarioBruto-ImpostoRenda-Inss-Sindicato);
        System.out.println("Salario bruto"+salarioBruto);
                System.out.println("Imposto a ser pago"+ImpostoRenda);
        System.out.println("Inss"+Inss);
        System.out.println("Sindicato"+Sindicato);
                System.out.println("Salario líquido"+SalarioLiquido);



    }
}
