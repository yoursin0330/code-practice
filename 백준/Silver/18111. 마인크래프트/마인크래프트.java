import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] count = new int[257]; // 높이별 블록 개수 저장 (0~256)
        int minH = 256, maxH = 0; // 최소, 최대 높이 저장
        int totalBlocks = B; // 인벤토리 포함 총 블록 개수

        // 높이 개수 카운팅
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int h = Integer.parseInt(st.nextToken());
                count[h]++;
                minH = Math.min(minH, h);
                maxH = Math.max(maxH, h);
                totalBlocks += h;
            }
        }

        int minTime = Integer.MAX_VALUE;
        int bestHeight = minH;

        // 가능한 모든 높이 탐색
        for (int h = minH; h <= maxH; h++) {
            int removeBlocks = 0, addBlocks = 0;

            for (int i = 0; i <= 256; i++) {
                if (count[i] > 0) {
                    if (i > h) removeBlocks += (i - h) * count[i]; // 블록 제거
                    else if (i < h) addBlocks += (h - i) * count[i]; // 블록 추가
                }
            }

            if (removeBlocks + B >= addBlocks) { // 인벤토리로 만들 수 있는 경우
                int time = removeBlocks * 2 + addBlocks;
                if (time < minTime) {
                    minTime = time;
                    bestHeight = h;
                } else if (time == minTime) {
                    bestHeight = Math.max(bestHeight, h); // 높이가 높을수록 우선
                }
            }
        }

        System.out.println(minTime + " " + bestHeight);
    }
}
