
# A palindromic number reads the same both ways.
# The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
# Find the largest palindrome made from the product of two 3-digit numbers.

p = 1
max = 0
for i in range(999, 100, -1):
	for j in range(999, 100, -1):
		p = i*j
		if(str(p)==str(p)[::-1]):
			if(max<p):
				max = p
			else:
				break
print(max)
