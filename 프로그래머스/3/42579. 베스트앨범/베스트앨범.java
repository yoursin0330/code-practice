import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> playCntMap = new HashMap<>();
        Map<String, ArrayList<int[]>> genreMap = new HashMap<>();
        for(int i=0;i<genres.length;i++){
            // 장르별 총 재생횟수
            playCntMap.put(genres[i], playCntMap.getOrDefault(genres[i],0)+plays[i]);
            // 장르별 곡 저장
            genreMap.computeIfAbsent(genres[i], x -> new ArrayList<>()).add(new int[]{plays[i],i});
        }

        // 2. 장르를 총 재생 순으로 정렬
        List<String> genreList = new ArrayList<>(playCntMap.keySet());
        genreList.sort((a,b) -> playCntMap.get(b) - playCntMap.get(a));

        //3. 장르별로 재생 수 정렬 후 상위 2개 선택
        for(String genre : genreList){
            List<int[]> songs = genreMap.get(genre);
            songs.sort((a,b) -> (a[0]==b[0])? a[1]-b[1] : b[0]-a[0]);
            answer.add(songs.get(0)[1]);
            if(songs.size()>1){
                answer.add(songs.get(1)[1]);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}