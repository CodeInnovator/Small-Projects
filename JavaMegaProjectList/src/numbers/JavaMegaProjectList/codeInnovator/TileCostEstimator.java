package numbers.JavaMegaProjectList.codeInnovator;

public class TileCostEstimator {
	/**
	 * 
	 * @author CodeInnovator
	 * Date : October. 18. 2015.
	 *
	 **/	

	public static void main(String[] arg){
		//Width: 20 Height 30 cost per square food: $10.25 Expected result $12000.
		System.out.println(tileCostEstimator(20, 30, 10.25));
	}
	/**
	 * 6.Find Cost of Tile to Cover W x H Floor - Problem:
	 *  Calculate the total cost of tile it would take to cover a floor plan of width and height, 
	 *  using a cost entered by the user.
	 */	
	public static double tileCostEstimator(double width, double height, double costPerSquare){
		double cost = width * height *costPerSquare;
		return cost;

	}
}
