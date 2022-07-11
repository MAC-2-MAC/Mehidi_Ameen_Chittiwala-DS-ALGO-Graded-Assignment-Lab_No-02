package problem_01;
public class Transaction {
	int isTargetAchieved(int [] arr, int target) {
		int status = -1;
		long sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			if(sum>= target) {
				status = i+1;
				break;
			}
		}
		return status;
	}

}