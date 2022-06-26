# Run code with python
# py test.py
# python3 test.py
# or online-ide (https://www.online-ide.com/nistIEJvHm)

def swapNums(numdict):
    tmp = numdict['firstNum']
    numdict['firstNum'] = numdict['secondNum']
    numdict['secondNum'] = tmp
    
numdict = {
  "firstNum" : 25,
  "secondNum" : 20
} 

print("Before function call", numdict)
print(f"{numdict['firstNum']} - {numdict['secondNum']}")
swapNums(numdict)
print("After function call", numdict)
print(f"{numdict['firstNum']} - {numdict['secondNum']}")
