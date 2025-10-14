a = 0
while a <= 10:
    print("Value of a:", a) # This will print values from 0 to 10
    a += 1

print("Loop ended.")

# This is a simple while loop that increments the value of 'a' from 0 to 10 and prints it. After the loop ends, it prints "Loop ended." You can modify the condition and the increment value to see different behaviors of the loop.
# For example, changing the condition to 'a < 5' will make the loop run until 'a' is 4.
# Similarly, changing 'a += 1' to 'a += 2' will increment 'a' by 2 in each iteration.
# Experiment with these changes to understand how while loops work in Python.
# Note: Ensure that the loop has a terminating condition to avoid infinite loops.
# Always be cautious with while loops to prevent them from running indefinitely.
# You can also add an else block to the while loop which will execute when the loop condition becomes false.
# Example:
# while a <= 10:
#     print("Value of a:", a)
#     a += 1
# else:
#     print("Loop ended.")
# This will print "Loop ended." after the loop finishes.
# Happy coding!
# This code demonstrates the use of a while loop in Python.

a = 10
while a >= 0:
    print("Value of a:", a) # This will print values from 10 to 0
    a -= 1
print("Loop ended.")
