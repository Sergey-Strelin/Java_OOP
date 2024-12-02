/*
*   Класс задачи
*/

package Tasks;

import java.time.LocalDate;
import java.time.LocalTime;

public class Task {
    private Integer idTask;
    private LocalDate dateAddTask;
    private LocalTime timeAddTask;
    private String noteTask;
    private PriorityType priority;
    private Integer idPerson;


    @Override
    public String toString() {
        return getIdTask() +
            "," + getDateAddTask() +
            "," + getTimeAddTask() +
            "," + getNoteTask() +
            "," + getPriority()+
            "," + getIdPerson() + "\n";
    }    

    public Task(Integer idTask, LocalDate dateAddTask, LocalTime timeAddTask, String noteTask, PriorityType priority, Integer idPerson) {
        this.idTask = idTask;
        this.dateAddTask = dateAddTask;
        this.timeAddTask = timeAddTask;
        this.noteTask = noteTask;
        this.priority = priority;
        this.idPerson = idPerson;
    }


    

    public Integer getIdTask() {
        return this.idTask;
    }

    public void setIdTask(Integer idTask) {
        this.idTask = idTask;
    }

    public LocalDate getDateAddTask() {
        return this.dateAddTask;
    }

    public void setDateAddTask(LocalDate dateAddTask) {
        this.dateAddTask = dateAddTask;
    }

    public LocalTime getTimeAddTask() {
        return this.timeAddTask;
    }

    public void setTimeAddTask(LocalTime timeAddTask) {
        this.timeAddTask = timeAddTask;
    }

    public String getNoteTask() {
        return this.noteTask;
    }

    public void setNoteTask(String noteTask) {
        this.noteTask = noteTask;
    }

    public PriorityType getPriority() {
        return this.priority;
    }

    public void setPriority(PriorityType priority) {
        this.priority = priority;
    }

    public Integer getIdPerson() {
        return this.idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    // @Override
    // public String toString() {
    //     return " id Задачи " + getIdTask() +
    //         ", дата создания " + getDateAddTask() +
    //         ", время создания " + getTimeAddTask() +
    //         ", Описание " + getNoteTask() +
    //         ", Приоритет " + getPriority()+
    //         ", Создатель " + getIdPerson() + "\n";
    // }

}
