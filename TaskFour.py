sum = 0
for counter in range(10):
	number = int(input("Input a number: "))
	if counter%2 == 1:
		sum+=number

print("The sum of the even index numbers is", sum)