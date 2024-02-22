package ex03;

public class Quote {
    private String quote;
    private String speaker;

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    @Override
    public String toString() {
        return speaker + " says, \"" + quote + "\"" ;
    }
}
