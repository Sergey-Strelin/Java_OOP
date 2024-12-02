/*
*   Класс персоны
*/

package Tasks;

public class Person {
    private Integer idPerson;
    private String fioPerson;


    public Person(Integer idPerson, String fioPerson) {
        this.idPerson = idPerson;
        this.fioPerson = fioPerson;
    }

    public Integer getIdPerson() {
        return this.idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public String getFioPerson() {
        return this.fioPerson;
    }

    public void setFioPerson(String fioPerson) {
        this.fioPerson = fioPerson;
    }


    @Override
    public String toString() {
        return idPerson + "," + getFioPerson() + "\n";
    }

}
