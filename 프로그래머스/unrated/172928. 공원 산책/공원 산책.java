class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        for(int i=0;i< park.length;i++){ //시작점 찾기
            if(park[i].contains("S")){
                answer[0]=i;
                answer[1]=park[i].indexOf("S");
                break;
            }
        }

        for(String route:routes){
            String[] rr = route.split(" ");
            int move=Integer.parseInt(rr[1]);
            switch (rr[0].charAt(0)){
                //동서 방향
                case 'W':
                    if(-move+answer[1]<0 || -move+answer[1]>=park[1].length()) continue;
                    for(int i=1;i<=move;i++){
                        if(park[answer[0]].charAt(--answer[1])=='X'){
                            answer[1]+=i; //롤백
                            break;
                        }
                    }
                    break;
                case 'E':
                    if(move+answer[1]<0 || move+answer[1]>=park[1].length()) continue;
                    for(int i=1;i<=move;i++){
                        if(park[answer[0]].charAt(++answer[1])=='X'){
                            answer[1]-=i; //롤백
                            break;
                        }
                    }
                    break;

                case 'N':
                    if(-move+answer[0]<0 || -move+answer[0]>=park.length) continue;
                    for(int i=1;i<=move;i++){
                        if(park[--answer[0]].charAt(answer[1])=='X'){
                            answer[0]+=i; //롤백
                            break;
                        }
                    }
                    break;

                case 'S':
                    if(move+answer[0]<0 || move+answer[0]>=park.length) continue;
                    for(int i=1;i<=move;i++){
                        if(park[++answer[0]].charAt(answer[1])=='X'){
                            answer[0]-=i; //롤백
                            break;
                        }
                    }
                    break;
            }
        }
        return answer;
    }
}