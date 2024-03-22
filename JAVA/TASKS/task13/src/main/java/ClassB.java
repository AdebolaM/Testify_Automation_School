public class ClassB {
    public static void main(String[] args) {
        ClassA name = new ClassA();
        name.Name = "adebola"; 
        ClassA fulldetails = new ClassA("adebola", 8);
        fulldetails.WhoisThere();

        ClassA fulldatailAndtime =new ClassA("adebola",8,2.4);
        fulldatailAndtime.WhoisThere();
       
    }



}
