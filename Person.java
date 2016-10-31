public class Person{
  private String name;
  private Pint[] drunk;

  public Person(String name){
    this.name = name;
    this.drunk = new Pint[10];
  }

  public String getName(){
    return this.name;
  }

}