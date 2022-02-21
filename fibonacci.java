import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args){
    int  n1= 0 ,n2= 1 ,n3,i,count ;    
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan jumlah deret bilangan fibonacci: ");
    count = scan.nextInt();

System.out.println(" ");
System.out.println("Fibonacci Series");
System.out.println(" ");
 for (i= 2 ;i<count;++i)    
 {    
  n3=n1+n2;    
  System.out.println( "Sum of: " +n1+ " + "  +n2+ " = " +n3);    
  n1=n2;    
  n2=n3;    
 }
}
}
    