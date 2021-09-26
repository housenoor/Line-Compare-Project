package linecompare;
import java.util.Scanner;

public class UC_LineComparison {
	
	public static void main(String[] args) {
        
		Scanner sc= new Scanner((System.in));
		System.out.println("Enter the x-axis co-ordinates");
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        System.out.println("Enter the Y-axis Co-ordinates");
        int y1=sc.nextInt();
        int y2=sc.nextInt();

        double lineLength=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("The length of Line is" + lineLength);
    }
		
		
	}

