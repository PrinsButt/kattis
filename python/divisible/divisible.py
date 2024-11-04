for _ in range(int(input())):
    divisor, length = map(int, input().split())
    elements = map(int, input().split())

    cumulative_sum = 0
    mod_count = {0: 1}
    subsequences = 0

    for element in elements:
        cumulative_sum += element
        mod_value = cumulative_sum % divisor

        # If two cumulative sums (cumulative_sum[i] and cumulative_sum[j]) have the same remainder
        # when divided by D, the subarray between j + 1 and i (inclusive) has a sum that is divisible
        # by D.
        subsequences += mod_count.get(mod_value, 0)
        mod_count[mod_value] = mod_count.get(mod_value, 0) + 1

    print(subsequences)
