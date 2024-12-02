/*
*   Интерфейс загрузки списка персон из файлов разного формата
*/

 package Tasks.Load;


import java.io.IOException;
import java.util.List;
import Tasks.Person;

public interface LoadPersons {
    public List<Person> loadPerson() throws IOException;
}
