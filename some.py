
total = 0

for counter in range(10):
	prime_number_checker = 0
	number = int(input("Input a number: "))
	for counter1 in range(2,number):
		result = number%counter1
		if result == 0:
			prime_number_checker+=1
	if (prime_number_checker ==0 and number != 0 and number != 1):
		print(number)
		



#a prime number is a number tht can only be divided by itelf and 1. that is, if another number divded it, the modulus of that division operation will give a #value that is not 0.? eg 5%2 = 1. 5%3 =2. so to find the prime number, if number%counter1 