import javax.swing.*;
import java.util.*;
import java.io.*;

class Person {
    String name;
    String address;
    String PhoneNo;

    public Person(String n, String a, String p) {
        name = n;
        address = a;
        PhoneNo = p;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhoneNo: " + PhoneNo;
    }
}

class AddressBook {
    ArrayList<Person> persons;

    public AddressBook() {
        persons = new ArrayList<Person>();
        loadperson();
    }

    public void addPerson() {
        String name = JOptionPane.showInputDialog(" Enter Name");
        String address = JOptionPane.showInputDialog(" Enter Address");
        String PhoneNo = JOptionPane.showInputDialog(" Enter PhoneNo");
        Person p = new Person(name, address, PhoneNo);
        persons.add(p);
    }

    public void searchPerson(String search) {
        int size = persons.size();
        for (int i = 0; i < size; i++) {
            Person p = persons.get(i);
            if (search.equals(p.name)) {
                System.out.println(p.toString());
            }
        }
    }

    public void deletePerson(String search) {
        int size = persons.size();
        for (int i = 0; i < size; i++) {
            Person p = persons.get(i);
            if (search.equals(p.name)) {
                persons.remove(p);
                break;
            }
        }
    }

    public void replacePerson(Person person1) {
        int size = persons.size();
        for (int i = 0; i < size; i++) {
            Person p = persons.get(i);
            if (person1.name.equals(p.name)) {
                persons.set(i, person1);
                break;
            }
        }
    }

    public void savepersons(){
        try{ 
            String line;
            FileWriter fw= new FileWriter( "person.txt");
            PrintWriter pw= new PrintWriter(fw);
           
            for(int i=0; i<persons.size(); i++){
                Person p = persons.get(i);
                line= p.name ; 
                line += " " + p.address;
                line += " " + p.PhoneNo;
                pw.println(line);
            }
            pw.flush();
            pw.close();
            fw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void loadperson(){
        String token[]=null;
        String name, add, ph;
        try{
            FileReader fr= new FileReader("person.txt");
            BufferedReader br = new BufferedReader(fr);
            String Line= br.readLine();
            while(Line != null){
                token = Line.split(", ");
                name = token[0];
                add = token[1];
                ph = token[2];
                Person p = new Person(name, add, ph);
                persons.add(p);
                Line = br.readLine();
                br.close();
                fr.close();
            }}
             catch (Exception e) {
                System.err.println(" ios exception");
            }
        }
    }


public class Test {
    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        int input;
        String s;
        while (true) {
            input = Integer.parseInt(JOptionPane.showInputDialog(" Enter option 1, 2, 3, 4, 5 for exit"));
            switch (input) {
                case 1:
                    ab.addPerson();
                    break;
                case 2:
                    s = JOptionPane.showInputDialog(" Enter name for delete");
                    ab.deletePerson(s);
                    break;
                case 3:
                    s = JOptionPane.showInputDialog(" Enter name for replace");
                    Person person1 = new Person(s, "", "");
                    ab.replacePerson(person1);
                    break;
                case 4:
                    s = JOptionPane.showInputDialog(" Enter name for search");
                    ab.searchPerson(s);
                    break;
                case 5:
                    ab.savepersons();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}