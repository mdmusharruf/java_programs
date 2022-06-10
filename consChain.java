class Demo{
    
    Demo(){
        this("java","programming");
        System.out.println("this is default constructor of base class");
    }
    
    Demo(String str1,String str2){   
        System.out.println("this is parameterized constructor of base class");
    }
    
}

public class consChain extends Demo{

    consChain(){
        this(598,98);   
        System.out.println("this is default constructor of derived  class");
    }
    
    consChain(int x,int y){
        super();
        System.out.println("this is parameterized constructor of derived class");            
    }
    
    public static void main(String [] args){
        
        consChain m= new consChain();
        
    }
}
