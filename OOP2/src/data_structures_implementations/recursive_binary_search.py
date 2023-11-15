def recursive_binary_search(list, target):
    if len(list) == 0:#base case
        return False
    else:
        midpoint = len(list)//2
        
        if list[midpoint] == target:
            return True
        else:
            if list[midpoint] < target:
                return recursive_binary_search(list[midpoint+1:], target)
            else:
                return recursive_binary_search(list[:midpoint], target)
            
def verify(result):
    print(f"Target found: {result}")
    
numbers = [1,2,3,4,5,6,7,8,9,10]#[i for i in range(1,11)] #list comprehension
#print(numbers)

result = recursive_binary_search(numbers, 6)#this code works
verify(result)