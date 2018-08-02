import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class question_11055 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		List<Integer> arr = new ArrayList<>();
		arr.add(0);
		while(st.hasMoreTokens()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		int[] dp = new int[1001];
		
		int max=-1;
		dp[0]=arr.get(0);
		for(int i=1;i<=arr.size()-1;i++) {
			for(int j=0;j<i;j++) {
				if(arr.get(i)>arr.get(j)) {
					dp[i]=Math.max(dp[j]+arr.get(i), dp[i]);
				}
				max=Math.max(max,dp[i]);
			}
		}
		System.out.println(max);
	}

}
