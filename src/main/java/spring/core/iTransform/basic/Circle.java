package spring.core.iTransform.basic;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


@Component
public class Circle implements Shape, ApplicationEventPublisherAware {

    private Point center;
    private ApplicationEventPublisher publisher;

    public Point getCenter() {
        return center;
    }

    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Point is: (" + center.getX() + ", " + center.getY() +")");
        DrawEvent drawEvent = new DrawEvent(this);
        publisher.publishEvent(drawEvent);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    @PostConstruct
    public void initializeCircle() {
        System.out.println("Init method of Circle");
    }

    @PreDestroy
    public void destroyCircle() {
        System.out.println("Destroy method of Circle");
    }
}
