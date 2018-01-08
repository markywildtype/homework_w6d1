import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EightballTest {

    Eightball eightball;

    @Before
    public void before(){
        eightball = new Eightball();
    }

    @Test
    public void hasLength(){
        assertEquals(3, eightball.responseCount());
    }

    @Test
    public void canAddResponse(){
        eightball.addResponse("Signs are good!");
        assertEquals(4, eightball.responseCount());
    }

    @Test
    public void canRemoveResponse(){
        eightball.removeResponse(0);
        assertEquals(2, eightball.responseCount());
    }

}
