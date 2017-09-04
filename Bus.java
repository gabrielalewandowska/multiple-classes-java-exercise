public class Bus{
  private int number;
  private Person[] passengers;

  public Bus(int number){
    this.number = number;
    this.passengers = new Person[20];
  }

  public int getNumber(){
    return this.number;
  }

  public int passengerCount(){
    int count = 0;
    for (Person passenger : this.passengers){
      if(passenger != null){
        count++;
      }
    }
    return count;
  }

  public boolean isFull(){
    return this.passengerCount() == this.passengers.length;
  }

  public void add(Person passenger){
    if(this.isFull()){
      return;
    }

    int passengerCount = passengerCount();
    this.passengers[passengerCount] = passenger;
  }

  public void empty(){
    for(int i = 0; i < passengers.length; i++){
      passengers[i] = null;
    }
  }

}
