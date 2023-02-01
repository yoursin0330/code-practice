import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        while(n>0) {
        	int temp=n/2;
        	ans+=n-temp*2;
        	n=temp;
        }
        return ans; 
    }
}