public class cobaAja{
    public static void main(String[] args){

        int i, j, k, n = 4 ;

        for (i=1; i<= n; i++){
            for (j=n; j > i; j--){
                System.out.print(" ");
            }
           for (k=1; k<= i; k++ ) {
                System.out.print("*"); 
        }
        System.out.print("\n");
    }
}
}