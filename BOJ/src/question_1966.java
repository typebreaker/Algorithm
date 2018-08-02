import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;


public class question_1966 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase=-1;
		testcase = Integer.parseInt(br.readLine());
		
		while(testcase > 0) {
			List<Integer> periority = new ArrayList<>();
			Queue<pair> que = new LinkedList<>();
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<n;i++) {
				int nowPriority = Integer.parseInt(st.nextToken());
				periority.add(nowPriority);
				
				que.add(new pair(i , nowPriority));
			}
			 
			Collections.sort(periority);
			int now = n-1;
			int count=1;
			
			while(true) {
				if(que.peek().priority == periority.get(now)) {
					if(m==que.peek().index) {
						System.out.println(count);
						break;
					}
					else {
						count++;
						now--;
						que.remove(que.peek());
					}
				} else {
					que.add(que.peek());
					que.remove(que.peek());
				}
			}
			testcase--;
		}
		
	}
	
	public static class pair {
		public int index, priority;
		
		public pair(int a, int b) {
			index=a;
			priority=b;
		}
		
	}

}
