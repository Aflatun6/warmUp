package warmUp.tuesday3march;

public class Sentence {
    final String subject;
    final String verb;
    final String object;

    public Sentence(String subject, String verb, String object) {
        this.subject = subject;
        this.verb = verb;
        this.object = object;
    }

    private String build() {
        return String.format("%s %s %s", subject, verb, object);
    }

    public String toString() {
        return build();
    }
}
