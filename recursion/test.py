# Run code with python
# py test.py
# python3 test.py
# or online-ide (https://www.online-ide.com/Sucn3KPYfZ)

def tri_recursion(k):
  if (k > 0):
    result = k + tri_recursion(k - 1)
    print(f"{k} : {result}")
  else:
    result = 0
  return result

def printFun(test):
  if (test < 1):
    return
  
  print(test, end=" ", flush=True)
  printFun(test - 1)
  print(test, end=" ", flush=True)
  return

test = 5
print("tri_recursion")
tri_recursion(test)
print("\nprintFun")
printFun(test)
