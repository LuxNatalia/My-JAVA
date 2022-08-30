package com.company;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    /***
     *  1. Есть класс Task {int id, String title, int priority, String status}
     *  и  класс Performer {String name, String city, Task task}.
     *  Дан List< Performer>.  Для всех задач, исполнители которых из Берлина,
     *  необходимо получить мапу, где ключом является id задачи,
     *  а значением title данной задачи.
     *
     *  2. Дан список Task {int id, String title, int priority, String status}.
     *  Необходимо получить мапу, где ключом является приоритет, а значением
     *  список не завершенных (статус завершенной задачи - «done»)  задач,
     *  данного приоритета.
     */
    public static void main(String[] args) {
        Task task1 = new Task(1, "build", 2, "new");
        Task task2 = new Task(2, "calculate", 1, "in prozess");
        Task task3 = new Task(3, "find", 2, "done");
        Task task4 = new Task(4, "build", 1, "in prozess");
        Task task5 = new Task(5, "calculate", 2, "new");
        Task task6 = new Task(6, "calculate", 1, "done");
        Task task7 = new Task(7, "find", 2, "done");

        Performer p1 = new Performer("Serge", "Bonn", task1);
        Performer p2 = new Performer("Eugen", "Berlin", task5);
        Performer p3 = new Performer("Jan", "Berlin", task6);
        Performer p4 = new Performer("Lena", "Berlin", task4);
        Performer p5 = new Performer("Nick", "Berlin", task2);
        Performer p6 = new Performer("Olga", "Regensburg", task4);
        Performer p7 = new Performer("Alex", "Frankfurt", task5);
        Performer p8 = new Performer("James", "Berlin", task2);
        Performer p9 = new Performer("Sarah", "Regensburg", task4);
        Performer p10 = new Performer("Alexis", "Frankfurt", task3);
        Performer p11 = new Performer("Pierre", "Bonn", task1);
        Performer p12 = new Performer("Nina", "Berlin", task7);
        Performer p13 = new Performer("Boris", "Berlin", task6);
        Performer p14 = new Performer("Jury", "Berlin", task7);


        List<Performer> list = List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14);
        System.out.println("--------------- 1 ----------------");
        System.out.println(performersFromBerlin(list));

        List<Task> listTasks = List.of(task1, task2, task3, task4, task5, task6, task7);
        System.out.println("--------------- 2 ----------------");
        System.out.println(unfinishedTasks(listTasks));


    }
    /***
     *  1. Есть класс Task {int id, String title, int priority, String status}
     *  и  класс Performer {String name, String city, Task task}.
     *  Дан List< Performer>.  Для всех задач, исполнители которых из Берлина,
     *  необходимо получить мапу, где ключом является id задачи,
     *  а значением title данной задачи.
     *  */

    private static Map<Integer, String> performersFromBerlin(List<Performer> list) {
        if (list != null && !list.isEmpty()) {
            Map<Integer, String> idTitleMap = list.stream()
                    .filter(p -> p != null)
                    .filter(p -> p.getCity() == "Berlin")
                    .peek(p -> System.out.println(p))
                    .collect(Collectors.toMap(p -> p.getTask().getId(), p -> p.getTask().getTitle(), (p1, p2) -> p1));

            return idTitleMap;
        } else {
            return null;
        }
    }
    /***
    * 2. Дан список Task {int id, String title, int priority, String status}.
     *  Необходимо получить мапу, где ключом является приоритет, а значением
     *  список не завершенных (статус завершенной задачи - «done»)  задач,
     *  данного приоритета.
     */
    private static Map<Integer, List<Task>> unfinishedTasks(List<Task> listTasks) {

        if (listTasks != null && !listTasks.isEmpty()) {

            Map<Integer, List<Task>> mapTasks = listTasks.stream()
                    .filter(p -> p != null)
                    .filter(p -> p.getStatus() != "done")
                    .collect(Collectors.groupingBy(Task::getPriority));

            return mapTasks;
        } else {
            return null;
        }
    }
}
