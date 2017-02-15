package wizard_management;

public class BanditHenchman extends Bandit{

    int attackpts;

  public BanditHenchman(String name, int attackpts){
    super(name);
    this.attackpts = attackpts;
  }

  public String attack(){
    return "Swords raised.";
  }

  public String talk(){
    return "Huh?!";
  }

  public void attackDoesDmg(Wizard wizard){
   talk();
   int health = wizard.getHealthPts() - attackpts;
   wizard.setHealthPts(health);
  }


}