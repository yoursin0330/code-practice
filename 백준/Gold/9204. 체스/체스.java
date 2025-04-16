import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fail = "Impossible";
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스
        StringTokenizer st;
        int[] s = new int[2];
        int[] e = new int[2];
        StringBuilder sb = new StringBuilder();


        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            s[0] = st.nextToken().toCharArray()[0]-'A';
            s[1] = Integer.parseInt(st.nextToken())-1;
            e[0] = st.nextToken().toCharArray()[0]-'A';
            e[1] = Integer.parseInt(st.nextToken())-1;

            if((s[0]+s[1])%2!=(e[0]+e[1])%2)
                sb.append(fail);
            else if(s[0]==e[0]&&s[1]==e[1])
                sb.append("0 ").append(Character.toChars(s[0]+'A')).append(" ").append(s[1]+1);
            else if(Math.abs(s[0]-e[0]) ==Math.abs(s[1]-e[1])){
                sb.append("1 ").append(Character.toChars(s[0]+'A')).append(" ").append(s[1]+1).append(" ")
                        .append(Character.toChars(e[0]+'A')).append(" ").append(e[1]+1);
            }else{
                boolean found = false;
                for (int r = 0; r < 8 && !found; r++) {
                    for (int c = 0; c < 8; c++) {
                        if (Math.abs(s[0] - c) == Math.abs(s[1] - r) && Math.abs(e[0] - c) == Math.abs(e[1] - r)) {
                            // 중간 지점 (c, r)
                            char midCol = (char) (c + 'A');
                            int midRow = r + 1;
                            sb.append("2 ").append(Character.toChars(s[0]+'A')).append(" ").append(s[1]+1).append(" ")
                                    .append(midCol).append(" ").append(midRow).append(" ")
                                    .append(Character.toChars(e[0]+'A')).append(" ").append(e[1]+1);
                            found = true;
                            break;
                        }
                    }
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
