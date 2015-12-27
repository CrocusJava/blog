package hybrisblog.data;

public class GreetingData {
    private final long greetingId;
    private final String content;

    public GreetingData(long greetingId, String content) {
        this.greetingId = greetingId;
        this.content = content;
    }

    public long getGreetingId() {
        return greetingId;
    }

    public String getContent() {
        return content;
    }
}
