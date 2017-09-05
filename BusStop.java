public class BusStop{
  private String name;
  private Person[] people;

  public BusStop(String name, Person[] people){
    this.name = name;
    this.people = people;
  }

  public BusStop(String name){
    this.name = name;
    this.people = new Person[2];
  }

  public String getName(){
    return this.name;
  }

  public int peopleCount(){
    int count = 0;
    for(Person personWaiting : this.people){
      if(personWaiting != null){
        count++;
      }
    }
    return count;
  }

  public boolean isLineFull(){
    return this.peopleCount() == this.people.length;
  }

  public void add(Person personWaiting){
    if(this.isLineFull()){
      return;
    }
    int peopleCount = peopleCount();
    this.people[peopleCount] = personWaiting;
  }


  public void transfer(Bus bus){
    for(int i = 0; i < peopleCount(); i++){
      bus.add(this.people[i]);
    }
    this.people = new Person[2];
  }

}
