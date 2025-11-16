package theater;

/**
 * Represent a play.
 */
public class Play {

    // I need add two methods to use these two private variable
    private String name;
    private String type;

    /**
     * Constructs a play.
     *
     * @param name the name of the play, must not be null
     * @param type the type of the play, must not be null
     */
    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }
}
