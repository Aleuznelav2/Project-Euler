

public class Project3 {
	public static void main(String[] args){
		 double dNumber = 1; //600851475143L
		 int iDivisor = 1;

		 while(iDivisor <= dNumber){
			 if(dNumber % iDivisor == 0){
		 		System.out.println(iDivisor);
		 		dNumber = dNumber / iDivisor;
		 	}
			 iDivisor++;
	 	}
	}
}

