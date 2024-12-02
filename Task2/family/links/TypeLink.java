/*
*   типы родственников
*/

package family.links;

public enum TypeLink {
    SPOUSE("cупруг(а)"),
    FATHER("папа"),
    MOTHER("мама"),
    SON("cын"),
    DAUGHTER("дочь"),
    SISTER("сестра"),
    BROTHER("брат"),
    GRANDMOTHER("бабушка"),
    GRANDFATHER("дедушка"),
    GRANDSON("внук"),
    GRANDDAUGHTER("внучка"),
    UNCLE("дядя"),
    AUNT("тетя"),
    NIECE("племянница"),
    NEPHEW("племянник");

    private final String title;

    TypeLink(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }


}
