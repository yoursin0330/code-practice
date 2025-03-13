import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int[][] land = new int[n][m];
        int minHeight = 256, maxHeight = 0;
        
        // 입력 받기 및 최소, 최대 높이 찾기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                land[i][j] = Integer.parseInt(st.nextToken());
                minHeight = Math.min(minHeight, land[i][j]);
                maxHeight = Math.max(maxHeight, land[i][j]);
            }
        }

        int minTime = Integer.MAX_VALUE;
        int bestHeight = minHeight; // 최소 높이부터 시작

        // 가능한 모든 높이에 대해 시간 계산
        for (int h = minHeight; h <= maxHeight; h++) {
            int removeBlocks = 0, addBlocks = 0;
            
            // 높이 조정 작업 수행
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (land[i][j] > h) {
                        removeBlocks += land[i][j] - h; // 블록 제거
                    } else if (land[i][j] < h) {
                        addBlocks += h - land[i][j]; // 블록 추가
                    }
                }
            }
            
            // 인벤토리에 블록이 충분한지 확인
            if (removeBlocks + b >= addBlocks) {
                int time = removeBlocks * 2 + addBlocks; // 제거는 2초, 추가는 1초
                
                // 최소 시간 갱신 + 높이가 같다면 더 높은 높이 선택
                if (time < minTime || (time == minTime && h > bestHeight)) {
                    minTime = time;
                    bestHeight = h;
                }
            }
        }

        System.out.println(minTime + " " + bestHeight);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
