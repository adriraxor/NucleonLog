package Test;

import Log.Log;

public class Vehicule extends Log {
    public Vehicule(){
        memObject(this);
        Log.i(getClass().getName(), "Je suis un véhicule");
        System.out.println(Thread.currentThread().getStackTrace()[1]);
    }
}
