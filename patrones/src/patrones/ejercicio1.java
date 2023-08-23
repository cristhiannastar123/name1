package patrones;

import java.util.List;
import java.util.ArrayList;

public class Logger {
    private static Logger instance;
    private List<String> logMessages = new ArrayList<>();

    private Logger() {
        // Constructor private
    }
    
    // Method static
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    // Add logs
    public void addLogMessage(String message) {
        logMessages.add(message);
    }
    
    // Print logs
    public void printLogs() {
        for (String message : logMessages) {
            System.out.println(message);
        }
    }
}


// ***************************

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.addLogMessage("Mensaje 1");
        logger.addLogMessage("Mensaje 2");

        Logger sameLogger = Logger.getInstance();
        sameLogger.addLogMessage("Mensaje 3");

        logger.printLogs();
    }
}