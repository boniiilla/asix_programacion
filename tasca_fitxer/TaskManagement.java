package tasca_fitxer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


class TaskManagement {
    public static HashMap<Integer, Task> tasks;
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
    
    public String getStatus() {
        return status;
    }

    public String toString() {
        return 
        "Id: " + id + 
        ", Name: " + name +
        ", Description: " + description +
        ", End date: " + endDate +
        ", Status: " + status;
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

class FileManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("En que fitxero desea guardar la informacion?");
        String nameFile = input.nextLine();

        File file = new File(nameFile);
        
        try {
            if (file.createNewFile()) {
                System.out.println("Fitxer creat amb èxit.");
            } else {
                System.out.println("El fitxer ja existeix");
            }
        } catch (IOException e) {
            System.out.println("S'ha produït un error en crear el fitxer.");
            e.printStackTrace();
        }

        TaskManagement manager = new TaskManagement();

        try (FileWriter writer = new FileWriter(file)){
            
            System.out.println("Cuantes tasques voleu afegir?");
            int numTask = input.nextInt();
            
            for (int i = 0; numTask > i; i++) {
                System.out.println("Introdueix la tasca:");
                System.out.println("Nom:");
                String name = input.next();
                System.out.println("Descripció:");
                String description = input.next();
                System.out.println("Data de venciment (XX/XX/XX):");
                String enDate = input.next();
                
                manager.addTask(name, description, enDate);
            }
            
            manager.printAllTask();
            
        } catch (IOException e) {
            System.out.println("S'ha produït un error en crear el fitxer.");
            e.printStackTrace();
        }

        boolean delete = false;

        System.out.println("Introduce 1 si desea eliminar el fixero");
        int num = input.nextInt();

        if (num == 1){
            delete = true;
        }

        if (delete == true) {
            if (file.delete()) {
                System.out.println("Fitxer eliminat amb exit.");
            } else {
                System.out.println("No s'ha pogut eliminar el fitxer");
            }
        }
    }
}