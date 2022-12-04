package osmonaliev;

import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
//@Component
//@Scope("prototype")
public class ClassicalMusic implements Music {
//    @PostConstruct
//    public void doMyInit(){
//        System.out.println("doing my initializstion");
//    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
