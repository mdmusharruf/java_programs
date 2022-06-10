class Room{
    double width,height,depth;
    
    Room(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }
    
    Room(){
        width = height = depth = 0;
    }
    
    Room(double len){
        width = height = depth = len;
    }
    
    double volume (){
        return width*height*depth;
    }
}
public class ConstructorOverloading{
    public static void main(String [] args){
    
        Room r1 = new Room(10,20,15);
        Room r2 = new Room();
        Room r3 = new Room(7);
        double vol ;
        
        vol = r1.volume();
        System.out.println("The volume of the Room 1 is "+vol);
        
        
        vol = r2.volume();
        System.out.println("The volume of the Room 2 is "+vol);
        
        
        vol = r3.volume();
        System.out.println("The volume of the Room 3 is "+vol);
    }
}
