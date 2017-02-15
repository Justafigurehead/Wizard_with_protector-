import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import wizard_management.*;

public class RugTest {

  Rug rug;

  @Before
  public void before(){
    rug = new Rug("Yellow");
  }

  @Test
  public void hasColour(){
    assertEquals("Yellow",rug.getColour());
  }

}