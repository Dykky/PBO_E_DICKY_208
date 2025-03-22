class Pahlawan extends karakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(karakterGame target){
        System.out.println(getnama() + " Menyerang " + target.getnama() + " menggunakan Orbital Strike!");
        target.setkesehatan(target.getkesehatan() -20 );
        System.out.println(target.getnama() + " sekarang memiliki kesehatan " + target.getkesehatan());
    }
}
