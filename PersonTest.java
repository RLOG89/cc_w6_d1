import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PersonTest{
  Person person;
  Pint pint;

  @Before 
  public void before(){
    person = new Person("Tom");
    pint = new Pint();
  }

  @Test
  public void hasName(){
    assertEquals("Tom", person.getName());
  }


}