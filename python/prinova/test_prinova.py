import time
import importlib
from unittest.mock import patch

start_time = time.time()

# Test 1
with patch('builtins.input', side_effect=['3', '2 36 16', '20 50']):
    import prinova

print(f'Execution time: {time.time() - start_time}\n')

start_time = time.time()

# Test 2
with patch('builtins.input', side_effect=['3', '2 6 16', '3 15']):
    importlib.reload(prinova)

print(f'Execution time: {time.time() - start_time}\n')

start_time = time.time()

# Test 3
with patch('builtins.input', side_effect=['3', '2 6 16', '1 7']):
    importlib.reload(prinova)

print(f'Execution time: {time.time() - start_time}\n')