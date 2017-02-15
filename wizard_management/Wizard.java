package wizard_management;
import behaviours.Flyable;
import behaviours.Protector;

public class Wizard {
  String name;
  private Flyable ride; 
  private Protector protector;

  public Wizard(String name, Flyable ride, Protector protector){
    this.name = name;
    this.ride = ride;
    this.protector = protector;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public String fly(){
    return this.ride.fly();
  }

  public void setRide(Flyable ride){
    this.ride = ride;
  }

}