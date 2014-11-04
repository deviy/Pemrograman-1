public class descending {

	public static void main (String[]args) {
		int angka=9;
		int y,z;
		System.out.println ("descending angka\n");
		
		for (y=9; y>=1; y--) {
			for (z=1; z<=y; z++) {
			System.out.print (angka);
			}
			System.out.print ("\n");
			angka--;
		}
	}
}