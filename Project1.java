package io.github.aleuzelav2.ProjectEuler;

public class Project1 {
	  public static void main( String[] args){
		  int i3 = 3;
		  int i5 = 5;
		  int i15 = 15;
		  int i3Total, i5Total, iTotal, i15Total; 
		  i3Total = i5Total = iTotal = i15Total= 0;

		  while (i3 < 1000){
			  i3Total = i3Total + i3;
		      i3 = i3 + 3;
		  }
		  while (i5 < 1000){
			  i5Total = i5Total + i5;
			  i5 = i5 + 5;
		  }

		  while (i15 < 1000){
			  i15Total = i15Total + i15;
			  i15 = i15 + 15;
		  }

		  iTotal = i3Total + i5Total - i15Total;

		  System.out.println(iTotal);
	  }
}





