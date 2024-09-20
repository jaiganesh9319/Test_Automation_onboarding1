package logs4j;

import java.util.logging.*;

class CustomFormatter extends Formatter {
    
    public String format(LogRecord record) {
        return "[" + record.getLevel() + "] " + record.getSourceClassName() + ": " + record.getMessage() + "\n";
        

    }
}

