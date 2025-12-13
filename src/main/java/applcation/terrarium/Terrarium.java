package applcation.terrarium;

import controlPannel.Data;
import userInterface.UserInterface;

public class Terrarium {
    private UserInterface userInterface;
    private Data data;

    public Terrarium(UserInterface UI, Data data){
        this.userInterface = UI;
        this.data = data;
        userInterface.sendMessageToUserInterface("Инициализирован террариум");
    }



}
