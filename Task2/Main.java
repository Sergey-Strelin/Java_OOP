/*
*   основной класс main
*   функционал - минимальный, только для проверки сделанного
*   надо добавить меню
*/


import family.DefaultFamilies;
import family.publisher.FamilyConsolePublisher;
import family.publisher.FamilyFilePublisher;
import family.publisher.FamilyPublisher;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // выводит на экран
        FamilyPublisher familyPublisher = new FamilyConsolePublisher();

        familyPublisher.publish(DefaultFamilies.IVANOVS);
        familyPublisher.publish(DefaultFamilies.PETROVS);


        //выводим в файл
        File ivanovFile = new File("ivanovFamily.txt");
        ivanovFile.createNewFile();
        File petrovFile = new File("petrovFamily.txt");
        petrovFile.createNewFile();

        new FamilyFilePublisher(ivanovFile).publish(DefaultFamilies.IVANOVS);
        new FamilyFilePublisher(petrovFile).publish(DefaultFamilies.PETROVS);
    }
}