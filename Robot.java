
class Robot{

//instance variables
String name;
String color;
int weight;


//constructor
Robot(String n, String c, int w){
  this.name = n;
  this.color = c;
  this.weight = w;
}


//print statement to introduce self
void introduceSelf(){
  System.out.println("My name is " + this.name);
}


}