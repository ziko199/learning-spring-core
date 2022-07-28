package spring.core.iTransform.basic;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent {

    public DrawEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "DrawEvent{" +
                "source=" + source +
                '}';
    }
}
