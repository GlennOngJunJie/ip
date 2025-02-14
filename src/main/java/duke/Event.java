package duke;

public class Event extends Task {
    protected String from;
    protected String to;

    public Event(String description, String fullDescription, String from, String to) {
        super(description, fullDescription);
        assert fullDescription.startsWith("event");
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + "(from: " + from + "to: " + to + ")";
    }
}