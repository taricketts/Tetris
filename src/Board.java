import java.util.*;
import java.lang.*;
public class Board {
	
final int EMPTY = 0;
final int RED = 1;
final int BLUE = 2;
final int GREEN = 3;
final int YELLOW = 4;

int board[][];
int currentColor;

Location currentShape[];


	public Board(){
		board = new int[22][10];
		for(int x = 0; x < 22; x++){
			for(int y = 0; y < 10; y++){
				board[x][y] = EMPTY;
			}
		}
		currentShape = new Location[4];
		for(int i = 0; i < 4; i++){
			currentShape[i] = new Location();
		}
	}
	
	public String toString(){
		String bd = "";
		for(int x = 0; x < 22; x++){
			for(int y = 0; y < 10; y++){
				bd += board[x][y] + " ";
			}
			bd += "\n";
		}
		
		return bd; 
	}

	private void pickColor(){
		currentColor = ((int) (Math.random() * 4)) + 1;
	}
	
	private void pickShape(){
		int tmp = ((int) (Math.random() * 5));
		
		switch(tmp){
		//CASE 0: 2X2 BLOCK
		case 0: currentShape[0].setXY(0,4);
				currentShape[1].setXY(0,5);
				currentShape[2].setXY(1,4);
				currentShape[3].setXY(1,5);
				break;
		//CASE 1: L SHAPE
		case 1: currentShape[0].setXY(0,4);
				currentShape[1].setXY(0,5);
				currentShape[2].setXY(1,4);
				currentShape[3].setXY(2,4);
				break;
		//CASE 2: STRAIGHT BLOCK
		case 2: currentShape[0].setXY(0,3);
				currentShape[1].setXY(0,4);
				currentShape[2].setXY(0,5);
				currentShape[3].setXY(0,6);
				break;
		//CASE 3: INDENT BLOCK A
		case 3: currentShape[0].setXY(0,4);
				currentShape[1].setXY(0,5);
				currentShape[2].setXY(1,4);
				currentShape[3].setXY(1,3);
				break;
		//CASE 3: INDENT BLOCK B
		case 4: currentShape[0].setXY(0,4);
				currentShape[1].setXY(0,5);
				currentShape[2].setXY(1,5);
				currentShape[3].setXY(1,6);
				break;
		default: 
		}
	}
	
	public boolean addShape(){
		boolean verify = true;
		
		pickColor();
		pickShape();
		
		//BEGIN VALIDATION
		if(board[currentShape[0].getX()][currentShape[0].getY()]
				!= EMPTY){
			verify = false;
		}
		if(board[currentShape[1].getX()][currentShape[1].getY()]
				!= EMPTY){
			verify = false;
		}
		if(board[currentShape[2].getX()][currentShape[2].getY()]
				!= EMPTY){
			verify = false;
		}
		if(board[currentShape[3].getX()][currentShape[3].getY()]
				!= EMPTY){
			verify = false;
		}
		if(verify){
			board[currentShape[0].getX()][currentShape[0].getY()] = 
					currentColor;
			board[currentShape[1].getX()][currentShape[1].getY()] = 
					currentColor;
			board[currentShape[2].getX()][currentShape[2].getY()] =
					currentColor;
			board[currentShape[3].getX()][currentShape[3].getY()] = 
					currentColor;
		}
		//END VALIDATION
		//BEGIN SETTING
		
		//END SETTING
		return verify;
	}
}
