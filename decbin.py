def decimaltobin(n):

    decimaltobin(n//2)
    print(n%2,end=" ")
if __name__ == '__main__':
    n=8
    decimaltobin(n)
