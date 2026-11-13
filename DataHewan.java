package SistemPetHotel;

public class DataHewan {
    private String NamaHewan;
    private String JenisHewan;
    private String UmurHewan;

    public DataHewan(String NamaHewan, String JenisHewan, String UmurHewan){
        this.NamaHewan = NamaHewan;
        this.JenisHewan = JenisHewan;
        this.UmurHewan = UmurHewan;
    }
    public void setNamaHewan(String NamaHewan){
        this.NamaHewan = NamaHewan;
    }
    public void setJenisHewan(String JenisHewan){
        this.JenisHewan = JenisHewan;
    }
    public void setUmurHewan(String UmurHewan){
        this.UmurHewan = UmurHewan;
    }
    public String getNamaHewan(){
        return NamaHewan;
    }
    public String getJenisHewan(){
        return JenisHewan;
    }
    public String getUmurHewan(){
        return UmurHewan;
    }

    public void TampilanHewan(){
        System.out.println();
        System.out.println("====DATA HEWAN====");
        System.out.println("Nama Hewan: " + getNamaHewan());
        System.out.println("Jenis Hewan: " + getJenisHewan());
        System.out.println("Umur Hewan: " + getUmurHewan());
    }
}