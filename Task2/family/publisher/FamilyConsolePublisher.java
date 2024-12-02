/*
*   вывод генеалогического дерева на экран
*/

package family.publisher;

import family.Family;
import family.links.PersonLink;

public class FamilyConsolePublisher implements FamilyPublisher {
    public void publish(Family family) {
        for (PersonLink link : family.getPersonLinks()) {
            System.out.println(link.toString());
        }
    }
}
