package javaprojects;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
 //using for loop
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");
 
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
//using while loop
		/*
		 * int i = 1, n = 10, t1 = 0, t2 = 1; System.out.print("First " + n +
		 * " terms: ");
		 * 
		 * while (i <= n) { System.out.print(t1 + " + ");
		 * 
		 * int sum = t1 + t2; t1 = t2; t2 = sum;
		 * 
		 * i++; }
		 */   
        
        
	}

}
