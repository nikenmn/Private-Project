import java.util.Scanner;

public class perulanganFor{
    public static void main(String[] args){
    
        int absenAwal, absenAkhir;
        Scanner scan = new Scanner(System.in);

        System.out.println("===== Pasangan duduk Ujian Tengah Semester SMA 1 Bright =====");
        System.out.print("Masukkan Nomor Absen awal : ");
        absenAwal = scan.nextInt();
        System.out.print("Masukkan Nomor Absen akhir : ");
        absenAkhir = scan.nextInt();
        System.out.println("Berikut pasangan duduk tiap ruang ujian menurut nomor absensi siswa : ");

    for (absenAwal >>= 0 ; absenAwal < absenAkhir ; absenAwal++, absenAkhir--)
     System.out.printf("%04d dengan %04d\n", absenAwal, absenAkhir);
    }
}