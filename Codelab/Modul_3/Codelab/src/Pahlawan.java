class Pahlawan extends karakterGame { //merupakan subclass dari
    public Pahlawan(String nama, int kesehatan) { //constuctor
        super(nama, kesehatan);
    }

    @Override //Override method serang untuk memberikan serangan
    public void serang(karakterGame target){
        System.out.println(getnama() + " Menyerang " + target.getnama() + " menggunakan Orbital Strike!");
        target.setkesehatan(target.getkesehatan() -20 );
        System.out.println(target.getnama() + " sekarang memiliki kesehatan " + target.getkesehatan());
    }
}
