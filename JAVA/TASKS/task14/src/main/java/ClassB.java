//   You are to create 3 variables for a "square shape" class
// which will be "class A", shapeSides (number of sides of the shape), 
//shape length and shape breadth. From your knowledge of encapsulation, 
//create getters and setters for lenght and breadth variables and 
//create only a getter for shape side(this is becasue we dont want anyone setting the sides of a square. 
//the sides of the sqaure must and always will be 4). Create another class "B", set the values of length and breadth.
// Get the value of the length and breadth and calculate the area. print out your final calculati0n like this. 
//"The area of a sqaure of length: {put the value of the length} and breadth {put the value of the breadth} 
//is {put the value of the area u calculated}"
public class ClassB {


public static void main(String[] args) {
    ClassA values = new ClassA();
   values.setLenght(8);
   int MyShapelenght = values.getLenght();
   values.setBreath(8);
    double MyShapeBreath = values.getBreath();
    int MyShapeside = values.getSides();

    double area = MyShapeBreath * MyShapelenght;

    System.out.println("The area of a " + MyShapeside + " sides sqaure, with a of length: " + MyShapelenght + " and breadth " + MyShapeBreath + " is " + area );


}
}
