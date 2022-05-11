package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
       Dog dog=context.getBean("dog", Dog.class);
        System.out.println("Name: "+dog.getName());
        System.out.println("Age: "+dog.getAge());
        System.out.println("Color: "+dog.getColor());
        System.out.println("Species: "+dog.getSpecies());
        Person person=context.getBean("person", Person.class);
        System.out.println("Information about person: ");
        System.out.println("Name: "+person.getName());
        System.out.println("Age: "+person.getAge());
        System.out.println("Dog: "+person.getDog());


    }
}
