package controlPannel;

import applcation.terrarium.Terrarium;
import userInterface.UserInterface;

public class App {
    private final UserInterface userInterface;
    private final Data data;
    private final Terrarium terrarium;

    public App() {
        this.userInterface = new UserInterface();
        this.data = new Data();
        this.terrarium = new Terrarium(userInterface, data);
        userInterface.sendMessageToUserInterface("Инициализировано приложение");

        start();
    }

    private void start(){
        userInterface.sendMessageToUserInterface("Приложение запущено...");

        try{
            while(true){

            }
        } catch (Exception e){

        }

        stop();
    }

    private void stop(){
        userInterface.sendMessageToUserInterface("Приложение остановлено...");

    }
}
