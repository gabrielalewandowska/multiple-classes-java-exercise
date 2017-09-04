import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest{
  BusStop busStop;
  Bus bus;
  Person person;

  @Before
  public void before(){
    busStop = new BusStop("Princess Street");
    bus = new Bus(16);
    person = new Person();
  }

  @Test
  public void hasName(){
    assertEquals("Princess Street", busStop.getName());
  }

  @Test
  public void hasCorrectPeopleCount(){
    assertEquals( 0, busStop.peopleCount() );
  }
}
