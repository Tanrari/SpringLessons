package classespackage;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("apcontext.xml");
        context.refresh();
        MessageRenderer renderer = context.getBean("renderer",MessageRenderer.class);
        renderer.render();
        context.close();
    }



}
