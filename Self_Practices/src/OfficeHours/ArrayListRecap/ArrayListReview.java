package OfficeHours.ArrayListRecap;
/*
array: fixed size--supports primitive or non primitive
Collection: dynamic size (add, remove)--only supports non primitives

Array List:
add
addAll(collection type)

remove
removeAll
retainAll
removeIf
clear()

set()

 */

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListReview {
    public static void main(String[] args) {

        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        System.out.println(list1);

        int[] nums1 = {80,90,100};
        Integer[] nums2 = {80,90,100};

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.addAll(list1); // adds list1 to list2
        list2.addAll(Arrays.asList(50,60,70)); // adds these numbers to list 2
        // list2.addAll(Arrays.asList(nums1));  // Collection does not support primitives (int)

        list2.addAll(Arrays.asList(nums2)); // adds 80,90,100 to array list-list2


        System.out.println(list2);

        // list2.remove(8); // removes index 8 from list2


        //list2.remove( new Integer(90));
        //list2.remove( new Integer(30));
        //list2.remove( new Integer(70));

        list2.removeAll(Arrays.asList(30,70,90));

        list2.removeIf( p -> p > 50 );


        System.out.println(list2);


        list2.addAll( Arrays.asList(100,200,300,100,100,100));

        System.out.println(list2);

        list2.retainAll(Arrays.asList(100,200,300)); // only keeps these numbers in list2

        System.out.println(list2);

        System.out.println("size: "+list2.size());

        list2.clear(); // removes everything from the list

        System.out.println(list2);
        System.out.println(list2.isEmpty()); // true or false
        System.out.println("Size: "+list2.size());

        System.out.println("===================================================");

        ArrayList<Integer>list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));

        // list3.set(list3.size()-1, 30);
        for(int i = 0; i<=list3.size()-1; i++){

            Integer each = list3.get(i);

            if(each % 2 !=0){
                list3.set(i,each * 2);
            }else{
                list3.set(i,each*3);
            }

        }

        System.out.println(list3);

        System.out.println("===================================================");

        ArrayList<String>countries = new ArrayList<>();
        countries.addAll(Arrays.asList("America", "England", "Australia", "New Zealand", "Russia", "Canada"));

        // countries.removeIf(c -> c.endsWith("a")); (one way of doing this)

        countries.removeIf( c->c.charAt(c.length()-1)=='a');

        System.out.println(countries);








    }
}
