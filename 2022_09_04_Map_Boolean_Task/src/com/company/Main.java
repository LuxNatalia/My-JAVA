package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    /**1. Дана мапа <Person, List<Task>> }.
     * Необходимо получить мапу <Boolean, Task>, где все не завершенные задачи будут относиться к ключу false,
     * а все завершенные к ключу true. Задачи со статусом “canceled” не должны учитываться.

*/
public static void main(String[] args) {
    Task task1 = new Task(1, "build", "new");
    Task task2 = new Task(2, "calculate", "canceled");
    Task task3 = new Task(3, "find", "done");
    Task task4 = new Task(4, "find","in prozess");
    Task task5 = new Task(5, "calculate", "new");
    Task task6 = new Task(6, "calculate", "done");
    Task task7 = new Task(7, "build", "done");
    Task task8 = new Task(8, "build", "canceled");
    Task task9 = new Task(9, "calculate",  "canceled");
    Task task10 = new Task(10, "find",  "done");
    Task task11 = new Task(11, "calculate", "in prozess");
    Task task12 = new Task(12, "calculate", "canceled");
    Task task13 = new Task(13, "calculate", "done");
    Task task14 = new Task(14, "find",  "done");

    Person p1 = new Person("Serge", "Bonn");
    Person p2 = new Person("Eugen", "Berlin");
    Person p3 = new Person("Jan", "Berlin");
    Person p4 = new Person("Lena", "Berlin");
    Person p5 = new Person("Nick", "Berlin");
    Person p6 = new Person("Olga", "Regensburg");
    Person p7 = new Person("Alex", "Frankfurt");
    Person p8 = new Person("James", "Berlin");
    Person p9 = new Person("Sarah", "Regensburg");
    Person p10 = new Person("Alexis", "Frankfurt");
    Person p11 = new Person("Pierre", "Bonn");
    Person p12 = new Person("Nina", "Berlin");
    Person p13 = new Person("Boris", "Berlin");
    Person p14 = new Person("Jury", "Berlin");

    Map<Person, List<Task>> mapPersonTasks=new HashMap();
    mapPersonTasks.put(p1, List.of(task1, task2,task3));
    mapPersonTasks.put(p2, List.of(task1));
    mapPersonTasks.put(p3, List.of(task4, task5));
    mapPersonTasks.put(p4, List.of(task1, task2, task7, task8));
    mapPersonTasks.put(p5, List.of(task8, task9,task10));
    mapPersonTasks.put(p6, List.of(task11));
    mapPersonTasks.put(p7, List.of(task4, task12,task13));
    mapPersonTasks.put(p8, List.of(task12, task13, task7, task14));
    mapPersonTasks.put(p9, List.of(task5, task6,task13));
    mapPersonTasks.put(p10, List.of(task9));
    mapPersonTasks.put(p11, List.of(task13, task14));
    mapPersonTasks.put(p12, List.of(task4, task12, task6, task1));
    mapPersonTasks.put(p13, List.of(task10));
    mapPersonTasks.put(p14, List.of(task3, task11));

    isTasksDone(mapPersonTasks);


}

    private static void isTasksDone(Map<Person, List<Task>> mapPersonTasks) {
        Map<Boolean, List<Task>> mapIsDoneTasks = mapPersonTasks.values().stream()
                .flatMap(p -> p.stream())
                .distinct()
                .filter(p -> p.getStatus() != "canceled")
                .map(p->{if (p.getStatus()!="done"){p.setTaskDone(false);return p;
                }else {p.setTaskDone(true);}return p;})
                .peek(p-> System.out.println(p))
                .collect(Collectors.groupingBy(Task::isTaskDone));

        System.out.println(mapIsDoneTasks);
    }
}
