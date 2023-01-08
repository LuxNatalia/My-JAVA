package org.telran.maven.project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.telran.maven.project.controller.UserController;
import org.telran.maven.project.model.User;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("org.telran.maven.project"); // запускаем спринг (адрес пакета, где искать)

       // User user = context.getBean(User.class);//параметр - либо имя (обычно это имя класса с маленькой буквы), либо тип (наименование класса.class)

        //User user=new User(); //если без спринга

        UserController userController = context.getBean(UserController.class); //без спринга
        User user = userController.getUser(); // без спринга
        user.setName("Alex");
        System.out.println(user);

    }
}
