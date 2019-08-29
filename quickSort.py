def partition(arr,start,end):
    pivot = arr[end]
    index=start
    for i in range(start,end):
        if arr[i]<=pivot:
            arr[i],arr[index]=arr[index],arr[i]
            index+=1
    arr[index],arr[end]=arr[end],arr[index]
    return index

def quickSort(arr,start,end):
    if start < end:
        pIndex=partition(arr,start,end)
        quickSort(arr,start,pIndex-1)
        quickSort(arr,pIndex+1,end)
    return arr
print(quickSort([9,8,7,6,5,4,3,2,1,0],0,9))
#b-->O(n log n)
#w-->O(n^2)
#a-->O(n log n)
