package model;

public class Turn {
	private int number;
	private char letter;
	

	/**
	 * @param number
	 * @param letter
	 */
	public Turn(int number,char letter) {
		
		this.number = 0;
		this.letter = 'A';
	}
	
	public String getName() {
		String msg ="";
		
		if(number<=9) {
			msg="el turno es: " + letter + 0 + number;
			}
		else {
			msg="el turno es: " + letter +  number;
		}
		getNextTurn();
		
		return  msg;
	}
	
	public Turn getNextTurn() {
		char letter2 = letter;
		int number2=number+1;
		
		if(number2==100) {
			number2=0;
			if(letter2=='z') {
				letter2='A';
			}
			else {
				letter2++;
			}
		}
		return new Turn(number2,letter2);
		
	}


	


}
