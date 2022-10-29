package com.company;
/* Программа по выбору пользователя:
1. добавляет запись из имени и телефона в
базу данных myDataBase, таблицу nametel
 либо
 2. выдает телефон из базы по заданному пользователем имени */

import java.sql.*;
import java.util.Scanner;

public class Main {
    static Connection connection;

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/myDataBase";
        String username = "root";
        String password = "1829757";

        System.out.println("Подключение к базе данных...");
        connection = DriverManager.getConnection(url, username, password);
        System.out.println("Подключено");

        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Введите \"1\", если Вы хотите добавить данные");
        System.out.println("Введите \"2\", если Вы хотите получить данные");
        num = scanner.nextInt();
        System.out.println(num);
        if (num == 1) {
            String str;
            do {
                dataWrite();
                System.out.println("Хотите ввести еще данные? (Y/N)");
                str=scanner.next();
                System.out.println(str);
            } while (str.equals("Y")) ;
        } else {
            if (num == 2) {
                String str;
                do {
                    dataRead();
                    System.out.println("Хотите вывести еще данные? (Y/N)");
                    str=scanner.next();
                }
                while (str.equals("Y")) ;
            } else {
                System.out.println("Неверное значениие");
            }

        }
        connection.close();
        System.out.println("Отключено");
    }

    public static void dataWrite() throws SQLException {
        Statement statmt = connection.createStatement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name= scanner.next();
        System.out.println("Введите телефон");
        String tel= scanner.next();

        statmt.execute("INSERT INTO nametel (keyname, telefonnumber) VALUES ('"+name+"', '"+tel+"'); "); //запрос
        statmt.close();

    }

    public static void dataRead() throws SQLException {
        Statement statmt = connection.createStatement();
        ResultSet resSet;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.next();
        resSet = statmt.executeQuery("select telefonnumber from nametel where keyname='"+name+"'"); //запрос
        resSet.next();
        System.out.println("phone: "+resSet.getString("telefonnumber"));
        resSet.close();
        statmt.close();

    }
}
