package mensageria

import javax.inject.Inject
import javax.inject.Named

import org.springframework.jms.core.JmsTemplate

@Named
class Enviador {

    @Inject
    JmsTemplate jms

    void send(Object mensagem) {
        println "ENVIADOR: enviando mensagem.."
        jms.convertAndSend(mensagem)
    }
}

