package wizard_management;


public abstract class Bandit{

  String name;

  public Bandit(String name){
    this.name = name;
  }

  public abstract String attack();
  public abstract String talk();

}