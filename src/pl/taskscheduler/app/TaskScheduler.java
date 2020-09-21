package pl.taskscheduler.app;

import pl.taskscheduler.model.Project;

public class TaskScheduler {
    public static void main(String[] args) {
        Project projects[] = new Project[10];
        projects[0] = new Project("Idz na zakupy", "Pójdz na zakupy i kup coś tam");

        System.out.println(projects[0]);
    }
}
