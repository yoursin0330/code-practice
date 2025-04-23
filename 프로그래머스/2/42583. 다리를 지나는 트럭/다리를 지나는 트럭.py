def solution(bridge_length, weight, truck_weights):
    time = 0
    idx=0
    curr_weight=0
    curr_truck=list()
    while True:
        time+=1
        if len(curr_truck) > 0 and curr_truck[0][1] == time - bridge_length:
            curr_weight-=curr_truck.pop(0)[0]
        if idx<len(truck_weights) and bridge_length >= len(curr_truck) + 1 and curr_weight + truck_weights[idx] <= weight:
            curr_truck.append((truck_weights[idx], time)) 
            curr_weight+=truck_weights[idx]
            idx+=1
        if idx >= len(truck_weights) and not curr_truck: return time