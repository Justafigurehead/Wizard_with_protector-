import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import wizard_management.*;

public class WizardTest {

  Wizard wizard;
  Broomstick broomstick;
  Dragon dragon;
  Ogre ogre;
  

  @Before
  public void before(){
    broomstick = new Broomstick("Nimbus", 10);
    wizard = new Wizard("Toby", broomstick, dragon);
    dragon = new Dragon("Smaug");
    ogre = new Ogre("FistPunchKnuckle");
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
    wizard = new Wizard("Ridicully", dragon, dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void canFlyMagicCarpet(){
    
    MagicCarpet magicCarpet = new MagicCarpet("blue");
    wizard = new Wizard("Mickey", magicCarpet, dragon);

    assertEquals("Hovering up, straightening out, flying off!", wizard.fly());
  }

  @Test
  public void canChangeRide(){

    Dragon dragon = new Dragon("Puff");
    wizard.setRide(dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }


  // @Test 
  // public void protectorProtects(){
  //   assertEquals("Flame blast!!!", wizard.defend());
  // }

  @Test
  public void protectorProtects(){
    assertEquals("Shield block!", wizard.defend());
  }

  // @Test 
  // public void setProtector(){
  //   wizard.setProtector(ogre);
  //   assertEquals("Shield block!", wizard.defend());
  // }
  
  // @Test 
  // public void setProtectorAgain(){
  //   Dragon dragonTwo = new Dragon("Bob");
  //   wizard.setProtector(dragonTwo);
  //   assertEquals("Flame blast!!!", wizard.defend());
  // }
}