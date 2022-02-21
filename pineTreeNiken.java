public class pineTreeNiken{
    public static void main(String[] args){

        int i, j, k, tinggi = 3;

    for (i=1; i<=tinggi; i++){
        for(j = 1; j <= tinggi; j++){
            for(k = 1; k <= (tinggi*2)-1; k++){
              if(Math.abs(tinggi-k)<j){
                System.out.print( '*' );
              }else{
                System.out.print( ' ' );
              }
            }
            System.out.println();
          }
    }
}
}