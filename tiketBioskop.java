import java.util.Scanner;

public class tiketBioskop{
    public static void main(String[] args){

    int tiketBioskop, hargaTiket1, hargaTiket2, hargaTiket3;
    String kartu;
    double diskon, totalHarga; 

    hargaTiket1 = 35000;
    hargaTiket2 = 42000;
    hargaTiket3 = 45000;

    Scanner scan = new Scanner(System.in);
    System.out.println("===================================");
    System.out.println(" SELAMAT DATANG DI BIOSKOP CENTRAL ");
    System.out.println("===================================");
    System.out.println(" ");
    System.out.println("Pilih Jenis Tiket yang diinginkan ");
    System.out.println("1 = Reguler , 2 = VIP , 3 = 3D ");
    tiketBioskop = scan.nextInt();
    System.out.println("Jenis tiket yang dipilih " +tiketBioskop);
    System.out.println(" ");
    
    System.out.println("Apakah anda memiliki kartu anggota? ya / tidak ");
    kartu = scan.next();
    
    switch (tiketBioskop) {
        case 1:
        System.out.println("Harga tiket anda sebesar Rp " +hargaTiket1);
            break;
        case 2:
            System.out.println(" Harga tiket anda sebesar Rp " +hargaTiket2);
            break;
        case 3:
            System.out.println(" Harga tiket anda sebesar Rp " +hargaTiket3);
            break;
        default:
        System.out.println(" Input yang anda masukkan tidak sesuai ");
            break;
             
        }
    System.out.println(" ");
    System.out.println("=========================================");
    System.out.println(" Terima Kasih telah memilih Bioskop Kami ");
    System.out.println("=========================================");
}
}
    