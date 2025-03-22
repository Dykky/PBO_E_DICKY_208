class Musuh extends karakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(karakterGame target){
        System.out.println(getnama() + " menyerang " + target.getnama() + " Menggunakan Snake Bite!");
        target.setkesehatan(target.getkesehatan() - 15);
        System.out.println(target.getnama() + " Sekarang memiliki kesehatan " + target.getkesehatan());
    }
}
