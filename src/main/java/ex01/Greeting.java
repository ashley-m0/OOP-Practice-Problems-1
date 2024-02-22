package ex01;

public class Greeting {
    private String name;

    public void setName(String name) {
        if (!name.equals("")){
            this.name = name;
        }
    }

    @Override
    public String toString(){
        return "Hello, " + name + ", nice to meet you!";
    }
}
