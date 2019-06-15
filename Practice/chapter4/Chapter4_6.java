public class Chapter4_6 {
	public static void main(String[] args) {
		double a1 = Math.random() * 2 * Math.PI;
		double a2 = Math.random() * 2 * Math.PI;
		double a3 = Math.random() * 2 * Math.PI;
		
		double x1 = 40 * Math.cos(a1);
		double y1 = 40 * Math.sin(a1);
		double x2 = 40 * Math.cos(a2);
		double y2 = 40 * Math.sin(a2);
		double x3 = 40 * Math.cos(a3);
		double y3 = 40 * Math.sin(a3);
		
		double distance1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double distance2 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		double distance3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double angle1 = Math.toDegrees(Math.acos((distance1 * distance1 - distance2 * distance2 - distance3 * distance3) / (-2 * distance2 * distance3)));
		double angle2 = Math.toDegrees(Math.acos((distance2 * distance2 - distance1 * distance1 - distance3 * distance3) / (-2 * distance1 * distance3)));
		double angle3 = Math.toDegrees(Math.acos((distance3 * distance3 - distance2 * distance2 - distance1 * distance1) / (-2 * distance2 * distance1)));
		
		System.out.println("The triangle's angle 1 is " + angle1 + " degrees and angle 2 is " + angle2 + " degrees and angle 3 is " + angle3 + " degrees");
	}
}