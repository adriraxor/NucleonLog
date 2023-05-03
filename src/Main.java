import Log.Log;
import Log.LogColor;
import Test.Vehicule;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n            Lancement de Nucleon Debug \n\n");

/*      Log.d("TOTO", "hello world !");
        Log.e("TOTO", "hello world !");
        Log.i("TOTO", "hello world !");*/

        Vehicule vehicule = new Vehicule();
        Log.printAllObjectInMemory();

        System.out.println(Thread.currentThread().getStackTrace()[1]);
    }
}