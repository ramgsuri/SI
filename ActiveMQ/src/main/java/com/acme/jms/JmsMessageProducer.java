package com.acme.jms;

import javax.annotation.PostConstruct;
import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class JmsMessageProducer {

    private static final Logger logger = LoggerFactory.getLogger(JmsMessageProducer.class);

    protected static final String MESSAGE_COUNT = "messageCount";

    @Autowired
    private JmsTemplate template;
    private int messageCount = 100;
    
    
    /**
     * Generates JMS messages
     */
    @PostConstruct
    public void generateMessages() throws JMSException {
        for (int i = 0; i < messageCount; i++) {
            final int index = i;
    //        final String text = "Message number is " + i + ".";
            final String text = "<FlightInfo>"
            					+"<FlightModelNo>Airbus</FlightModelNo>"
            					+"<FlightNo>11</FlightNo>"
            					+"<Timestamp>12</Timestamp>"
            					+ "</FlightInfo>";
                  
            
            template.send(new MessageCreator() {
                public javax.jms.Message createMessage(Session session) throws JMSException {
                    TextMessage message = session.createTextMessage(text);
                    message.setIntProperty(MESSAGE_COUNT, index);
                    
                    logger.info("Sending message: " + text);
                    
                    return message;
                }
            });
        }
    }
    

/*    public JmsMessageProducer(final JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void send(final Map map) {
        jmsTemplate.convertAndSend(map);
    }
*/
}