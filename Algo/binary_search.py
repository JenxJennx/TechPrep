def binary_search(arr,item):
    l = 0
    h = len(arr)-1

    while l <= h:
        mid = l + h // 2
        guess = arr[mid]
        if guess == item:
            return mid
        elif guess > item: #guess greater than item, ignore current mid and values greater and lower mid by 1
            h = mid - 1
        else: #Guess is less than needed item, ignore current mid and values less than it by increasing mid
            l = mid + 1
        return None #Item doesnt exist
    my_list = [1,2,3,4,5,6,7,8,9,10]
    print(binary_search(my_list, 7))   
    print(binary_search(my_list, 3))
    print(binary_search(my_list, 28))
