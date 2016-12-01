public class Swaping
{
    public static void main(String[] args){
       int var1 =5;
       int var2 =6;
       int var3= var1+var2;
       System.out.println("Data");
       System.out.println("Variable1:"+var1);
       System.out.println("Variable2:"+var2);
       var1 = var3-var1;
       var2 = var3-var1;
       System.out.println("After swaped");
       System.out.println("Variable1:"+var1);
       System.out.println("Variable2:"+var2);
    }
}