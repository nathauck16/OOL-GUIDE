class Main {
  public static void main(String[] args) {

    /*you can do it like this, but it is more repetitive than method shown below
    //new object of robot class
    Robot r1 = new Robot();
      r1.name = "Tom";
      r1.color = "red";
      r1.weight = 30;

    Robot r2 = new Robot();
      r2.name = "Jerry";
      r2.color = "blue";
      r2.weight = 40;
    */

    Robot r1 = new Robot("Tom", "Red", 30);

    Robot r2 = new Robot("Jerry", "blue", 40);

    r1.introduceSelf();

    r2.introduceSelf();
  }
}