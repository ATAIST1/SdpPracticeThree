package org.example.TaskOne;

public class MainAdapterClass {
    public static void main(String[] args) {
        LegacyOrderProcessor legacyProcessor = new LegacyOrderProcessor();
        NewOrderProcessor adapter = new OrderAdapter(legacyProcessor);
        adapter.processNewOrder(); // Working with the new interface while using old code
    }
}
