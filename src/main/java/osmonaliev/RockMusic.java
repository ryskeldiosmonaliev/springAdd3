package osmonaliev;

import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
//@Component
public class RockMusic implements Music {

    public String getSong() {
        return "Wind cries Mary";
    }
}
