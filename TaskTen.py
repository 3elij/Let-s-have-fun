sum = 0

valid_number_counter = 0
for counter in range(10):
	number = int(input("Input a number between 1 and 100: "))
	if number < 100 and number > 0:
		sum+=number
		
		valid_number_counter+=1
average = sum/valid_number_counter
print("The average of the valid input is:", average)
