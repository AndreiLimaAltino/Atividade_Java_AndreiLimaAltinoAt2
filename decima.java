import java.util.Scanner;
public class decima {
    public static void main(String[] args) {
                Scanner input =  new Scanner(System.in);
            System.out.println("Informe a idade\n");
        int idade = input.nextInt ();
        int meses = idade*12;
        int dias = idade*365;
        System.out.print("A idade  \n"+idade+"meses  \n"+meses+"dias"+dias);


        input.close ();
    } 
    
}
