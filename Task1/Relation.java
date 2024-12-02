public class Relation {
/*
* Класс - события, 
* idPerson - идентификатор персоны
* idFather - идентификатор папы
* idMother - идентификатор мамы
*/


    private int idPerson;
    private int idFather;
    private int idMother;


    public Relation(int idPerson, int idFather, int idMother) {
        this.idPerson = idPerson;
        this.idFather = idFather;
        this.idMother = idMother;

    }


    public int getIdPerson() {
        return this.idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public int getIdFather() {
        return this.idFather;
    }

    public void setIdFather(int idFather) {
        this.idFather = idFather;
    }

    public int getIdMother() {
        return this.idMother;
    }

    public void setIdMother(int idMother) {
        this.idMother = idMother;
    }

    @Override
    public String toString() {
        // arr.add(idPerson);
        // arr.add(idFather);
        // arr.add(idMother);
        return idPerson+","+ idFather+","+idMother;
        }


}
