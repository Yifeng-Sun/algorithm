package tx418.fo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		for(int i = 0; i < n; i++){
			String line1 = sc.nextLine();
			String line2 = sc.nextLine();
			if(line1.length()%2 == 1){
				if(line1.equals(line2)){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}else{
				//even
				if(isEqual(line1,line2)){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}
		}
	}

	private static boolean isEqual(String line1, String line2) {
		if(line1.equals(line2)){
			return true;
		}
		if(line1.length()%2 == 1){
			if(line1.equals(line2)){
				return true;
			}else{
				return false;
			}
		}else{
			//even
			String line1f = line1.substring(0,line1.length()/2);
			String line1b = line1.substring(line1.length()/2,line1.length());
			String line2f = line2.substring(0,line2.length()/2);
			String line2b = line2.substring(line2.length()/2,line2.length());
			return (isEqual(line1f,line2f)&&isEqual(line1b,line2b))||(isEqual(line1f,line2b)&&isEqual(line1b,line2f));
		}
	}
}
