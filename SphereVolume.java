import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double diam, rad, vol;
		
		System.out.println("The purpose for this program is to give to volume of any given Sphere");
		System.out.println("Enter Diameter for a sphere: ");
		diam = scan.nextDouble();
		
		rad = diam/2;
		vol = ((double)4/3) * Math.PI * Math.pow(rad, 3);
		
		System.out.println("The volume of the sphere is " + vol);

	}

}
