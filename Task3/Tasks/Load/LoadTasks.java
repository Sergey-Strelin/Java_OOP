/*
*   Интерфейс загрузки списка задач из файлов разных форматов
*/

package Tasks.Load;

import java.io.IOException;
import java.util.List;
import Tasks.Task;

public interface LoadTasks {
    public List<Task> loadTask() throws IOException;
}
