/*
*   Модуль сохранения в файл формата CSV списка задач
*/
package Tasks.Save;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import Tasks.Task;

public class SaveTasksCsv implements SaveTasks{

    @Override
    public void saveTasks(List<Task> tasks) throws IOException {
        FileWriter csvWriter = new FileWriter("TasksSave.csv");
        for (Task rowData : tasks) { 
            csvWriter.append(String.join(",", rowData.toString())); 
            
            } 
        csvWriter.flush(); 
        csvWriter.close(); 
        System.out.println((char) 27 + "[32mСписок задач сохранён в файл TasksSave.csv"+ (char)27 + "[0m");
        }
    
}
