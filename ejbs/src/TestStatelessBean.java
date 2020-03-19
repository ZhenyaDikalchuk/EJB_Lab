import javax.ejb.Stateless;

@Stateless
public class TestStatelessBean implements TestStatelessLocal {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name +"!";
    }
}