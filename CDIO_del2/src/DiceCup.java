import java.util.ArrayList;
import java.util.stream.Stream;

public class DiceCup {
	private Die[] dice;
	
	DiceCup(Die[] dice){
		this.dice = dice;
	}
	
	public int[] getValues(){
		int[] values = new int[dice.length];
		return Stream.of(this.dice).mapToInt(Die::getValue).toArray();
	}
	public int getSum(){
		int sum = 0;
		for (Die die : this.dice){
			sum += die.getValue();
		}
		return sum;
	}
	public int[] getRoll(){
		this.roll();
		return this.getValues();
	}
	public int roll(){
		for (Die die : this.dice){
			die.roll();
		}
		return this.getSum();
	}
}
