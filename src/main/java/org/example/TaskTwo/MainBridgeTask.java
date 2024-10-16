package org.example.TaskTwo;

public class MainBridgeTask {
    public static void main(String[] args) {
        Renderer windowsRenderer = new WindowsRenderer();
        Renderer linuxRenderer = new LinuxRenderer();
        Shape circle = new Circle(windowsRenderer);
        Shape square = new Square(linuxRenderer);
        circle.draw(); // Rendering Circle on Windows
        square.draw(); // Rendering Square on Linux
    }
}
