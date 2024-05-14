public class Main {
   public static void main(String[] args) {
      // Write your solution here
      Object obj1 = new Object(); // (1)

      Object obj2 = new String("Object"); // (2)

      String str = new Object(); // (3)

      Object obj3 = new MyCustomClass(); // (4)
   }
}