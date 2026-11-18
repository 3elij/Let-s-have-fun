sum = 0
for counter in range(10):
	number = int(input("Input a number: "))
	if number%2 == 0:
		sum+=number

print("The sum of the even numbers is", sum)