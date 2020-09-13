package arithmetic;

public final class Exercise05Change {

	public final static int[] NOMINAL_VALUES = new int[] {50, 20, 10, 5, 2, 1};
	
	public final static int[] countChanges(int amount) {
		int[] result = new int[NOMINAL_VALUES.length];
		
		for (int i=0;i<NOMINAL_VALUES.length;i++) {
			if (amount<NOMINAL_VALUES[i]) {
				result[i]= 0;
				
			}
			else {
			result[i]= amount/NOMINAL_VALUES[i];
//			amount=amount-(result[i]*NOMINAL_VALUES[i]);
			amount= amount% NOMINAL_VALUES[i];
		}
		
	}
		return result;
}
}


//public final static int[] countChanges(int amount) {
//int [] result = new int[NOMINAL_VALUES.length];
//int tempAmount = amount;
//for (int i = 0; i < 6; i++) {
//if (tempAmount < NOMINAL_VALUES[i]) {
//result[i] = 0;
//} else if(tempAmount == NOMINAL_VALUES[i]){
//result[i] = 1;
//tempAmount = tempAmount - 1;
//}
//else if (tempAmount > NOMINAL_VALUES[i]) {
//int divide = tempAmount / NOMINAL_VALUES[i];
//result[i] = tempAmount / NOMINAL_VALUES[i];
//tempAmount = tempAmount - (divide * NOMINAL_VALUES[i]);
//}
//}
//return result;