import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
		// while (num > 9){
		// 	digitList.add(num%10);
		// 	num = num /10;
		// }
	 //    	digitList.add(num);
		// ArrayList<Integer> fixer = new ArrayList <Integer>();
		// int k = digitList.size()-1;
		// for (int i = 0; i < digitList.size(); i++){
		// 	fixer.add(digitList.get(k));
		// 	k--;
		// }
		// digitList = fixer;

        digitList = new ArrayList<Integer>(); 
		if(num==0){
			digitList.add(new Integer(0));
		}
	    while(num!=0){
		    digitList.add(0, new Integer(num%10));
		    num/=10;
	    }
	}

	public boolean isStrictlyIncreasing()
	{ 
		for (int j = 0; j < digitList.size()-1; j++){
			if (digitList.get(j) >= digitList.get(j+1)){
				return false;
			}
		}
		return true;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
