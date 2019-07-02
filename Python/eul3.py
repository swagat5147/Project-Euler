
# The prime factors of 13195 are 5, 7, 13 and 29.

# What is the largest prime factor of the number 600851475143 ?

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

n = 600851475143
i = 2
max = 0
while(i <= n):
	if(n%i==0):
		n/=i
		if(is_prime(i)):
			max = i
	i+=1
print(max)