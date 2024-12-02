/*
*   Списсок возможных приоритетов задач
*/

package Tasks;

public enum PriorityType {
    HIGH("Немедленно"),
    MEDIUM("Средний"),
    LOW("Низкий");
    

    private final String priorityString;

    PriorityType(String priorityString){
        this.priorityString = priorityString;
    }

    public String getStringValue() {
        return priorityString;
    }

    @Override
    public String toString(){
        return priorityString;
    }
}
