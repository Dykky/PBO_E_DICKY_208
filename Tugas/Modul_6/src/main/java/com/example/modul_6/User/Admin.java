package com.example.modul_6.User;

import com.example.modul_6.Action.AdminAction;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.Scanner;

public class Admin extends user implements AdminAction {
    private String Username;
    private String Password;

    Scanner input = new Scanner(System.in);

    public Admin(String Username, String Password){
        super(Username, Password);
        this.Username=Username;
        this.Password=Password;
    }

    public Admin(){
        super("","");
    }

    public String getUsername(){
        return Username;
    }

    public void setUsername(String Username){
        this.Username = Username;
    }

    public String getPassword(){
        return Password;
    }

    public void setPassword(String Password){
        this.Password = Password;
    }

    public void Display_admin(){
        VBox root = new VBox(10);
        root.setStyle("-fx-background-color: #2b0526;");
        VBox kiri = new VBox(5);
        kiri.setAlignment(Pos.CENTER_LEFT);
        VBox kanan = new VBox(5);
        kanan.setAlignment(Pos.CENTER_RIGHT);
        HBox tabble = new HBox(10);
        tabble.setAlignment(Pos.CENTER);
        HBox Kurleb = new HBox(5);
    }
}
