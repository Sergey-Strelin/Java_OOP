/*
*   Интерфейс вывода списка задач (на экран, на принтер) 
*/

package Tasks.Publish;

import java.util.List;

import Tasks.Person;
import Tasks.Task;

public interface Publish {
    public void publishTasks(List<Task> tasks, List<Person> persons);
}
