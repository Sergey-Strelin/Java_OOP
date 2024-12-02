/*
*   Модуль вывода списка задач на экран
*/

package Tasks.Publish;

import java.util.List;
import Tasks.Person;
import Tasks.Task;

public class PublishTasksConsole implements Publish {

    @Override
    public void publishTasks(List<Task> tasks, List<Person> persons) {
        System.out.println((char) 27 + "[35mСписок задач:"+ (char)27 + "[0m");
        for (Task task: tasks){
            String personFio = persons.stream().filter(x -> x.getIdPerson().equals(task.getIdPerson())).findFirst().get().getFioPerson();
            System.out.printf(
                "ИД задачи: %d, день: %S, время начала: %s, Задача: %-30s, приоритет: %-10s, Исполнитель: %-30s \n",
                task.getIdTask(), task.getDateAddTask(), task.getTimeAddTask(), task.getNoteTask(), task.getPriority(), personFio
            );
                    
        }

       
    }

    
    
}
