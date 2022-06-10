public class Musharruf{
    private int roll;
    private String name;
    Musharruf(int rollno, String Name){
        roll = rollno;
        name = Name;
    }
    Musharruf(Musharruf Mush){
        roll = Mush.roll;
        name = Mush.name;
        System.out.println("\nthe copy constructor is invoked----\n");
    }
    String printName(){
        return name;
    }
    int printRoll(){
        return roll;
    }
    public static void main(String [] args){
        Musharruf m1 = new Musharruf (598,"Md Musharruf Nawaz");
        System.out.println("the name of the first student is :"+m1.printName());
        System.out.println("the roll no of the first student is :"+m1.printRoll());
        
        Musharruf m2 = new Musharruf (m1);
        System.out.println("the name of the first student is :"+m2.printName());
        System.out.println("the roll no of the first student is :"+m2.printRoll());
    }
}
