package FPPPretest;

public class Driver {
	public static void main(String[] args){
		Figure[] figure={new UpwardHat(),new DownwardHat(),new FaceMaker(), new Vertical()};
		
		for(Figure figure1:figure){
			figure1.getFigure();
		}
		
		System.out.println("");
		for (Figure figure2:figure){
			System.out.print(figure2.getClass().getSimpleName()+": ");
			figure2.getFigure();
			System.out.println("");
		}
	}

}
