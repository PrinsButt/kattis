from unittest.mock import patch

side_effect = [
    '2',
    '7 3',
    '1 2 3',
    '4 8',
    '2 1 2 1 1 2 1 2'
]

with patch('builtins.input', side_effect=side_effect):
    import divisible
