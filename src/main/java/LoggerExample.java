import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;

public class LoggerExample {

    static Logger logger = LoggerFactory.getLogger(LoggerExample.class);

    public static void main(String[] args) {

        logger.trace("Trace Logger");
        logger.debug("Debug Logger");
        logger.info("Info Logger");
        logger.warn("Warn Logger");
        logger.error("Error Logger");
    }
}
