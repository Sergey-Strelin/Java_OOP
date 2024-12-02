/*
*   пол персоны
*/

package family.persons;

public enum PersonSex {
    MALE("мужской"),
    FEMALE("женский");

    private final String sexString;

    PersonSex(String sexString) {
        this.sexString = sexString;
    }

    public String getStringValue() {
        return sexString;
    }
}
