package self;


/**
 * Hello world!
 *
 */
public class App 
{
    static {
        org.slf4j.bridge.SLF4JBridgeHandler.removeHandlersForRootLogger();
        org.slf4j.bridge.SLF4JBridgeHandler.install();
    }
    private final static org.slf4j.Logger SLF4J_LOGGER = org.slf4j.LoggerFactory.getLogger(App.class); // slf4j
    private final static java.util.logging.Logger JUL_LOGGER = java.util.logging.Logger.getLogger(App.class.getName());
    private final static org.apache.log4j.Logger LOG4J_LOGGER = org.apache.log4j.Logger.getLogger(App.class);
    private final static org.apache.logging.log4j.Logger LOG4J2_LOGGER = org.apache.logging.log4j.LogManager.getLogger(App.class);
    private final static org.apache.commons.logging.Log JCL_LOGGER = org.apache.commons.logging.LogFactory.getLog(App.class);
    public static void main( String[] args )
    {
        JUL_LOGGER.info("jul logger api");
        LOG4J_LOGGER.info("log4j logger api");
        LOG4J2_LOGGER.info("log4j2 logger api");
        JCL_LOGGER.info("jcl logger api");
        SLF4J_LOGGER.info("slf4j logger api");
    }
}
