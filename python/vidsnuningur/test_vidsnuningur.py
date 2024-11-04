from unittest.mock import patch

input_lines = [
    '2202annaloksdlahmarfinppekranutirroF'
]

with patch('builtins.input', side_effect=input_lines):
    import vidsnuningur
