
public class Main {
    public static void main(String[] args){
        Hewan Hewan1 = new Hewan(); //pembuatan objek untuk class Hewan
        Hewan Hewan2 = new Hewan(); //pembuatan objek untuk class Hewan

        Hewan1. Nama = "Kucing"; //atribut nama hewan
        Hewan2. Nama = "Anjing"; //atribut nama hewan

        Hewan1. Jenis = "Mamalia"; //atribut Jenis hewan
        Hewan2. Jenis = "Mamalia"; //atribut Jenis hewan

        Hewan1. Suara = "Nyann~~"; //atribut Suara hewan
        Hewan2. Suara = "Woof-Woof!! "; //atribut Suara hewan

        //pemanggilan method dari class
        Hewan1.tampilkanInfo();
        Hewan2.tampilkanInfo();
    }
}