# Create a function that checks if the first argument n is divisible by all other arguments (return true if no other arguments)

# Example:

    # (6,1,3)--> true because 6 is divisible by 1 and 3
    # (12,2)--> true because 12 is divisible by 2
    # (100,5,4,10,25,20)--> true
    # (12,7)--> false because 12 is not divisible by 7
    
# Solution:

def is_divisible(*args):
    args = list(args)
    for index, arg in enumerate(args):
        if index != 0:
            if args[0] % args[index] != 0:
                print(args[0], 'is not divisible by', args[index])
                return False
            
    return True
     
    
print(is_divisible(8,3,4,2,5))