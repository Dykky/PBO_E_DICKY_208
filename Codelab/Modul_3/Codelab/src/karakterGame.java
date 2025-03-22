public class karakterGame { //induk class
    //Atribut private untuk menyimpan nama dan kesehatan karakter
    private String nama;
    private int kesehatan;
    //constuctor
    public karakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    //Getter untuk mendapatkan nama karakter
    public String getnama(){
        return nama;
    }
    //Setter untuk mengubah nama karakter
    public void setnama(String nama) {
        this.nama = nama;
    }
    //Getter untuk mendapatkan nilai kesehatan
    public int getkesehatan(){
        return kesehatan;
    }
    //Setter untuk mengubah nilai kesehatan
    public void setkesehatan (int kesehatan) {
        this.kesehatan = kesehatan;
    }
    //Method untuk menyerang karakter
    public void serang(karakterGame target){
        System.out.println(nama + " Menyerang " + target.getnama());
    }
}
