from unittest.mock import patch

input_lines = [
    '7 2',
    'administer 100000',
    'spending 200000',
    'manage 50000',
    'responsibility 25000',
    'expertise 100',
    'skill 50',
    'money 75000',
    'the incumbent will administer the spending of kindergarden milk money',
    'and exercise responsibility for making change he or she will share',
    'responsibility for the task of managing the money with the assistant',
    'whose skill and expertise shall ensure the successful spending exercise',
    '.',
    'this individual must have the skill to perform a heart transplant and',
    'expertise in rocket science',
    '.'
]

with patch('builtins.input', side_effect=input_lines):
    import hay_points
