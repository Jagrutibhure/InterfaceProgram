package Interface;
 public class MyCalculator implements AdvArithmetic{
 
    int m=0;
  public void divisorSum(int n){
    for(int i=1; i<=n; i++){
     if(n%i==0){
       m=m+i;
     }
   }
   System.out.println(" Divisor Of Sum is " +m);
   }
    public static void main(String args[]){
     MyCalculator m = new MyCalculator();
      m.divisorSum(6);
   }
}
   public interface AdvArithmatic{
   default void divisorSum(int n){
   }
}