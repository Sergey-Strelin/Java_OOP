public class app {

  public static void main(String[] args) {
    new Innerapp(new Printer()).write();
  }
}

interface IInterface {
  void print();
}

class Printer implements IInterface {
  
  public void print() {
    System.out.println();
  }
    
}

class Innerapp {
  IInterface v;

  public Innerapp(IInterface v) {
    this.v = v;
  }

  void write() {
    v.print();
  }

}