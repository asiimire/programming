def binary_search(list, target):
    first = 0
    last = len(list) - 1
    
    while first <= last:
        midpoint = (first + last) // 2
        
        if list[midpoint] == target:
            return midpoint #best case
        elif list[midpoint] < target:
            first = midpoint + 1
        else:
            last = midpoint - 1
            
        return None
def verify(index):
    if index is not None:
        print(f"Target found at {index}")
    else:
        print("Target not found in list")
        
numbers = [1,2,3,4,5,6,7,8,9,10]#[i for i in range(1,11)] #list comprehension
#print(numbers)

result = binary_search(numbers, 6)#this code has issues, not giving expected results
verify(result)