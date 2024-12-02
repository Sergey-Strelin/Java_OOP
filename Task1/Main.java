import java.util.*;


public class Main {
    private static Scanner input = new Scanner(System.in, "Cp866");
    public static void main(String[] args) {
        List<Persons> persons = Persons();
        List<Relation> relation = Relation();
        System.out.println(relationString(1, relation, persons));
        
        //создаём меню и его обработку
        boolean stopWhile = true;
        while (stopWhile){
            System.out.println(menu());
            int whatDo = input.nextInt();
            switch(whatDo) {
            case 1: 
                viewAllPerson(persons);
                break;
            case 2:
                System.out.println("Пока пусто");
                viewAllRelation(relation, persons);
                break;
            case 3:
                stopWhile = false;
                break;
            default:
                System.out.println((char) 27 + "[31mНет такого пункта меню!"+ (char)27 + "[0m");
            }
        }
    }


/*
 * заполняем персонами
 */
    private static List<Persons> Persons() {
        List<Persons> persons = new ArrayList<>();
        persons.add(new Persons("Иванов", "Иван", "мужской"));
        persons.add(new Persons("Петров", "Сергей", "мужской"));
        persons.add(new Persons("Иванова", "Марья", "женский"));
        persons.add(new Persons("Петров", "Иван", "мужской"));
        persons.add(new Persons("Петрова", "Наталья", "женский"));
        persons.add(new Persons("Иванов", "Сергей", "мужской"));
        persons.add(new Persons("Петрова", "Марья", "женский"));
        
        return persons;
        
    }

    /*
     * Заполняем связями - ребёнок - родители
     */
    private static List<Relation> Relation() {
        List<Relation> relation = new ArrayList<>();
        relation.add(new Relation(0, 5, 2));
        relation.add(new Relation(6, 1, 4));
        relation.add(new Relation(3, 1, 4));

        return relation;
    }


    /*
     * показываем все персоны
     */
    private static void viewAllPerson(List<Persons> persons) {
        System.out.println((char) 27 + "[32m\n Список персон: "+ (char)27 + "[0m");
        
        for (Persons elem: persons) {
            System.out.println(elem);        
        }
    }


    /*
     * показываем родственников - как занесли
     */
    private static void viewAllRelation(List<Relation> relation, List<Persons> persons) {
        System.out.println((char) 27 + "[32m\n Родственные связи: "+ (char)27 + "[0m");
        int i = 0;
        for (Relation elem: relation) {
            System.out.println(relationString(i, relation, persons));
            i++;
        }
    }

    /*
     * список родственники - в строку (ребёнок - папа - мама)
     */
    private static String relationString(int id, List<Relation> relation, List<Persons> persons) {
        String children = getPersonString(relation.get(id).getIdPerson() , persons);
        String sex =  getSexString(relation.get(id).getIdPerson() , persons);
        String father = getPersonString(relation.get(id).getIdFather(), persons);
        String mother = getPersonString(relation.get(id).getIdMother(), persons);
        
        if (sex == "мужской") {
            return "папа: " + father + ", мама: " + mother + ", сын: " + children;
        } else {        
            return "папа: " + father + ", мама: " + mother + ", дочь: " + children;
        }
    }


    /*
     * получаем Фамилию и имя по id
     */
    private static String getPersonString(int id, List<Persons> persons){

        return  persons.get(id).getFamily() + " " + persons.get(id).getName();
    }

    /*
     * получаем пол по id
     */
    private static String getSexString(int id, List<Persons> persons){

        return  persons.get(id).getSex() ;
    }


    // создаём меню 
    private static String menu() {
        String menuStr = new StringBuilder()
        .append((char) 27 + "[34m\nВыберите действие: \n"+ (char)27 + "[0m")
        .append("1 - Посмотреть все персоны \n")
        .append("2 - Посмотреть родственные связи \n")
        .append("3 - Выход ")
        .toString();

        return menuStr;
    }    




}
