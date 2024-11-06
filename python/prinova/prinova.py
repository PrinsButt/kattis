import bisect

# Read the number of boys
num_boys = int(input())

# Read and sort the list of boy names (assumed to be integers)
boy_names = sorted(map(int, input().split()))

# Read the minimum and maximum range for girl names
min_range, max_range = map(int, input().split())

# Determine the first odd number in the specified range
starting_odd = min_range if min_range % 2 != 0 else min_range + 1

# Generate a list of girl names as odd numbers within the given range
girl_names = list(range(starting_odd, max_range + 1, 2))

# Initialise variables to track the best girl name and maximum minimum distance
best_name = None
max_distance = -1

# Iterate through each girl name to find the one with the maximum minimum distance
for girl_name in girl_names:

    # Use binary search to find the closest position for girl_name in the sorted list of boy_names
    pos = bisect.bisect_left(boy_names, girl_name)

    # Start with an infinite distance to ensure it gets updated with a real minimum distance
    min_distance = float('inf')

    # Check the distance to the closest boy's name at or after the insertion point (if it exists)
    if pos < len(boy_names):
        min_distance = abs(boy_names[pos] - girl_name)

    # Check the distance to the closest boy's name before the insertion point (if it exists)
    if pos > 0:
        min_distance = min(min_distance, abs(boy_names[pos - 1] - girl_name))

    # Update best_name if the current girl_name has a larger minimum distance
    if min_distance > max_distance:
        max_distance = min_distance
        best_name = girl_name

# Output the best girl's name with the maximum minimum distance from any boy's name
print(best_name)
