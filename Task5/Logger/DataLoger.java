/*
*   интерфейс журнал
*/

public interface DataLoger {
    String getMessage();
    Integer getErrorCode();
    Object getTag();
}