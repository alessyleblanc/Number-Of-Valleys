package myPackage;

/*
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MyClass {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	String a = "ABCDE";
        String[] path = a.split("");
        int[] pathNew = new int[n];
        
        for(int i = 0; i < n; i++) {
            path[i] = path[i].replaceAll("D", "-1").replaceAll("U", "1");
            pathNew[i] = Integer.parseInt(path[i]);
        }
        
        int location = 0;
        int valleyCount = 0;
        for(int i = 0; i < pathNew.length; i++) {
            location = location + pathNew[i];
            if(location == 0 && i != 0 && (pathNew[i] > 0)) {
                valleyCount++;
            }
        }
        return valleyCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

*/







import java.lang.Character.*;
import java.util.*;
import java.io.*;
import java.math.*;


/*public class MyClass {
	public static void main(String[] args) {
		String s = "UDDDUDUU";
		String[] path = s.split("");
		int[] pathNew = new int[path.length];
		int location = 0;
		int valleyCount = 0;
		
		for(int i = 0; i < path.length; i++) {
			path[i] = path[i].replaceAll("D", "-1").replaceAll("U", "1");
			pathNew[i] = Integer.parseInt(path[i]);
			location = location + pathNew[i];
			if(location == 0 && i > 0 && pathNew[i] > 0) {
				valleyCount++;
			}
		}
		System.out.print(valleyCount);
	}
}
*/

public class MyClass {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String input2 = br.readLine();
		double inp = Double.parseDouble(input);
		
		double a = 39.3;
		System.out.println(Math.ceil(a));
		
		
		
	}
}
