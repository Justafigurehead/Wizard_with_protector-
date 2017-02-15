package wizard_management;
import behaviours.Protector;

public class Ogre extends MythicalBeast implements Protector{
  
  public Ogre(String name){
    super(name);
  }


  public String protect(){
    return "Shield block!";
  }
}