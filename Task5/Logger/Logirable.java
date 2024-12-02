/*
*   интерфейс создания и сохранения записи в журнал
*/

public interface Logirable {
    void doLog(DataLoger model);
}