/*
*   основной класс для запуска всего
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Tasks.Person;
import Tasks.Task;
import Tasks.Load.LoadPersonsCsv;
import Tasks.Load.LoadTasksCsv;
import Tasks.Publish.PublishTasksConsole;
import Tasks.Save.SavePersonsCsv;
import Tasks.Save.SaveTasksCsv;


public class Main {
    private static Scanner input = new Scanner(System.in, "Cp866");

    public static void main(String[] args) throws IOException {
        List<Person> persons = new ArrayList<>();
        List<Task> tasks = new ArrayList<>();

        //создаём меню и его обработку
        boolean stopWhile = true;
        while (stopWhile){
            System.out.println(menu());
            int whatDo = input.nextInt();
            switch(whatDo) {
            case 1: 
                persons = new LoadPersonsCsv().loadPerson();
                tasks = new LoadTasksCsv().loadTask();
                break;
            case 2: 
                new PublishTasksConsole().publishTasks( tasks, persons);
                break;
            case 3: 
                new SaveTasksCsv().saveTasks(tasks);
                new SavePersonsCsv().savePerson(persons);
                break;
            case 4: 
                System.out.println((char) 27 + "[33m До свидания."+ (char)27 + "[0m");
                stopWhile = false;
                break;
            default:
                System.out.println((char) 27 + "[31mНет такого пункта меню!"+ (char)27 + "[0m");
            }
        }    
    }

    // создаём меню 
    private static String menu() {
        String menuStr = new StringBuilder()
        .append((char) 27 + "[34m\nВыберите действие: \n"+ (char)27 + "[0m")
        .append("1 - Загрузить дела из файла \n")
        .append("2 - Посмотреть все дела \n")
        .append("3 - Сохранить список дел и персон в файлы \n")                
        .append("4 - Выход ")
        .toString();

        return menuStr;    
    }

}