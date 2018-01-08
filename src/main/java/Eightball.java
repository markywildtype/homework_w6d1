import java.util.ArrayList;

public class Eightball {

    private ArrayList<String> responses;

    public Eightball(){
        this.responses = new ArrayList<>();
        this.responses.add("It's not your lucky day!");
        this.responses.add("Fortune favours you today!");
        this.responses.add("Always clouded, the future is...");
    }

    public int responseCount() {
        return this.responses.size();
    }


    public void addResponse(String response) {
        this.responses.add(response);
    }

    public void removeResponse(int index) {
        this.responses.remove(index);
    }
}
