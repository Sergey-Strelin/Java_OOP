/*
*   Интерфейс сохранения списка персон в файлы разных форматов
*/

package Tasks.Save;

import java.io.IOException;
import java.util.List;
import Tasks.Person;

public interface SavePersons {
    public void savePerson(List<Person> persons) throws IOException;
    
}
