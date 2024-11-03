num_words, num_descriptions = map(int, input().split())

# Build the dictionary with words and their values
word_values = {word: int(value) for word, value in (input().split() for _ in range(num_words))}

# Initialise points list with zeros
points = [0] * num_descriptions

# Initialise count variable
count = 0

# Process each line of the job description
while count < num_descriptions:
    line = input().strip()
    if line == '.':
        count += 1
    else:
        # Accumulate the values of words in the current line for the current description
        points[count] += sum(word_values.get(word, 0) for word in line.split())

# Display each point value on a new line
print(*points, sep='\n')
