public class Barang {
    private String Nama;
    private int Stok;

    public Barang(String Nama, int Stok){
        this.Nama = Nama;
        this.Stok = Stok;
    }

    public void setStok(int stok){
        this.Stok = stok;
    }

    public int getStok(){
        return Stok;
    }

    public String getNama() {
        return Nama;
    }
}
