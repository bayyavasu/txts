package com.slokam.hasa;

import java.awt.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainTest {

	public static void main(String[] args) {
      Adhhar a  = new Adhhar(12345678);
      Passport p = new Passport(a);
      Person per = new Person(p);
    
      Adhhar a1  = new Adhhar(12345678);
      Passport p1 = new Passport(a);
      Person per1 = new Person(p);
      
      Adhhar a2  = new Adhhar(12345678);
      Passport p2 = new Passport(a);
      Person per2 = new Person(p);
      
      java.util.List<Person> perList = new ArrayList<>();
      perList.add(per);
      perList.add(per1);
      perList.add(per2);
      System.out.println(new Person(p).getPassport().getAdhaar().getAddNumber());
      
     //Apraoch2
      java.util.List<Person> perList2 = new ArrayList<>();
      perList2.add(new Person(new Passport(new Adhhar(123456))));
      perList2.add(new Person(new Passport(new Adhhar(123457))));
      perList2.add(new Person(new Passport(new Adhhar(123458))));
      Stream<Person> perStream = perList2.stream();
      //perStream.
   /*   for (Person person : perList2) {
		System.out.println(person.getPassport().getAdhaar().getAddNumber());
	}*/
      /*Consumer<Person> cPerson = ;*/
      perStream.forEach(p10 -> System.out.println(p10.getPassport().getAdhaar().getAddNumber()));
	}

}
