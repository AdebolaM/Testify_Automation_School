//   You are to create 3 variables for a "square shape" class
// which will be "class A", shapeSides (number of sides of the shape), 
//shape length and shape breadth. From your knowledge of encapsulation, 
//create getters and setters for lenght and breadth variables and 
//create only a getter for shape side(this is becasue we dont want anyone setting the sides of a square. 
//the sides of the sqaure must and always will be 4). Create another class "B", set the values of length and breadth.
// Get the value of the length and breadth and calculate the area. print out your final calculati0n like this. 
//"The area of a sqaure of length: {put the value of the length} and breadth {put the value of the breadth} 
//is {put the value of the area u calculated}"

public class ClassA {
int Lenght;
double breath;
int sides = 4;



public int getLenght() {
    return Lenght;
}
public void setLenght(int lenght) {
    Lenght = lenght;
}
public double getBreath() {
    return breath;
}
public void setBreath(double breath) {
    this.breath = breath;
}
public int getSides() {
    return sides;
}


}

