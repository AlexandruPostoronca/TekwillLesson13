import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        int yearOfPublishing = Integer.parseInt(scanner.nextLine());
        String[] authors = scanner.nextLine().split(", ");
        Book book = new Book(title, yearOfPublishing, authors);
        System.out.println(book);
    }
}