
# By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

# What is the 10 001st prime number?

import math
def is_prime(n):
    if(n<2):
        return False
    if(n==2):
        return True
    if(n%2==0):
        return False
    for i in range(3, int(math.sqrt(n))+1, 2):
        if(n%i==0):
            return False
    return True

n = 10001
i,j = 0,1
while i<n:
    j+=1
    if(is_prime(j)):
        i+=1
print(j)
