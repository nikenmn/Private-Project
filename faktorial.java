import java.util.Scanner;
public class faktorial{
    public static void main(String[] args){
Scanner input = new Scanner(System.in);
int angka;
int faktorial = 1;

System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
System.out.print(angka);
System.out.print(" Faktorial = ");
for (int i=1; i<=angka; i++){
    faktorial*=i;
    System.out.print(i);
    if  (i < angka) {
        System.out.print("x");
    } else {
        System.out.print(" ");
        break; 
    } 
    }  
System.out.print( " = " +faktorial) ; 
} 
}
    