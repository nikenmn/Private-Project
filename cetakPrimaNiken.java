import java.util.Scanner;
public class cetakPrimaNiken {
    public static void main(String[] args) {
        Scanner nilai = new Scanner (System.in);

    int i, j, m, n;
    boolean isPrima = true;
    
        System.out.println("Program Cetak Bilangan Prima"); 
        System.out.println("Masukkan jumlah deret yang diinginkan"); 
        System.out.print("N = "); 
        int deret= nilai.nextInt();

        for (m=1; m<=deret; m++){
        for(i=2, n =1; n<=deret; i++, n++) {
            
            for (j = 2; j <= n; j++) {
                if(i%j==0){
                    isPrima = false;
                    break;
                }
            }
            if(isPrima==true){
                System.out.print(i+" ");
                continue;
            }
        }
        
    }
}
}