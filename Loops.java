public class Loops {
    public static void main(String[]args){   
     sum(3);
    }
    
    public static void number10(int jum){
        
        for(int i=1; i<=jum; i++){
            System.out.println(i);
        }
    }
    
    public static void number2(int jum){
        for(int i=0; i<=jum; i+=2){
            System.out.println(i);
        }
       
    }
    
    public static void numberGanjil(int jum){
        for(int i=0; i<=jum; i++){
            if((i%2)!=0)
             System.out.println(i);
        } 
    }


public static void number25(int jum){
    
        for(int i=1; i<=jum; i++){
            System.out.print(i+" ");
            if(i%5==0)
            System.out.println("\n");
        }
                  

}


public static void number14(){
        for(int i=14; i>=0; i-=2){
            System.out.print(i);
        }
    }



public static void sum( int jum){
        int j=0;
        for(int i=1; i<=jum; i++){
           j+=i; 
        }
        System.out.print(j);
    }
}

