import importlib
from unittest.mock import patch

# Test 1
with patch('builtins.input', side_effect=['10', '4', '1335']):
    import aleidibio

# Test 2
with patch('builtins.input', side_effect=['8', '10', '1000']):
    importlib.reload(aleidibio)
