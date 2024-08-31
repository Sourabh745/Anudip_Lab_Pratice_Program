import java.util.*;

public class BooksOperation {
    private static ArrayList<BooksDetail> bList;
    
    public BooksOperation(){
        bList = new ArrayList<>();
    }

    public static void insertingBooks(){
        BooksDetail data;
        Scanner sc = new Scanner(System.in);

        // Entering the data of book here

        System.out.print("Enter the id of the Book: ");
        String bId = sc.nextLine();
        System.out.print("Enter the Name of the Book: ");
        String bName = sc.nextLine();
        System.out.print("Enter the Author of the Book: ");
        String bAuthor = sc.nextLine();

        data = new BooksDetail(bId, bName, bAuthor);

        bList.add(data);
    }
}
