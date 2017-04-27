package mensageria

import javax.inject.Named
import javax.jms.JMSException
import javax.jms.Message
import javax.jms.MessageListener
import javax.jms.TextMessage

@Named
class Receptor implements MessageListener {

    @Override
    void onMessage(Message message) {
        TextMessage msg = (TextMessage) message
        println "-->RECEPTOR: recebeu mensagem fila - " + msg.text
    }
}


