
public class Project2 {
	public static void main(String args[]){
		 int i1 = 1;
        int i2, iCounter, iTotal;
        i2 = iTotal = 0;
        iCounter = 1;

        while(i1 < 4000000 && i2 < 4000000){
            if(i1 >= i2){
                i2 = i1 + i2;
                iCounter++;
                if(iCounter % 3 == 0){
                    iTotal = iTotal + i2;
                    //System.out.println(i2);
                }
            }
            if(i2 > i1){
                i1 = i1 + i2;
                iCounter++;
                if(iCounter % 3 == 0){
                    iTotal = iTotal + i1;
                    //System.out.println(i1);
                }
            }
        }
        System.out.println(iTotal);
	}
}
