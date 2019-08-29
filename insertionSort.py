def insertionSort(arr ,n):
    for i in range(1,n):
        value =arr[i] #taking first element from the array.
        hole =i
        #print(hole,"#")
        while (hole>0 and arr[hole-1]>value):
            arr[hole]=arr[hole-1]
            hole-=1
        arr[hole] =value
    return arr
lis = [5,4,3,2,1]
n =len(lis)
print(insertionSort(lis,n))
#complexity same as bubble srt.
#b--> O(n) -->for sorted array
#w--> O(n^2) --> for reverse sorted array
#a--> O(n^2) -->""

