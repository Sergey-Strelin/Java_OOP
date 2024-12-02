/*
*   Модуль загрузки списка задач из файла формата CSV
*/

package Tasks.Load;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import Tasks.PriorityType;
import Tasks.Task;

public class LoadTasksCsv implements LoadTasks {

    @Override
    public List<Task> loadTask() throws IOException{
        List<Task> tasks = new ArrayList<>();
        String csvFile = "tasks.csv";
        BufferedReader csvReader = new BufferedReader(new FileReader(csvFile)); 
        String[] data = null;
        String row = "";
        while ((row = csvReader.readLine()) != null) { 
            data = row.split(","); 
            tasks.add(new Task(Integer.parseInt(data[0]), LocalDate.parse(data[1]), LocalTime.parse(data[2]), data[3], PriorityType.valueOf(data[4]), Integer.parseInt(data[5])));
        } 
        csvReader.close(); 
        System.out.println((char) 27 + "[32mСписок задач загружен!"+ (char)27 + "[0m");
       
        return tasks;        

    }
    
}
