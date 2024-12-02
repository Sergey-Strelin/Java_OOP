/*
*       заглушка сбора семьи родитель - ребёнок ... 
*       надо сделать в более общем виде и прикрутить дерево
*/

package family;

import family.persons.DefaultPersons;

public final class DefaultFamilies {
    public static final Family IVANOVS = new Family()
            .addSpouse(DefaultPersons.IvanovIvan, DefaultPersons.IvanovaMaria)
            .addParentChildLink(DefaultPersons.IvanovIvan, DefaultPersons.IvanovaMaria, DefaultPersons.IvanovSergey);
    public static final Family PETROVS = new Family()
            .addSpouse(DefaultPersons.PetrovSergey, DefaultPersons.PetrovaNatalia)
            .addParentChildLink(DefaultPersons.PetrovSergey, DefaultPersons.PetrovaNatalia, DefaultPersons.PetrovaMaria, DefaultPersons.PetrovIvan);

    private DefaultFamilies() {
     
    }
}
