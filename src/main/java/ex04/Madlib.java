package ex04;

public class Madlib {
    private String noun;
    private String verb;
    private String adj;
    private String adv;

    public void setAdj(String adj) {
        this.adj = adj;
    }

    public void setAdv(String adv) {
        this.adv = adv;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    @Override
    public String toString() {
        return String.format("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adv);
    }
}
