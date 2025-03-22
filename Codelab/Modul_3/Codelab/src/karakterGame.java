public class karakterGame {
    private String nama;
    private int kesehatan;

    public karakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public String getnama(){
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public int getkesehatan(){
        return kesehatan;
    }

    public void setkesehatan (int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public void serang(karakterGame target){
        System.out.println(nama + " Menyerang " + target.getnama());
    }
}
