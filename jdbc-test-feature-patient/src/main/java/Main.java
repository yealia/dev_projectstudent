package main.java;

import java.sql.SQLException;

import main.java.com.example.IndexMenu;

public class Main {
    public static void main(String[] args) throws SQLException {
        IndexMenu menu = new IndexMenu();
        menu.mainMenu();
    }
}