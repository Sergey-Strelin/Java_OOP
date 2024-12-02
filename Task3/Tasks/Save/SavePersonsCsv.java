/*
*   Модуль сохранения в файл формата CSV списка персон
*/
package Tasks.Save;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import Tasks.Person;

public class SavePersonsCsv implements SavePersons{

    @Override
    public void savePerson(List<Person> persons) throws IOException {
        FileWriter csvWriter = new FileWriter("SavePersons.csv");
        for (Person rowData : persons) { 
            csvWriter.append(String.join(",", rowData.toString())); 
            
            } 
        csvWriter.flush(); 
        csvWriter.close(); 
        System.out.println((char) 27 + "[32mСписок персон сохранён в файл SavePersons.csv"+ (char)27 + "[0m");
    }
    
}
