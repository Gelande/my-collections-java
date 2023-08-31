package org.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<Task> taskList;

    //Lista vazia
    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    //Adiciona uma nova tarefa à lista com a descrição fornecida.
    public void addTask(String description) {
        taskList.add(new Task(description));
    }

    //Remove uma tarefa da lista com base em sua descrição.
    public void removeTask(String description) {
        //Para elementos repetidos que podem ter na lista
        List<Task> tasksToRemove = new ArrayList<>();
        for (Task t: taskList) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                tasksToRemove.add(t);
            }
        }
        taskList.removeAll(tasksToRemove);
    }

    //Retorna o número total de tarefas na lista.
    public int getTotalNumberOfTasks() {
        return taskList.size();
    }

    //Retorna uma lista contendo a descrição de todas as tarefas na lista.
    public void getTaskDescription() {
        System.out.println(taskList);
    }
}
