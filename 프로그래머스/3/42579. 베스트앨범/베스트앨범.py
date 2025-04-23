from collections import defaultdict
def solution(genres, plays):
    answer = []
    genre_play_cnt = defaultdict(int)
    genre_songs = dict()
    for i in range(len(genres)):
        genre_play_cnt[genres[i]]+=plays[i]
        if genres[i] in genre_songs: genre_songs[genres[i]].append((plays[i],i))
        else: genre_songs[genres[i]] = [(plays[i], i)]
    sorted_genres = sorted(genre_play_cnt, key = lambda x: genre_play_cnt[x], reverse=True)
    for genre in sorted_genres:
        song_list = genre_songs[genre]
        song_list.sort(key=lambda x: (-x[0],x[1]))
        cnt=0
        for x in song_list:
            if cnt==2: break
            answer.append(x[1])
            cnt+=1
    return answer