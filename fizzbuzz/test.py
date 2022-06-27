# Run code with python
# py test.py
# python3 test.py
# or online-ide (https://www.online-ide.com/wRH1SNnA7z)

for fizzbuzz in range (1, 101):
  if fizzbuzz % 15 == 0 :
    print("FizzBuzz", end ="\t")
    continue
  elif fizzbuzz % 3 == 0 :
    print("Fizz", end ="\t")
    continue
  elif fizzbuzz % 5 == 0 :
    print("Buzz", end ="\t")
    continue

  # Print number
  print(fizzbuzz, end ="\t")
