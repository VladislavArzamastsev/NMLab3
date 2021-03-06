package main;

import command.RunCommand;
import framework.application.Application;
import framework.state.ApplicationState;

public class Main {

    private static final String PROPERTY_PATH = "/laboratory.properties";

    public static void main(String[] args) {
        ApplicationState state = new state.ApplicationState();
        Application application = new Application.ApplicationBuilder(PROPERTY_PATH, state)
                .addCommand("run", new RunCommand())
                .build();
        application.start();
    }

}
