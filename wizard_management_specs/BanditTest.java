import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import wizard_management.*;

public class BanditTest{

  Dragon dragon;
  Broomstick broomstick;
  BanditHenchman bob;
  Wizard wizard;

  @Before
  public void before(){
    dragon = new Dragon ("Jeff");
    broomstick = new Broomstick ("Silver Arrow", 50);
    bob = new BanditHenchman("Bob", 10);
    wizard = new Wizard("Rincewind", broomstick, dragon, 15);
  }

  @Test
  public void banditCanAttack(){
    assertEquals("Swords raised.", bob.attack());
  }

  @Test
  public void banditCanTalk(){
    assertEquals("Huh?!", bob.talk());
  }

  @Test
  public void attackDoesDmgToWizard(){
    bob.attackDoesDmg(wizard);
    assertEquals(5, wizard.getHealthPts());
  }
}