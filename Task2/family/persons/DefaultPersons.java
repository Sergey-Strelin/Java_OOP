/*
* Класс для заполнения списка персон
*/

package family.persons;

import java.time.LocalDate;

public final class DefaultPersons {
    private static long lastId = 0;
    public static Person IvanovIvan = new Person(getId(), "Иванов", "Иван", LocalDate.of(1987, 6, 20), PersonSex.MALE);
    public static Person PetrovSergey = new Person(getId(), "Петров", "Сергей", LocalDate.of(1979, 12, 2), PersonSex.MALE);
    public static Person IvanovaMaria = new Person(getId(), "Иванова", "Марья", LocalDate.of(1988, 9, 15), PersonSex.FEMALE);
    public static Person PetrovIvan = new Person(getId(), "Петров", "Иван", LocalDate.of(2004, 5, 6), PersonSex.MALE);
    public static Person PetrovaNatalia = new Person(getId(), "Петрова", "Наталья", LocalDate.of(1984, 1, 16), PersonSex.MALE);
    public static Person IvanovSergey = new Person(getId(), "Иванов", "Сергей", LocalDate.of(2005, 8, 30), PersonSex.MALE);
    public static Person PetrovaMaria = new Person(getId(), "Петрова", "Марья", LocalDate.of(2008, 3, 12), PersonSex.FEMALE);
    private DefaultPersons() {
        
    }

    private static long getId() {
        lastId++;
        return lastId;
    }
}
