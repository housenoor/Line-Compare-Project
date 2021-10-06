package Day3linecompare;

public class UC3_Linecompare {
	public static class lineComparision {
		// variables
		public int x1, x2, y1, y2;
		

		public lineComparision(int x1, int x2, int y1, int y2) {
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
		}

		public double calculateDistanceOfLine() {
			double lineComparision = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			return lineComparision;
		}

		// method for calculate two lengths equal
		public static void diffOfLine(double length1, double length2) {
			if (length1 < length2) {
				System.out.println("line-1 is less than line-2.");
			} else if (length2 < length1) {
				System.out.println("line-2 is less than line-1.");
			} else {
				System.out.println("Both line has equal length.");
			}
		}

		// method for comparing the lengths
		public static void main(String[] args) {
			System.out.println("Welcome to the Line comparision problem");

			lineComparision line1 = new lineComparision(2, 4, 6, 8);
			double length1 = line1.calculateDistanceOfLine();
			System.out.println("Length of line-1 = " + length1);

			lineComparision line2 = new lineComparision(3, 5, 7, 9);
			double length2 = line2.calculateDistanceOfLine();
			System.out.println("Length of line-2 = " + length2);
			diffOfLine(length1, length2);
		}
	}
}
