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
    if (drunk()){
      return;
    }
    int nextEmptyIndex = beerCount();
    drink[nextEmptyIndex] = beer;
  }

  public boolean drunk(){
    return beerCount() == drink.length;
  }

  public void sleep(){
    for (int i = 0; i < drink.length; i++){
      drink[i] = null; 
    }
  }
}

