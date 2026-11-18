sum = 0
even_number_counter = 0
for counter in range(10):
	number = int(input("Input a number: "))
	if number%2 == 0:
		sum+=number
		even_number_counter+=1
average = sum/even_number_counter

print("The average of the even numbers is", average)