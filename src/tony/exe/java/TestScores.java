package tony.exe.java;
import java.util.Scanner;
import java.util.Vector;

public class TestScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Input the numbers of students (Negative number will end the inputing)");
		Vector v = new Vector();
		int max = 0;
		for(;;){
			
			int score = input.nextInt();
			if(score<0){
				break;
			}
			
			if(max < score){
				max = score;
			}
			Integer score1 = new Integer(score);
			v.addElement(score1);
			
		}
		
		for(int i =0;i<v.size();i++){
			Integer score = (Integer)v.elementAt(i);
			
			String level;
			if(max -score <= 10){
				level = "A";
			} else if(max-score <= 20){
				level="B";
			} else if(max - score <= 30){
				level = "C";
				
			}else {
				level = "D";
			}
			System.out.println("Student's score: " + score+", and its level is: " +level);
		}
		
		
		
		
		
		
	}
}
