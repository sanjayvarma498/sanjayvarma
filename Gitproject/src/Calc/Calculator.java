package Calc;

public class Calculator {
	
	
		public int add(int a, int b){
			return Math.addExact(a, b);
		}
		
		public int add(int...integers){
			int a=0;
			for(int i=0; i<integers.length;i++){
				a=a+integers[i];
			}
			return a;
		}
		
	}


