public class segitigaAngkaNiken{
    public static void main(String[] args){

        int x, y, z, n = 4 ;

        for (x=1; x<= n; x++){
            for (y=n; y > x; y--){
                System.out.print(" ");
            }
           for (z=1; z<= x; z++ ) {
                System.out.print(z+""); 
        }
        System.out.print("\n");
    }
}
}