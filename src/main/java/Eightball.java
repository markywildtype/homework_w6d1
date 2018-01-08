import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.shuffle;

public class Eightball {

    private ArrayList<String> responses;

    public Eightball(){
        this.responses = new ArrayList<>();
        this.responses.add("It's not your lucky day!");
        this.responses.add("Fortune favours you today!");
        this.responses.add("Always clouded, the future is...");
        this.responses.add("It is... Unlikely...");
        this.responses.add("Gonna nail it, bro!");
        this.responses.add("Does the Pope shit in a bear?");
        this.responses.add("Nope. Just nope.");
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

    public String ask() {
        Collections.shuffle(responses);
        return responses.get(0);
    }
}
