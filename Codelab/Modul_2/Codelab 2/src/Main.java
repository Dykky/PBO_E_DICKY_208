public class Main {
    public static void main(String[] args){
        RekeningBank rekening1 = new RekeningBank(); //pembuatan objek untuk RekeningBank
        RekeningBank rekening2 = new RekeningBank(); //pembuatan objek untuk RekeningBank

        rekening1.nomorRekening = "202410370110208"; //Atribut rekening1
        rekening2.nomorRekening = "202410370110218"; //Atribut rekening2

        rekening1.namaPemilik = "Dicky Habib Putra Hidayatullah"; //Atribut rekening1
        rekening2.namaPemilik = "Revansa adha dwi yuliarto"; //Atribut rekening2

        rekening1.saldo = (1000000); //Atribut rekening1
        rekening2.saldo = (900000); //Atribut rekening2

        rekening1.tampilkaninfo(); //memanggil method tampilkaninfo
        rekening2.tampilkaninfo(); //memanggil method tampilkaninfo

        rekening1.setorUang(1000000); //memanggil method setoruang
        rekening2.setorUang(1000000); //memanggil method setoruang

        rekening1.tarikUang(100000); //memanggil method tarikuang
        rekening2.tarikUang(2000000); //memanggil method tarikuang
        System.out.println(); //untuk jarak antara tarikuang dengan tampilkaninfo

        rekening1.tampilkaninfo(); //memanggil method tampilkaninfo
        rekening2.tampilkaninfo(); //memanggil method tampilkaninfo
    }
}