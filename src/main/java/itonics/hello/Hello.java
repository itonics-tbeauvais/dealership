package itonics.hello;

import static itonics.IdUtils.getUniqueMillis;

/**
 * Created by tbeauvais on 7/5/16.
 */
public class Hello {
    private long id;

    private String greeting;

    public Hello(String greeting) {
        this.greeting = greeting;
        this.id = getUniqueMillis();
    }

    public long getId() {
        return id;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
