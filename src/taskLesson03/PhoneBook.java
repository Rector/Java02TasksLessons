package taskLesson03;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {

    HashMap<String, HashSet<String>> directory;

    PhoneBook(){
        this.directory = new HashMap<>();
    }

    public void addNewRecord(String surname, String phone){
        HashSet<String> book = directory.getOrDefault(surname, new HashSet<>());
        book.add(phone);
        directory.put(surname, book);
    }

    public void findPhone(String surname){
        System.out.println("Contact: " + surname + " Phone number " + directory.getOrDefault(surname, new HashSet<>()));
    }

    public void findEmail(){

    }

}
