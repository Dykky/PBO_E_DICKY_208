class Musuh extends karakterGame { //merupakan subclass dari karakterGame
    public Musuh(String nama, int kesehatan) {//constuctor
        super(nama, kesehatan);
    }

    @Override //Override method serang untuk memberikan serangan
    public void serang(karakterGame target){
        System.out.println(getnama() + " menyerang " + target.getnama() + " Menggunakan Snake Bite!");
        target.setkesehatan(target.getkesehatan() - 15);
        System.out.println(target.getnama() + " Sekarang memiliki kesehatan " + target.getkesehatan());
    }
}
