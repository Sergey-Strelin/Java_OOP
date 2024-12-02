/*
*   основной класс - семья и работа с ним
*/

package family;

import family.links.ParentChildLink;
import family.links.PersonLink;
import family.links.SpouseLink;
import family.persons.Person;

import java.util.ArrayList;
import java.util.List;


public class Family {
    private final ArrayList<PersonLink> links = new ArrayList<>();

    // добавление связи один родитель - ребёнок
    public Family addParentChildLink(Person parent, Person child) {

        links.add(new ParentChildLink(parent, child));

        return this;
    }

    // добавление связи два родителя - ребёнок
    public Family addParentChildLink(Person firstParent, Person secondParent, Person... children) {

        for (Person child : children) {
            addParentChildLink(firstParent, child).addParentChildLink(secondParent, child);
        }

        return this;
    }

    // добавление связи муж - жена
    public Family addSpouse(Person husband, Person wife) {

        links.add(new SpouseLink(husband, wife));

        return this;
    }

    // возвращаем весь список связей
    public List<PersonLink> getPersonLinks() {
        return this.links;
    }


}
