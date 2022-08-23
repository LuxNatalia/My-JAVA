package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
//First level: Дан List. Необходимо найти значение элемента
// максимально близкого к некоторому заданному значению N.
//
//
//Second level: Дан список строк вида “параметр:значение”
// (например, “length:8”, “name:Jack”  и т.д).
// Используя стримы получить  map, где параметр – это ключ,
// его значение – значение. При этом, если в списке дважды
// встретился один и тот же параметр, то значения должны быть
// указаны через запятую, но без повторяющихся значений.
// Например:
// “name:Nick”,“length:8”, “name:Jack”, “length:8” ->[ name - Nick,Jack ;  size-> 8]
    public static void main(String[] args) {
      //  Дан List. Необходимо найти значение элемента
      // максимально близкого к некоторому заданному значению N.
        System.out.println("___________1______________");

	List<Integer> list=List.of(1,20,35,48,55,100,200,156,500,301,1000);
        System.out.println(list);
    Integer num=155;

    if (list!=null&&!list.isEmpty()){

        Integer nearNum = list.stream()
                .reduce(list.get(0), (diff, s) -> Math.abs(num - s) < Math.abs(num-diff) ?  s : diff);
        System.out.println("Из списка ближайшее число к "+ num+" равно " + nearNum);

    } else {
        System.out.println("null");
    }
    //Second level: Дан список строк вида “параметр:значение”
// (например, “length:8”, “name:Jack”  и т.д).
// Используя стримы получить  map, где параметр – это ключ,
// его значение – значение. При этом, если в списке дважды
// встретился один и тот же параметр, то значения должны быть
// указаны через запятую, но без повторяющихся значений.
// Например:
// “name:Nick”,“length:8”, “name:Jack”, “length:8” ->[ name - Nick,Jack ;  size-> 8]
        System.out.println("__________________2___________________");

        List<String> listStrings=List.of("name:Nick","length:8", "name:Jack", "length:8", "age:25","age:31", "name:Nick","length:12","age:40");

        if (listStrings!=null&&!list.isEmpty()){
            Map<String, String> stringStringMap = listStrings.stream()
                    //отсеять стринги, в которых нет ":"
                    //.filter() ????
                    .collect(Collectors.toMap((String s) -> s.substring(0,s.indexOf(":")), (String s) -> s.substring(s.indexOf(":")+1), (String s1, String s2) -> s1+","+s2));

            System.out.println(stringStringMap);
        }
// Сделать Map <String, Set<String>> и добавлять туда значения?????????

    }
}

