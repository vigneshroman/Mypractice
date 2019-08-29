def bubbleSort(arr,n):
    for i in range(n):
        for j in range(n-i-1):
            if(arr[j]>arr[j+1]):
                arr[j],arr[j+1]=arr[j+1],arr[j]
    return arr

print(bubbleSort([5,4,2,1,3],5))

#b--> O(n) -->for sorted array
#w--> O(n^2) --> for reverse sorted array
#a--> O(n^2) -->""
