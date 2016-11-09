package itonics.hello;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tbeauvais on 7/5/16.
 */
public class HelloService {

    public List<Hello> hellos = new ArrayList<>();

    public List<Hello> getHellos() {
        return this.hellos;
    }
}
