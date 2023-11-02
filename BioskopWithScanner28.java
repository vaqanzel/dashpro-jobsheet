import java.util.Scanner;
public class BioskopWithScanner28 {
    public static void main (String[]args) {

        Scanner sc = new Scanner (System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
         
        while (true) {    
            System.out.println("Menu : ");
            System.out.println("Input data penonton ");
            System.out.println("Tampilkan daftar penonton");
            System.out.println("Exit");
            System.out.print("Pilih menu (1/2/3) : ");
            
        int menu = sc.nextInt(); 
        
        switch (menu) {
        case 1:
            System.out.print("Masukkan nama : ");
            nama = sc.next();
            System.out.print("Masukkan baris : ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = sc.nextInt();
            sc.nextLine();
    
       if (baris >= 1 && baris <= 4 && kolom <= 1 && kolom<=2) {
           penonton[baris - 1][kolom - 1] = nama;
           System.out.println("Data penonton telah dimasukkan.");
     }else {
           System.out.println("Baris atau kolom tidak ditemukan.");
        }
     break;
     case 2 :
            System.out.println("Daftar Penonton : ");
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 2; j++){
                if (penonton[i][j] != null){
                    System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ": " + penonton[i][j]);
                      }
                   }
            }
            
        break; 
        case 3 :
        System.out.println("Terima kasih, program telah selesai.");
        System.exit(0);
        default :
        System.out.println("Menu tidak valid. Silahkan pilih 1, 2, atau 3.");
        break;
         }
       }
    }
    static boolean isValidSeat (int baris, int kolom, String[][]penonton){
        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <=2){
            if (penonton[baris - 1][kolom-1] == null){
                return true;
            }
        }
        return false;
    }
}

