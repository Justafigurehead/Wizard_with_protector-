package wizard_management;
import behaviours.Flyable;
import behaviours.Protector;

public class Wizard {
  String name;
  private Flyable ride; 
  private Protector protector;
  private int healthpts;

  public Wizard(String name, Flyable ride, Protector protector, int healthpts){
    this.name = name;
    this.ride = ride;
    this.protector = protector;
    this.healthpts = healthpts;

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

  public void setProtector(Protector protector){
    this.protector = protector;
  }

  public String defend(){
    return protector.protect();
  }

  public int getHealthPts(){
    return this.healthpts;
  }

  public void setHealthPts(int healthpts){
    this.healthpts = healthpts;
  }

}