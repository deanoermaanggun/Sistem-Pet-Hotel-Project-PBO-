package SistemPetHotel;

public class DataPemilik {
    private String NamaPemilik;
    private String NoHP;
    private String Alamat;

    public DataPemilik(String NamaPemilik, String NoHP, String Alamat){
        this.NamaPemilik = NamaPemilik;
        this.NoHP = NoHP;
        this.Alamat = Alamat;
    }
    public void setNamaPemilik(String NamaPemilik){
        this.NamaPemilik = NamaPemilik;
    }
    public void setNoHP(String NoHP){
        this.NoHP = NoHP;
    }
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    public String getNamaPemilik(){
        return NamaPemilik;
    }
    public String getNoHP(){
        return NoHP;
    }
    public String getAlamat(){
        return Alamat;
    }

    public void TampilanPemilik(){
        System.out.println();
        System.out.println("===DATA PEMILIK===");
        System.out.println("Nama Pemilik: " + getNamaPemilik());
        System.out.println("Nomor HP: " + getNoHP());
        System.out.println("Alamat Pemilik: " + getAlamat());
    }
}
