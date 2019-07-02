
# The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

# Find the sum of all the primes below two million.

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

n = 2000000
i,sum = 3,2
while i<n:
    if(is_prime(i)):
        sum+=i
    i+=2
print(sum)
