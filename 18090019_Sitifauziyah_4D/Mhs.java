public class Mhs {

    private String NIM;
    private String Nama;
    private String Alamat;
    private String Agama;

    public Mhs() {
        NIM = "";
        Nama = "";
        Alamat = "";
        Agama = "";
    }

    public Mhs(String NIM, String Nama, String Alamat, String Agama) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Agama = Agama;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setAgama(String Agama) {
        this.Agama = Agama;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getAgama() {
        return Agama;
    }

}