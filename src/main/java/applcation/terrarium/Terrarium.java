package applcation.terrarium;

import controlPannel.App;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Terrarium extends App {
    protected Location[][] locations; // здесь возможно изменим на лист чтобы сразу запустить лист в экзекутор сервис в методе для инциализации
    private ExecutorService executorService;

    public Terrarium(){
        userInterface.sendMessageToUserInterface("Инициализирован террариум");
    }

    public void initializeLocations(int rows, int columns){
        executorService = Executors.newFixedThreadPool((int) ((rows * columns) * 0.05));
        locations = new Location[rows][columns];

        for(int countRow = 0; countRow < rows; countRow++){
            for(int countColumn = 0; countColumn < columns; countColumn++){
                locations[countRow][countColumn] = new Location(countRow, countColumn);
            }
        }
    }

    public void startInteractions(){

    }


}
