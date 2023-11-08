import java.util.Scanner;

public class Hargabayar28{

public static void main(String [] args) {
     Scanner input =new Scanner(System.in);
     String merk_buku;
     int harga;
     int jumlah;
     double dis=0.5;
     double total;
     double bayar;
     double jmlDis;

      System.out.println("Masukan merk buku yang anda beli ");
      merk_buku=input.nextLine();
      System.out.println("Masukan harga barang yang dibeli ");
      harga=input.nextInt();
      System.out.println("Masukan Jumlah jumlah barang yang dibeli ");
      jumlah=input.nextInt();

      total=harga*jumlah;

      jmlDis=total*dis;

      bayar=total-jmlDis;

      System.out.println("Diskon yang anda dapatkan adalah " +jmlDis); System.out.println("Jumlah yang harus dibayar adalah " +bayar);
}
}