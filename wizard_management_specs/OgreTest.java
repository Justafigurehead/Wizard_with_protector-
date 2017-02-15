import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import wizard_management.*;

public class OgreTest {

  Ogre ogre;

  @Before
  public void before(){
    ogre = new Ogre("Freddie");
  }

  @Test
  public void hasName(){
    assertEquals("Freddie", ogre.getName());
  }
}