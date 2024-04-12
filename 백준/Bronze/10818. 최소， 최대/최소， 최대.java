import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < T; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				if(min > arr[i]) {
					min = arr[i];
				}
				if(max < arr[i]) {
					max = arr[i];
				}
		}
		System.out.println(min + " " + max);
		}

}