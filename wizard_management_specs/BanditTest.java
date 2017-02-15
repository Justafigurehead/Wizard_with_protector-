import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import wizard_management.*;

public class BanditTest{

  BanditHenchman bob;

  @Before
  public void before(){
    bob = new BanditHenchman("Bob");
  }

  @Test
  public void banditCanAttack(){
    assertEquals("Swords raised.", bob.attack());
  }

  @Test
  public void banditCanTalk(){
    assertEquals("Huh?!", bob.talk());
  }
}