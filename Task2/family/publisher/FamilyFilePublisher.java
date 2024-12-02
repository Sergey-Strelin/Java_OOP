/*
*   согранение генеалогического дерева в файл
*/

package family.publisher;

import family.Family;
import family.links.PersonLink;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public final class FamilyFilePublisher implements FamilyPublisher {
    private final File file;

    public FamilyFilePublisher(File file) {
        this.file = file;
    }

    public void publish(Family family) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (PersonLink link : family.getPersonLinks()) {
                writer.write(link.toString());
                writer.newLine();
            }

            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
