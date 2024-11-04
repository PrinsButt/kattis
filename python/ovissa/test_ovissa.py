from unittest.mock import patch

input_lines = [
    'uuuuuuuuuuuuuu'
]

with patch('builtins.input', side_effect=input_lines):
    import ovissa
