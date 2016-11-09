package itonics.hello;

/**
 * Created by tbeauvais on 7/5/16.
 */
public class Hello {
    private long id;

    private String greeting;

    public Hello(String greeting) {
        this.greeting = greeting;
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
