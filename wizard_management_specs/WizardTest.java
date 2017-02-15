import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import wizard_management.*;

public class WizardTest {

  Wizard wizard;
  Broomstick broomstick;
  

  @Before
  public void before(){
    broomstick = new Broomstick("Nimbus", 10);
    wizard = new Wizard("Toby", broomstick);
    
  }

  @Test
  public void hasName(){
    assertEquals("Toby", wizard.getName());
  }

  @Test
  public void hasRide(){
    Broomstick ride = (Broomstick) wizard.getRide();
    assertEquals("Nimbus", ride.getBrand());
  }

  @Test
  public void canFly(){
    assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
  }

  @Test
  public void canFlyDragon(){

    Dragon dragon = new Dragon("Smaug");
    wizard = new Wizard("Ridicully", dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void canFlyMagicCarpet(){
    
    MagicCarpet magicCarpet = new MagicCarpet("blue");
    wizard = new Wizard("Mickey", magicCarpet);

    assertEquals("Hovering up, straightening out, flying off!", wizard.fly());
  }

  @Test
  public void canChangeRide(){

    Dragon dragon = new Dragon("Puff");
    wizard.setRide(dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }
}