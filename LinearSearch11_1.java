import java.util.Scanner;

public class LinearSearch11_1 {
    public static void main(String[] args) {

        Scanner sc01 = new Scanner(System.in);
        int [] nilaiKey = new int [10];
        int jmlKey = 0;
        int hasil = 0;
        int cari = 0;
        
        System.out.print("Masukkan jumlah elemen array : ");
        jmlKey = sc01.nextInt();

        for (int i = 0; i < jmlKey; i++) {
            System.out.print("Masukkan elemen array ke-"+(i+1)+" : ");
            nilaiKey[i] = sc01.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        cari = sc01.nextInt();
        for (int i = 0; i < jmlKey; i++){
            if (nilaiKey[i] == cari){
                hasil = i;
                System.out.println("Key ada di posisi ke- " +i);
                break;
            }
 }
}
}