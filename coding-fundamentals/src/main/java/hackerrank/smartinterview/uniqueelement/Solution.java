package hackerrank.smartinterview.uniqueelement;
import java.io.*;
import java.util.*;
//TC : n+n^2 O(n^2)
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        FastReader fastReader=new FastReader();
        int n=fastReader.nextInt();
        long[] inputElement=new long[n];
        StringBuilder output=new StringBuilder();
        try{
        	//Filling Array
        	for (int i = 0; i < n; i++) {
				inputElement[i]=fastReader.nextLong(); //n
			}
        	//Transverse Array and remove repeating element
        	for (long element : inputElement) {
        		//Will check repeatation of elements in array
        		int count=0;
				for (int i = 0; i < inputElement.length; i++) {
					if(element==inputElement[i]) {//n^2
						count++;
					}
					if(count>1) {
						break;
					}
				}
				if(count<2) {
					output.append(element).append(" ");
				}
			}
        	System.out.println(output.toString().trim());
        }catch(Exception e){
            
        }        
    }
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}