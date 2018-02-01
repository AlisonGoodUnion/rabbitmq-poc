import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.concurrent.TimeoutException;

public class Send {

    static Logger logger = LoggerFactory.getLogger(Send.class);

    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws java.io.IOException, TimeoutException {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();

        String message = "Hello World";

        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());

        logger.info(" [x] Sent '" + message + "'");

        channel.close();
        connection.close();
    }
}
