public class persegiReverseAngkaNiken { 
    public static void main(String[]args) { 
        int i, j, k = 6;

        for(i = 1; i <= k ; i+=2) {   
            for(j = 1; j <= k ; j++) {     
                System.out.print(j);   
            }   
                System.out.println(""); 
            } 
        for(i = 2; i <= k ; i+=2) { 
            for(j = 1; j <= k ; j--) { 
            System.out.print(j);   
        }   
            System.out.println(""); 
        } 
    }  
}