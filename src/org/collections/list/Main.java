package org.collections.list;

public class Main {
    public static void main(String[] args) {

        TaskList taskList = new TaskList();
        System.out.println(taskList.getTotalNumberOfTasks());

        taskList.addTask("Task 1");
        taskList.addTask("Task 2");
        taskList.addTask("Task 1");
        System.out.println(taskList.getTotalNumberOfTasks());

        taskList.removeTask("Task 2");
        System.out.println(taskList.getTotalNumberOfTasks());

        taskList.getTaskDescription();
    }
}
