def findSmallest(arr):
    smallest = arr[0] #store smallest value
    smallest_index = 0 #store the index of smallest value
    for i in range(1, len(arr)):
        if arr[i] < smallest:
            smallest = arr[i]
            smallest_index = i
    return smallest_index

def selectionSort(arr):
    newArr = []
    copiedArr = list(arr) #copy arr before mutating
    for i in range(len(copiedArr)):
        smallest = findSmallest(copiedArr)
        newArr.append(copiedArr.pop(smallest))
    return newArr

print(selectionSort([5,3,6,2,10])) # [2,3,5,6,10]

