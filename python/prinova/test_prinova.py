import time
import importlib
from unittest.mock import patch

# Record start time for performance measurement
start_time = time.time()

# Test Case 1
with patch('builtins.input', side_effect=['3', '2 36 16', '20 50']):
    import prinova  # Import the module to test its execution

# Output execution time for Test Case 1
print(f'Execution time: {time.time() - start_time}\n')

# Reset start time for the next test
start_time = time.time()

# Test Case 2
with patch('builtins.input', side_effect=['3', '2 6 16', '3 15']):
    importlib.reload(prinova)  # Reload the module to reset its state for this test

# Output execution time for Test Case 2
print(f'Execution time: {time.time() - start_time}\n')

# Reset start time for the next test
start_time = time.time()

# Test Case 3
with patch('builtins.input', side_effect=['3', '2 6 16', '1 7']):
    importlib.reload(prinova)  # Reload the module again for an independent test

# Output execution time for Test Case 3
print(f'Execution time: {time.time() - start_time}\n')
