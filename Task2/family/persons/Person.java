/*
*   класс персона
*/


package family.persons;

import java.time.LocalDate;

public class Person {
    private long id;
    private String firstName;
    private String secondName;
    private LocalDate dateBirthday;
    private PersonSex sex;

    
    public Person(long id, String secondName, String firstName, LocalDate dateBirthday, PersonSex sex) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateBirthday = dateBirthday;
        this.sex = sex;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "фамилия: " + getSecondName() +
                ", имя: " + getFirstName() +
                ", день рождения: " + getDateBirthday() +
                ", пол: " + getSex().getStringValue();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getDateBirthday() {
        return this.dateBirthday;
    }

    public void setDateBirthday(LocalDate dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public PersonSex getSex() {
        return this.sex;
    }

    public void setSex(PersonSex sex) {
        this.sex = sex;
    }


}