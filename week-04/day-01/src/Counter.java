public class Counter {
  int number ;
  int workWith;

  public Counter() {
    number = 0;
    workWith = 0;
  }


  public Counter(int baseValue) {
     number = baseValue;
     workWith = baseValue;
  }

  public int add(int whatWeAdd) {
    workWith = workWith + whatWeAdd;
    return workWith;
  }

  public void add() {
    workWith ++ ;

  }

  public int get() {
    return workWith;
  }

  public int  reset() {
    workWith = this.number;
    return workWith;
  }

}