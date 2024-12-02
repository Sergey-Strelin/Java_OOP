/*
*   Модуль загрузки списка персон из файла формата CSV
*/

package Tasks.Load;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Tasks.Person;

public class LoadPersonsCsv implements LoadPersons {

    //@Override
    public List<Person> loadPerson() throws IOException {
        List<Person> persons = new ArrayList<>();
        String csvFile = "persons.csv";
        BufferedReader csvReader = new BufferedReader(new FileReader(csvFile)); 
        String[] data = null;
        String row = "";
        while ((row = csvReader.readLine()) != null) { 
            data = row.split(","); 
            persons.add(new Person(Integer.parseInt(data[0]),data[1]));
        } 
        csvReader.close(); 
        System.out.println((char) 27 + "[32mСписок персон загружен!"+ (char)27 + "[0m");
       
        return persons;
        
    }
    
}
