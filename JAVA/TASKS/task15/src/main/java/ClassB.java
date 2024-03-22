public class ClassB extends ClassA {
    public static void main(String[] args) {
        ClassA daysoftheweek = new ClassA();
        ClassB restoftheweek = new ClassB();

    daysoftheweek.Monday();
    daysoftheweek.Tuesday();
    daysoftheweek.Wednesday();
    restoftheweek.thursday();
    restoftheweek.friday();
    }

    public void thursday (){
        System.out.println("thursday");
    }
    public void friday (){
        System.out.println("friday");
    }
    
}
