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
        assertEquals(7, eightball.responseCount());
    }

    @Test
    public void canAddResponse(){
        eightball.addResponse("Signs are good!");
        assertEquals(8, eightball.responseCount());
    }

    @Test
    public void canRemoveResponse(){
        eightball.removeResponse(0);
        assertEquals(6, eightball.responseCount());
    }

}
