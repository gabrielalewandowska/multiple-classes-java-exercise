import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;

  @Before
  public void before(){
    bus = new Bus(16);
    person = new Person();
  }

  @Test
  public void hasNumber(){
    assertEquals(16, bus.getNumber());
  }

  @Test
  public void hasCorrectPassengerCount(){
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void canAddPassenger(){
    bus.add(person);
    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void cannotAddPassengerWhenFull(){
    for(int i = 0; i < 30; i++){
      bus.add(person);
    }
    assertEquals(20, bus.passengerCount());
  }

  @Test
  public void checkIfEmptied(){
    bus.add(person);
    bus.empty();
    assertEquals( 0, bus.passengerCount());
  }


}
