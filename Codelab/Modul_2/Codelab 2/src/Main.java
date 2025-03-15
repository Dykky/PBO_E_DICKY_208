public class Main {
    public static void main(String[] args){
        RekeningBank rekening1 = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        rekening1.nomorRekening = "202410370110208";
        rekening2.nomorRekening = "202410370110218";

        rekening1.namaPemilik = "Dicky Habib Putra Hidayatullah";
        rekening2.namaPemilik = "Revansa adha dwi yuliarto";

        rekening1.saldo = (1000000);
        rekening2.saldo = (900000);

        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();

        rekening1.setorUang(1000000);
        rekening2.setorUang(1000000);

        rekening1.tarikUang(100000);
        rekening2.tarikUang(2000000);
        System.out.println();

        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();
    }
}