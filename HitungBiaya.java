package SistemPetHotel;

public class HitungBiaya {
    private int HargaPerHari;

    public HitungBiaya(int HargaPerHari){
        this.HargaPerHari = HargaPerHari;
    }

    public void setHargaPerHari(int HargaPerHari){
        this.HargaPerHari = HargaPerHari;
    }
    public int getHargaPerHari(){
        return HargaPerHari;
    }
    public int hitungbiaya(int LamaPenitipan){
        return HargaPerHari * LamaPenitipan;
    }
    public double hitungdiskon(int LamaPenitipan){
        if(LamaPenitipan >= 7){
            return hitungbiaya(LamaPenitipan) * 0.10;
        }
        else{
            return 0;
        }
    }
    public double hitungTotalBiaya (int LamaPenitipan){
        return hitungbiaya(LamaPenitipan) - hitungdiskon(LamaPenitipan);
    }
}
