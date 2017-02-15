package wizard_management;

public class BanditHenchman extends Bandit{

  public BanditHenchman(String name){
    super(name);
  }

  public String attack(){
    return "Swords raised.";
  }

  public String talk(){
    return "Huh?!";
  }
}