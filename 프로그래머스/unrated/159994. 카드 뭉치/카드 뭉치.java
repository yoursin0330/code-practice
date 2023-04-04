class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int oneIdx=0, twoIdx=0;
        for(int goalIdx=0;goalIdx<goal.length;goalIdx++){
            if(oneIdx< cards1.length && cards1[oneIdx].equals(goal[goalIdx])) oneIdx++;
            else if(twoIdx< cards2.length && cards2[twoIdx].equals(goal[goalIdx])) twoIdx++;
            else return "No";
        }
        return "Yes";
    }
}