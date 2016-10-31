public class Person{
  private String name;
  private Beer[] drink;

  public Person(String name){
    this.name = name;
    this.drink = new Beer[10];
  }

  public String getName(){
    return this.name;
  }

  public int beerCount(){
    int counter = 0;
    for (Beer drunk : drink){
      if (drunk != null){
      counter ++;
    }
  }
  return counter;
}

  public void drink(Beer beer){
    int nextEmptyIndex = beerCount();
    drink[nextEmptyIndex] = beer;
  }

}
