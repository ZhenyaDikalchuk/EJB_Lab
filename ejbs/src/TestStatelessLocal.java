import javax.ejb.Local;

@Local
public interface TestStatelessLocal {
    String sayHello(String name);
}
