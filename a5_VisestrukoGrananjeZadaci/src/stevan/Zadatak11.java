package stevan;

public class Zadatak11 {

	public static void main(String[] args) {
	        
        int s, d, j, arm;
      
        for(int i = 100; i <= 999; i++) {
        	
	        	s = i / 100;
	            d = (i - (s * 100)) / 10;
	            j = i - s * 100 - d * 10;
	            arm = s*s*s + d*d*d + j*j*j;
	            
            if(i == arm ) {
            	System.out.print(i+ " ");
        	}
        }
	}
}
