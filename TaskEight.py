sum = 0
counter = 1
valid_number_counter = 0
while counter <= 10:
	number = int(input("Input a number between 1 and 100: "))
	if number > 100 or number < 0:
		print("Invalid Input")
	else:
		sum+=number
		counter+=1		
		
print("The sum of the numbers is", sum)

