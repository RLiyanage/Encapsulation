package clazz.encapsulation.good;

/**
 * This class is entirely hidden from the startup class and the Car class, 
 * therfore, it can be changed without causing harm to other classes.
 * 
 * @author jlombardo
 */
public class CarReportService {
    private Car car;
    
    public CarReportService(Car car) {
        this.car = car;
    }
    
    public void produceRunningStatus() {
        System.out.println("Car running status: " + car.isRunning());
    }
    
    public void produceEngineType() {
        System.out.println("Engine Type: " + car.getEngineType());
    }
}
