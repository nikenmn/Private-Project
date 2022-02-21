import java.util.Scanner;
public class bilPrima{
    public static void main(String[] args){ 
        Scanner input = new Scanner (System.in);  
        String bilPrima = " ";
        int i, num, deret, prima = 0;

        System.out.println("Program Cetak Bilangan Prima"); 
        System.out.println("Masukkan jumlah deret yang diinginkan"); 
        System.out.print("N = "); 
        deret = input.nextInt();

   
        for (i = 2; i <= deret; i++){   
            for (num = i; num >= 1; num--)
            {
                if (i % num == 0)
                {
                    prima = prima + 1;
                }
            }
            if (prima == 2)
            {
                bilPrima = bilPrima + i + " ";
            }
        }
        System.out.println ("Bilangan prima");
        System.out.println (bilPrima);
    }    
}