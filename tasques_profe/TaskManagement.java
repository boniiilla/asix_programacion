package tasques_profe;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

class TaskManagement {
    private HashMap<Integer, Task> tasks;
    private HashMap<String, ArrayList<Task>> lists;

    public TaskManagement() {
        tasks = new HashMap<Integer, Task>();
        lists = new HashMap<String, ArrayList<Task>>();
        lists.put("Pendent", new ArrayList<Task>());
        lists.put("En curs", new ArrayList<Task>());
        lists.put("Completada", new ArrayList<Task>());
    }

    public void addTask(String taskName, String description, String date) {
        Task task = new Task(taskName, description, date);
        tasks.put(task.getId(), task);
    }

    public void doneTask(int taskId) {
        Task task = tasks.get(taskId);
        task.done();
    }

    public void onGoingTask(int taskid) {
        Task task = tasks.get(taskid);
        task.onGoing();
    }
    
    public void modifyTask(int taskid, String name, String description, String date){
        Task task = tasks.get(taskid);
        task.modifyTask(name, description, date);
    }

    public void deleteTask(int taskId) {
        tasks.remove(taskId);
    }

    public void printAllTask() {
        tasks.forEach((key, task) -> {
            System.out.println(task);
        });
    }

}

class Task {
    private static int numInstances = 0;
    private int id;
    private String name;
    private String endDate;
    private String description;
    private String status;

    public Task(String name, String description, String endDate){
        this.name = name;
        this.description = description;
        this.endDate = endDate;
        status = "Pendent";
        id = ++numInstances;
    }

    public int getId() {
        return id;
    }

    public void modifyTask(String name, String description, String endDate) {
        this.name = name;
        this.description = description;
        this.endDate = endDate;
    }

    public void onGoing(){
        status = "En curs";
    }
    
    public void done(){
        status = "Completat";
    }

    public String toString() {
        return 
        "===========================================" +
        "\nId: " + id + 
        "\nName: " + name +
        "\nDescription: " + description +
        "\nEnd date: " + endDate +
        "\nStatus: " + status;
    }
}


class Main {
    public static void main(String[] args) {

        TaskManagement manager = new TaskManagement();

        System.out.println("Add new task:");
        manager.addTask("Hacer ejercicio", "Ejercicios para fortalecer el abdomen", "25/05/24");
        System.out.println("Print all tasks:");
        manager.printAllTask();
        System.out.println("Add new task:");
        manager.addTask("Jugar a futbol", "Realizar el deporte llamado futbol con amigos en una pista de futbol sala", "18/05/24");
        System.out.println("Print all tasks:");
        manager.printAllTask();
        System.out.println("Mark task on going:");
        manager.onGoingTask(1);
        System.out.println("Print all tasks:");
        manager.printAllTask();
        System.out.println("Modificar la tarea: ");
        manager.modifyTask(1, "Hacer ejercicio abdominales", "Prodecer a hacer abdominales con series de 12x4", "25/05/24");
        System.out.println("Print all tasks:");
        manager.printAllTask();
    }
}