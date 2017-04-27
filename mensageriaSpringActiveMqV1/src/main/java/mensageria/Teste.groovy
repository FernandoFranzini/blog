package mensageria

import org.springframework.context.ApplicationContext
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class Teste {
    static void main(args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("mensageria/spring.xml")
        Enviador enviador = ctx.getBean("enviador")
        enviador.send("Ola mundo mom")
        Thread.sleep(2000)
        ((ConfigurableApplicationContext)ctx).close();
    }
}

