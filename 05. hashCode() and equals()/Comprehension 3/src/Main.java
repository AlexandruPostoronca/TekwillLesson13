public class Main {
   public static void main(String[] args) {
      // Write your solution here

      BlackBox bb1 = new BlackBox(13);
      BlackBox bb2 = new BlackBox(13);
      Object bb3 = new BlackBox(13);

      System.out.print(bb2.equals(bb3) + " ");

      bb1.updateIns(1, 4);

      System.out.print(bb1.equals(bb1) + " ");

      System.out.print(bb1.equals(bb3) + " ");

      bb2.updateIns(1, 4);

      System.out.print(bb2.equals(bb1));
   }
}