def selectionSort(arr,n):
    for i in range(n):
        imin =i                #-->n-1 times it'll executed.
        for j in range(i+1,n):
            if(arr[j]<arr[imin]):     #-->n(n-1)/2 times
                imin=j
        arr[i],arr[imin]=arr[imin],arr[i]      #-->n-1 times
    return arr
print(selectionSort([2,9,1,3,4,3],6))
#big O(n^2)
