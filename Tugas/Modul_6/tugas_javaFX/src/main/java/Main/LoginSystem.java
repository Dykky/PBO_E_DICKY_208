package Main;
import Users.Admin;
import Users.Mahasiswa;
import Users.User;
import data.Item;
import javafx.scene.control.TableView;


import java.util.ArrayList;
public class LoginSystem {
    public static TableView<User> userList = new TableView<>();
    public static TableView<Item> itemList = new TableView<>();

    static {
        itemList.getItems().addAll(
                new Item("Hape", "Redmi Note 11", "Lab A-B"),
                new Item("Buku", "Warna Hijau", "Lab C-D")
        );
    };

    static  {
        userList.getItems().addAll(
        new Mahasiswa("Dicky Habib", "202410370110208"),
        new Mahasiswa("Devano Aghanza", "202410370110211"),
        new Admin("Admin", "Admin208")
        );
    }
}
