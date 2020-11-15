package day35_ArrayList;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> goodStudent = new ArrayList<>();
        goodStudent.add("Ibrahim");
        goodStudent.add("Virginia");
        goodStudent.add("Ziiadin");
        goodStudent.add("Erfan");
        goodStudent.add("Aalia");

        goodStudent.set(2,"Aslan");
        goodStudent.set(0,"Lan");


        System.out.println(goodStudent);

        System.out.println("================================");

        goodStudent.clear();
        System.out.println(goodStudent);

        System.out.println("===================================");
        // REMOVE (INT)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);  // index number: 0
        list.add(2);  // index number: 1
        list.add(3);  // index number: 2
        list.add(4);  // index number: 3
        list.add(5);  // index number: 4

        list.remove(2); // result: [1,2,4,5]
        list.remove(3); // result [1,2,4]
        System.out.println(list);

        System.out.println("=================================");


        //REMOVE  NON-PRIMITIVE

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);  // index number: 0
        list2.add(2);  // index number: 1
        list2.add(3);  // index number: 2
        list2.add(4);  // index number: 3
        list2.add(5);  // index number: 4

        // int a = 1; // [1,3,4,5]
        Integer a = 1;
        list2.remove(a);

        System.out.println(list2); // result: [2,3,4,5]

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Hamit"); // 0
        list3.add("Bulnet"); //1
        list3.add("Viorel");  //2
        list3.add("Musa");  //3

        list3.remove(list3);





    }
}
