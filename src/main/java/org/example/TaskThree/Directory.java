package org.example.TaskThree;
import java.util.*;


class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();
    public Directory(String name) {
        this.name = name;
    }
    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}
