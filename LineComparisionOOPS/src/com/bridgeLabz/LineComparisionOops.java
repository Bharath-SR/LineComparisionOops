/**
 * 
 */
package com.bridgeLabz;

/**
 * @author Admin
 *
 */
public class LineComparisionOops {

	public int x1=2,x2=6,y1=4,y2=7;
	public int a1=4,a2=6,b1=4,b2=7;
	
	
	public int distanceEquals() {
		double distance1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		double distance2 =Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
		if(distance1 == distance2) {
			System.out.println("Two lines are equal");
		}else {
			System.out.println("Two lines are Not equal");
		}
		
		return 0;
		
	}
	public int distanceCompare() {
		Double distance1 =new Double(Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
		Double distance2 =new Double(Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1)));
		if(Double.compare(distance1,distance2)==0) {
			System.out.println("Two lines are equal");
		}else if(Double.compare(distance1, distance2)<0){
			System.out.println("distance 1 is lesser than distance 2");
		}else{
			System.out.println("distance 1 is greater than distance 2");
		}
		return 0 ;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LineComparisionOops lineCheck = new LineComparisionOops();
		lineCheck.distanceCompare();
		lineCheck.distanceEquals();
		
	}

}
