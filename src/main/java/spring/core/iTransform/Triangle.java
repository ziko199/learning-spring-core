package spring.core.iTransform;

// implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean
public class Triangle implements Shape {

    private Point pointA;
    private Point pointB;
    private Point pointC;
    //private ApplicationContext applicationContext = null;
    //private String beanName;
    //static int i = 0;
    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("Drawing Triangle: ");
        System.out.println("point A: X = " + getPointA().getX() + " Y = " + getPointA().getY());
        System.out.println("point B: X = " + getPointB().getX() + " Y = " + getPointB().getY());
        System.out.println("point C: X = " + getPointC().getX() + " Y = " + getPointC().getY());
    }
/**
    public void myInit() {
        System.out.println("calling myInit method from xml");
    }

    public void clean() {
        System.out.println("calling clean method from xml");
    }


    // ApplicationContextAware
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Override Method setApplicationContext");
        this.applicationContext = applicationContext;
    }


    // BeanNameAware
    @Override
    public void setBeanName(String beanName) {
        System.out.println("Override Method setBeanName Bean name is: " + beanName);
        this.beanName = beanName;
    }

    // InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        i++;
        System.out.println("InitializingBean init method called for Triangle " + i + " " + this.beanName);
    }

    // DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy method called for Triangle " + i + " " + this.beanName);
        i--;
    }

 */
}
