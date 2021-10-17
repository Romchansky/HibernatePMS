package ua.goit;


import ua.goit.controller.ConsoleController;

import ua.goit.view.Console;

public class Application {

    public static void main(String[] args) {

        ConsoleController controller = new ConsoleController(new Console());
        controller.process();

    }

}
