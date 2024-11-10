package application;

import interfaces.Interface;

public class StartProgram {
    public static void main(String[] args) {
        Interface userInterface = new Interface();
        
        userInterface.processPetition("add Pepe 654321234");
        userInterface.processPetition("list");
    }
}
