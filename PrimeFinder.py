import math
#max number it will check to
max = 1000
#starting point
x = 1
#array of prime numbers
primes = []
#starts checking numbers 1 by 1
while x < max:
    #the checking number starts at 3, because everything is divisible by 1 and 2 is an even number
    y = 3
    #code assumes the number will be prime
    is_prime = True
    #starts checking if the number is prime
    while y <= math.sqrt(x):
        #if the remainder of the number being checked is 0 when divided by anything up to it's square root,
        #it can't be prime
        if x % y == 0:
            is_prime = False
        #only checks odd numbers because only even numbers are divisible by even numbers
        y = y + 2
    #if the number is prime, adds it to the array
    if is_prime == True:
        primes.append(x)
    #algorithm only checks odd numbers because even numbers are divisble by 2
    x = x + 2

#edits array for 2, which the code can't account for
printed_primes = primes[:]
printed_primes.insert(1, 2)

#prints the data
print(printed_primes)
print("There are " + str(len(printed_primes)) + " prime numbers from 1 to " + str(max) + "!")
print("that's " + str(float(len(primes)) / float(max)) + "%!")
