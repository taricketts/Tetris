import java.util.*;
import java.lang.*;
public class Testing {

	public static void main(String[] args) {
		
		Board bd = new Board();
		
		System.out.println(bd.toString());
		/*
		int rand = 0;
		for(int i = 0; i < 10; i++){
			rand = ((int) (Math.random() * 5));
			System.out.println(rand);
		}
		*/
		boolean test = bd.addShape();
		System.out.println(bd.toString());
		System.out.println(test);
		
		test = bd.addShape();
		System.out.println(bd.toString());
		System.out.println(test);
	}

}
