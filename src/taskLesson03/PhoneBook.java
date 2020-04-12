package taskLesson03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, ArrayList<String>> directory;

    PhoneBook(){
        this.directory = new HashMap<>();
    }

    public void addNewRecord(String surname, String phone){
        ArrayList<String> phoneList = directory.get(surname);
        if (phoneList == null) {
            phoneList = new ArrayList<>();
        }
        phoneList.add(phone);
        directory.put(surname, phoneList);
    }

    public void findPhone(String surname){
        System.out.println("Surname: " + surname + " | Phone number: " + directory.getOrDefault(surname, new ArrayList<>()));
    }

}
