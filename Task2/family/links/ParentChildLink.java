/*
*   класс связь типа Родитель - ребёнок
*/

package family.links;

import family.persons.Person;
import family.persons.PersonSex;

public final class ParentChildLink extends PersonLink {

    public ParentChildLink(Person parent, Person child) {
        this.firstPerson = parent;
        this.secondPerson = child;
    }

    public Person getParent() {
        return firstPerson;
    }

    public Person getChild() {
        return secondPerson;
    }

    @Override
    public String toString() {
        String parentTypeString = getParent().getSex() == PersonSex.MALE ? "Папа" : "Мама";
        String childrenTypeString = getChild().getSex() == PersonSex.MALE ? "сын" : "дочь";

        return parentTypeString + ": " + getParent().toString() + ". " + childrenTypeString +": " + getChild().toString();
    }
}
