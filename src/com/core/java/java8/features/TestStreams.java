package com.core.java.java8.features;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreams {
    public static void main(String[] args) {
        TestStreams t=new TestStreams();
       t.getStudentData();
        //t.func();
    }

    public  void m1(){

        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        for(int i = 1; i< list.size(); i++){
          Integer ii=  list.get(i);
        }     /*   Stream<Integer> stream = list.stream();
        Optional o=stream.findFirst();
        if(o.isPresent())
        System.out.println(o.get());*/
      List filterList =list.stream().filter(i->i%2==0).collect(Collectors.toList());
       /* for (Object i:list
             ) {
            System.out.println(i);
        }*/
        System.out.println(list);
        System.out.println(filterList);



    }

    void m2(){
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
       Map hm= memberNames.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println(hm);
       /*memberNames.stream().filter((s) -> s.startsWith("A") && s.length()>5)
                .forEach(System.out::println);*/
       //System.out.println(memberNames.stream().distinct().count());
        // .forEach(System.out::println);
        /*long totalMatched = memberNames.stream()
                .filter((s) -> s.startsWith("A"))
                .count();
    System.out.println(totalMatched);*/
      /*  memberNames.stream().filter((s) -> s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);*/

        boolean matched = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));

        String firstMatchedName = memberNames.stream()
                .filter((s) -> s.startsWith("L"))
                .findFirst()
                .get();

        //Merging Lists into a Single List
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

        List<Integer> listOfAllIntegers = listOfLists.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        System.out.println(listOfAllIntegers);
    }

    void m4(){
        List<String> names = new ArrayList<String>();
        names.add("Ajeet");
        names.add("Negan");
        names.add("Aditya");
        names.add("Steve");
        int count = 0;
        for (String str : names) {
            if (str.length() < 6)
                count++;
        }
        System.out.println("There are "+count+" strings with length less than 6");

      /*  long count = names.stream().filter(str->str.length()<6).count();
        System.out.println("There are "+count+" strings with length less than 6");*/
    }
    void m5(){
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "A");
        hmap.put(2, "B");
        hmap.put(3, "C");
        hmap.put(4, "D");
        hmap.put(5, "E");
        hmap.put(6, "F");
        hmap.forEach((key,value)->System.out.println(key+" - "+value));

        hmap.forEach((key,value)->{
            if(key == 4){
                System.out.println(" key 4 is: "+value);
            }
        });

        hmap.forEach((key,value)->{
            if("C".equals(value)){
                System.out.println("Key Value Cat is: "+key);
            }
        });
    }

    public void m6(){

        /*String nullName = null;
        String name = Optional.ofNullable(nullName).orElseGet(() -> "john");

        String text = null;

        String defaultText = Optional.ofNullable(text).orElseGet(this::getMyDefault);

        defaultText = Optional.ofNullable(text).orElse(getMyDefault());

        System.out.println(defaultText);*/
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Venkat");
        memberNames.add("vEnkat");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

       List ll= memberNames.stream().filter(s->s.equalsIgnoreCase("venkat")).collect(Collectors.toList());
       //List l= memberNames.stream().filter(s->s.equalsIgnoreCase("venkat")).collect(Collectors.toList());
      // System.out.println(l.get(1));
      // l.stream().forEach(System.out::println);

    }
    public String getMyDefault() {
        System.out.println("Getting Default Value");
        return "Default Value";
    }

    public static void getStudentData(){
        ArrayList<Student> arl=new ArrayList();
        arl.add(new Student("B",101)); //arl.add(studentobject)
        arl.add(new Student("A",102)); //arl.add(another studentobj)
        arl.add(new Student("D",103));
        arl.add(new Student("C",104));
        arl.stream()
                .forEach(student -> {
            System.out.println(student);
        });
       arl.sort(Comparator.comparing(Student::getStudentName));
       System.out.println(arl);
       System.out.println( arl.stream().sorted(Comparator.comparing(Student::getStudentName)).collect(Collectors.toList()));
      System.out.println("---"+arl.stream().filter(x->x.getStudentName().equals("A")).flatMap(student -> arl.stream()).collect(Collectors.toList()));
       new Thread(()->System.out.println("welcome")).start();
    }

    public static void m8(){
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<10;i++){
            li.add(i);
        }
        li.stream().filter(
                (x)->{
                    return x.equals(3) || x.equals(5);
                }).forEach(y->System.out.println(y));
    }

    public static void m9(){
        String s = "HelloWorld";
        Map<Character, Integer> mobj = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            if (mobj.containsKey(s.charAt(i))) {
                int count=mobj.get(s.charAt(i));
                mobj.put(s.charAt(i), ++count);
            } else {
                mobj.put(s.charAt(i), 1);
            }
        }
        System.out.println(mobj);
    }
    public void func(){
        Function<String,Integer> func= (str) -> {
          Integer i=  str.length();
          return i;
        };
    }
}





