n=int(input()) 
number=list(map(int,input().split())) 

number.sort()

print(number[(n//2)-1])