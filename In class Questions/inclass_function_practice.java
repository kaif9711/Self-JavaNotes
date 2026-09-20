public class inclass_function_practice
{
//    public static void main(String[] args){
//        int c = 9;
//        int k = 10;
//        int addition = add(c,k);
//        System.out.println(addition);
//
//
//
//}
////    public static void add(int a, int b){
////        System.out.println(a + b);
//    public static int  add(int a, int b){
//        int sum = 0;
//        sum = a + b;
//        return sum;
//    }


   public static void main(String[] args){
       double sl1 = (calsal(5000,3000));
       double sl2 =(calsal(2000,8000));
       int k = 4000;
       int i = 3000;
       double sl3 =(calsal(k,i));

       System.out.println("emp1 one salary" + sl1);
       System.out.println("emp2 one salary" + sl2);
       System.out.println("emp2 one salary" + sl3);

   }

   static double calsal(double basic, double bonus){
       return basic+bonus;
   }


}
