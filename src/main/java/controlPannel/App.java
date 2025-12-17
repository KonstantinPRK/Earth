package controlPannel;

import applcation.terrarium.Terrarium;
import userInterface.UserInterface;

public class App {
    public final UserInterface userInterface;
    public final Data data;
    public final Terrarium terrarium;

    public App() {
        this.userInterface = new UserInterface();
        this.data = new Data();
        this.terrarium = new Terrarium();
        userInterface.sendMessageToUserInterface("Инициализировано приложение");
        start();
    }

    private void start(){
        try{
            userInterface.sendMessageToUserInterface("Приложение запущено...");
            terrarium.initializeLocations(); // получить сообщение от пользователя о размере локации
            terrarium.startInteractions();
            userInterface.sendMessageToUserInterface("Приложение остановлено...");
        } catch (Exception e){}
    }
}
