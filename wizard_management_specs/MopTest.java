import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import wizard_management.*;

public class MopTest {

  Mop mop;

  @Before
  public void before(){
    mop = new Mop("Hygenic");
  }

  @Test
  public void hasBrand(){
    assertEquals("Hygenic", mop.getBrand());
  }
  
}