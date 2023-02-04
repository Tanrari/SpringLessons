import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InvertionOfControlWithDependencyExtract {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/app-context.xml");
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
