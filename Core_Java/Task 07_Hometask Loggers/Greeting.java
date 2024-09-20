package logs4j;

import java.util.logging.Logger;

public class Greeting {
    private static final Logger logger = Logger.getLogger(Greeting.class.getName());

    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            logger.info("Name provided: " + name);
            System.out.println("Hello, " + name);
        } else {
            logger.warning("No name provided!");
            System.out.println("No name provided!");
        }
    }
}
