package util;

import java.util.*;
import edu.mcgiveh.exercises11.WagonPace;

public class SystemInputSingleton {

    private static SystemInputSingleton instance = new SystemInputSingleton();

    private Scanner input = new Scanner(System.in);


    private SystemInputSingleton(){

    }
    public static SystemInputSingleton getInstance(){
        return instance;
    }

    public Scanner getScanner() {
        return input;
    }
}
