public class ClassA {

String Name;
int age;
double duration;
//default
public ClassA (){}
// with input
public ClassA (String Name){
    this.Name = Name;
}
//
public ClassA (String Name, int age){
    this.age = age;
}
public ClassA (String Name, int age, double duration){
    this.duration = duration;
}
public void WhoisThere(){
    System.out.println("anything");
}
}
