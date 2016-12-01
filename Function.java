public class Function {
    public static void main(String[]args){
        checkWheather(40);
        sumBlock(1,2,3);
        int sum =(2+8);
        sum(2,3);
        System.out.println("Sum :"+sum);
    }
    
    public static void checkWheather(int wheather){
        if(wheather<30)
        System.out.println("Suhu :" +wheather+" celcius /t dingin bro");
        else
        System.out.println("Suhu " +wheather+" celcius /t panas bro");
    }
    
    public static void sumBlock(int lenght, int width, int height){
        int total=lenght*width*height;
        System.out.println("Sum Block:"+total);
    }
    
    public static void sum(int width, int height){
        int sum=width*height;
        System.out.println("Sum Method:"+sum);
    }  
}
