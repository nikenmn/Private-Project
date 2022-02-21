public class bintangHourglassNiken {
    public static void main(String [] args) {
    
        int tinggi = 4;

        for(int i = tinggi; i>=1;i--){
           for(int j=1;j<=(tinggi*2)-1;j++){
            if(Math.abs(tinggi-j)<i){
              System.out.print( '*' );
            }else{
              System.out.print( ' ' );
            }
          }
          System.out.println();
        }
        
        for(int i = 2; i <= tinggi; i++){
          for(int j = 1; j <= (tinggi*2)-1; j++){
            if(Math.abs(tinggi-j)<i){
              System.out.print( '*' );
            }else{
              System.out.print( ' ' );
            }
          }
          System.out.println();
        }
    }
}