package Log;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * La classe Log permet de rendre visible vos "print" dans la console pour un meilleur debogage en fonction d'un tag spécifique comme sous Android
 *
 * Il est aussi possible d'enregistrer tous les objets que vous souhaitez debug lors de l'instanciation en héritant de la classe Log et dans
 * le constructeur de faire un appel à la méthode memObject(<Object>)
 */
public abstract class Log {

    protected static ArrayList<Object> arrObject = new ArrayList<>();

    private static final String CTE_LOG_DEBUG       = "[N.DEBUG]";
    private static final String CTE_LOG_INFORMATION = "[N.INFO]";
    private static final String CTE_LOG_ERROR       = "[N.ERROR]";
    private static final String CTE_LOG_OBJECT      = "[N.OBJECT]";

    /**
     * Print du message
     */
    private static void println(String type, String tag, String message, String color){
        System.out.println(color + LocalDateTime.now() + " - " + type + " " + message);
    }

    /**
     * Log.d --> Debug
     */
    public static void d(String tag, String message){
        println(CTE_LOG_DEBUG, tag, message, LogColor.CYAN);
    }

    /**
     * Log.e --> Error
     */
    public static void e(String tag, String message){
        println(CTE_LOG_ERROR, tag, message, LogColor.YELLOW);
    }

    /**
     * Log.i --> Information
     */
    public static void i(String tag, String message){
        println(CTE_LOG_INFORMATION, tag, message, LogColor.RED);
    }

    /**
     * Log.o --> Objet JAVA
     * @param object
     */
    protected static void o(Object object){
        println(CTE_LOG_OBJECT, "OBJECT_DETAILS", object.toString(), LogColor.PURPLE_BOLD);
    }

    /**
     * Affiche tous les objets en mémoire
     */
    public static void printAllObjectInMemory(){
        for (Object object: arrObject){
            o(object);
        }
    }

    /**
     * Ajoute l'objet passé en paramètre dans l'array list stockant en mémoire tous les objets
     * @param object
     */
    protected void memObject(Object object){
        arrObject.add(object);
    }
}