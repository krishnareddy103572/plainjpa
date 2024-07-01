package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "JPA program started" );

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        Person p = new Person();
//        p.setId(123);
//        p.setName("damal");
//        p.setCity("delhi");
//
//        em.getTransaction().begin();
//        em.persist(p);
//        em.getTransaction().commit();
//        System.out.println("Saving the details of.."+p);


        Person person = em.find(Person.class,123);



       // System.out.println(person);
        em.getTransaction().begin();
        em.remove(person);
        em.getTransaction().commit();
        System.out.println("deleted db row  "+person);

    }
}
