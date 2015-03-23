
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Person implements Comparable<Person>
{
    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    public static void main( String[] args)
    {
        Person lowPerson = new Person("Michael Chen");
        ArrayList<Person> list = new ArrayList<Person>();
        Scanner scanning = new Scanner(System.in);
        System.out.println("We will have you create 10 people. Enter their names.");

        for( int i = 0; i< 10; i++ )
        {
            System.out.println( "Name: " );
            String nam = scanning.next();            
            Person person = new Person(nam);
            list.add(person);
        }   
        for( int x = 1; x < list.size(); x++ )
        {
            if(people[x].comapareTo(first) > 0 )
            {
                first = people[x];
            }
        }
    }

    public int compareTo(Person other)
    {
        Person otherPerson = (Person) other;
        String myName = this.name;
        String otherName = otherPerson.name;
        //         if(this.name.compareTo(otherPerson.name) == 0)
        //         {
        //             return 0;
        //         }
        //         else if(this.name.compareTo(otherPerson.name) >0)
        //         {
        //             return 1;
        //         }
        //         else
        //         {
        //             return -1;
        //         }
        return myName.compareTo(otherName);
    }   
}
