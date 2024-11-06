num_boys = int(input())
boy_names = sorted(list(map(int, input().split())))
min_range, max_range = list(map(int, input().split()))

starting_odd = min_range if min_range % 2 != 0 else min_range + 1
girl_names = list(range(starting_odd, max_range + 1, 2))

best_name = None
max_distance = -1

for girl_name in girl_names:
    closest = min(boy_names, key=lambda boy_name: abs(boy_name - girl_name))
    min_distance = abs(closest - girl_name)
    if min_distance > max_distance:
        max_distance = min_distance
        best_name = girl_name

print(best_name)
