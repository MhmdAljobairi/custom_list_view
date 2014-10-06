package android01.me.customlistview.controller;

import java.util.ArrayList;

import android01.me.customlistview.model.Person;

/**
 * Created by mohammad on 06/10/14.
 */
public class Utils {


    public static ArrayList<Person> getPersons() {
        ArrayList<Person> persons = new ArrayList<Person>();
        Person person = new Person("Larry Page", "CEO of Google", "http://9to5google.files.wordpress.com/2013/05/0x600.jpg");
        persons.add(person);
        person = new Person("Sergey_Brin", "Co-founder of Google", "http://images.businessweek.com/lede/12/350x230/sergey_brin.jpg");
        persons.add(person);
        person = new Person("Bill Gates", "Founder of Microsoft", "http://images.boomsbeat.com/data/images/full/595/bill-gates-jpg.jpg");
        persons.add(person);
        person = new Person("Satya Nadella", "CEO of Microsoft", "http://www.wired.com/wp-content/uploads/blogs/wiredenterprise/wp-content/uploads/2014/01/micro-soft-story.jpg");
        persons.add(person);
        person = new Person("Stave Jobs", "Founder of Apple", "http://a5.files.biography.com/image/upload/c_fill,dpr_1.0,g_face,h_300,q_80,w_300/MTE5NDg0MDU0NTIzODQwMDE1.jpg");
        persons.add(person);
        person = new Person("Tim Cook", "CEO of Apple", "http://9to5mac.files.wordpress.com/2012/10/cook_1240x826.jpg");
        persons.add(person);
        person = new Person("Marissa Mayer", "CEO of Yahoo", "http://www.techyville.com/wp-content/uploads/2013/02/yahoo-ceo.jpg");
        persons.add(person);
        person = new Person("Mark Zuckerberg", "CEO of Faceboook", "http://images.businessweek.com/ss/09/05/0501_celebrity_twitter/image/007_facebookceo.jpg");
        persons.add(person);
        person = new Person("Mark Parker", "CEO of Nike", "http://static4.businessinsider.com/image/509ad455eab8ea9f4f000005/nikes-ceo-explains-why-reading-business-books-is-a-waste-of-time.jpg");
        persons.add(person);
        return persons;

    }

}
