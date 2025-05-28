package hello.proxy.pureproxt.proxt;

import hello.proxy.pureproxt.proxt.code.ProxyPatternClient;
import hello.proxy.pureproxt.proxt.code.RealSubject;
import org.junit.jupiter.api.Test;

public class ProxyPatternTest {

    @Test
    void noProxyTest(){
        RealSubject realSubject = new RealSubject();
        ProxyPatternClient client = new ProxyPatternClient(realSubject);
        client.execute();
        client.execute();
        client.execute();
    }
}
