package SistemPetHotel;
import java.util.Scanner;

public class PET_HOTEL {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        DataPemilik Pemilik = null;
        DataHewan Hewan = null;
        HitungBiaya Biaya = null;

        int menu;
        do{
            System.out.println();
            System.out.println("================");
            System.out.println("SISTEM PET HOTEL");
            System.out.println("================");
            System.out.println("1. Data Pemilik");
            System.out.println("2. Data Hewan");
            System.out.println("3. Total Biaya");
            System.out.println("4. keluar");
            System.out.print("Silahkan Pilih Menu: ");
            menu = input.nextInt();
            input.nextLine();

            switch(menu){
                case 1:
                    System.out.println("===INPUT DATA PEMILIK===");
                    System.out.print("Nama Pemilik: ");
                    String namapemilik = input.nextLine();
                    System.out.print("Nomor Handphone: ");
                    String nohp = input.nextLine();
                    System.out.print("Alamat Pemilik: ");
                    String alamat = input.nextLine();
                    Pemilik = new DataPemilik(namapemilik, nohp, alamat);
                    Pemilik.TampilanPemilik();
                    break;
                case 2:
                    System.out.println("===INPUT DATA HEWAN===");
                    System.out.print("Nama Hewan: ");
                    String namahewan = input.nextLine();
                    System.out.print("Jenis Hewan: ");
                    String jenishewan = input.nextLine();
                    System.out.print("Umur Hewan: ");
                    String umur  = input.nextLine();
                    Hewan = new DataHewan(namahewan, jenishewan, umur);
                    Hewan.TampilanHewan();
                    break;
                case 3:
                    System.out.println("===JENIS KAMAR===");
                    System.out.println("1. VIP (Rp 100.000/hari");
                    System.out.println("2. reguler (Rp 50.000/hari");
                    System.out.print("Pilih Kamar: ");
                    int JenisKamar = input.nextInt();
                    System.out.print("Lama Penitipan: ");
                    int LamaPenitipan = input.nextInt();

                    if(JenisKamar == 1){
                        Biaya = new HitungBiaya(100000);
                    }
                    else{
                        Biaya = new HitungBiaya(50000);
                    }

                    System.out.println("=== TOTAL BIAYA ===");
                    System.out.println("Harga per Hari: Rp"+ Biaya.getHargaPerHari());
                    System.out.println("Lama Penitipan: "+ LamaPenitipan + " hari");
                    System.out.println("Total Biaya: Rp"+ Biaya.hitungbiaya(LamaPenitipan));
                    System.out.println("Diskon: Rp"+ Biaya.hitungdiskon(LamaPenitipan));
                    System.out.println("Total Setelah Diskon: Rp" + Biaya.hitungTotalBiaya(LamaPenitipan));
                    break;
                case 4:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
            }
        }while(menu != 4);
        input.close();
    }
}
