package applcation.terrarium;

import applcation.floraAndFauna.mainClasses.Animal;
import controlPannel.Data;
import userInterface.UserInterface;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class Location extends Terrarium implements Runnable{


    private Location upperLocation;
    private Location rigthLocation;
    private Location leftLocation;
    private Location currentLocation;
    private Location lowerLocation;

    Map<String, Animal> animalsArea;



    public Location(int currentRow, int currentColumn){
        toSetCoordinates(currentRow, currentColumn);
    }

    private void toSetCoordinates(int currentRow, int currentColumn){
        int maxRowSize = locations.length;
        int maxColumnSize = locations[currentColumn].length;

        upperLocation = currentRow > 0 ? locations[currentRow - 1][currentColumn] : null;
        rigthLocation = currentColumn > 0 ? locations[currentRow][currentColumn - 1] : null;
        leftLocation = currentColumn < maxColumnSize ? locations[currentRow][currentColumn + 1] : null;
        currentLocation = locations[currentRow][currentColumn];
        lowerLocation = currentRow < maxRowSize ? locations[currentRow + 1][currentColumn] : null;
    }

    private void initializeAnimals(){
        animalsArea = new ConcurrentHashMap<>();


    }

    @Override
    public void run(){
        initializeAnimals();
    }


}
