package com.company.logic;

public class Main {

    private Controller controller;

    public Main() {
        controller = new Controller();
        controller.startProgram();
    }


    public static void main(String[] args) {
        Main m = new Main();
    }
}
