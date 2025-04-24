from collections import defaultdict
def solution(genres, plays):
    answer = []
    n = len(genres)
    genre_play_count = defaultdict(int)
    genre_songs = dict()
    for i in range(n):
        genre_play_count[genres[i]]+=plays[i] # 장르당 총 재생 횟수
        if genres[i] in genre_songs: # 장르별 각 노래 [인덱스, 재생수] 저장
            genre_songs[genres[i]].append((i, plays[i]))
        else: genre_songs[genres[i]] = [(i, plays[i])]
        
    genre_sorted = sorted(genre_play_count.items(), key=lambda x : x[1], reverse=True) # 재생순 내림차순 정렬
    for genre,_ in genre_sorted:
        songlist = sorted(genre_songs[genre], key=lambda x : x[1], reverse=True)
        idx=0
        for song in songlist:
            if idx>1: break
            answer.append(song[0])
            idx+=1
    return answer