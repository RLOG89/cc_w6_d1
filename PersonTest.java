import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PersonTest{
  Person person;
  Beer beer;

  @Before 
  public void before(){
    person = new Person("Tom");
    beer = new Beer();
  }

  @Test
  public void hasName(){
    assertEquals("Tom", person.getName());
  }

  @Test
  public void beerDrunkStartsEmpty(){
    assertEquals(0, person.beerCount());
  }

  @Test
  public void canDrinkBeer(){
    person.drink(beer);
    assertEquals(1, person.beerCount());
  }

  @Test
  public void cantDrinkWhenDrunk(){
    for (int i = 0; i < 12; i++){
      person.drink(beer);
    }
      assertEquals(10, person.beerCount());
    }
  }

