import java.util.Scanner;
public class Library{
	String s;
	float rent;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String ob = scanner.nextLine();
		System.out.println("Available books in the library - 1. Fiction, 2. Non-Fiction, 3. Magazine");
		System.out.print("Select the type of book : ");	
        int bh = scanner.nextInt();
        System.out.print("Enter the number of days you want to rent the book : ");
        int bb = scanner.nextInt();
        if(bh==1){
            float rent = (float) (1.50 * bb);
            System.out.println("Your total rent is : " + rent);
        }
        if(bh==2){
            float rent = (float) (2.00 * bb);
            System.out.println("Your total rent is : " + rent);
		}
        if(bh==3){
            float rent = (float) (1.00 * bb);
            System.out.println("Your total rent is : " + rent);
    }
	}
}
