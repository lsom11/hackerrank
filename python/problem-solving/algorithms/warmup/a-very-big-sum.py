#!/bin/python3

import os

# Complete the aVeryBigSum function below.


def aVeryBigSum(ar):
    total = 0
    for num in ar:
        total += num

    return total


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    ar_count = int(input())

    ar = list(map(int, input().rstrip().split()))

    result = aVeryBigSum(ar)

    fptr.write(str(result) + '\n')

    fptr.close()
