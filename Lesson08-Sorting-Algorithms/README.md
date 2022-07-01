# Sorting Algorithms

## Bubble Sort
- This is one of the simplest sorting algorithms
- It repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.
- It is called bubble sort because the movement of array elements is just like the movement of air bubbles in the water. Bubbles in water rise up to the surface; similarly, the array elements in bubble sort move to the end in each iteration.

⏲️ **Time complexity**: 
- worst case => O(n²) - quadratic
- best case  => O(n) - linear and it occurs if the list is already or almost sorted (2-3 items are at incorrect place).

➡️ **Implementation**: [Click here](/Lesson08-Sorting-Algorithms/src/main/BubbleSort.java)


## Selection Sort
- Used only for small arrays
- Find the min element in the array and then put it on the first position, then find the next min element and put it on the next position (index + 1). Repeat the flow until the array is sorted.

⏲️ **Time complexity**: 
- worst case => O(n²) - quadratic
- best case  => O(n²) - quadratic

➡️ **Implementation**: [Click here](/Lesson08-Sorting-Algorithms/src/main/SelectionSort.java)

## Counting Sort
- Algorithm for sorting small integers
- Its main idea is to count the number of different objects
- Find min/max values, for every element, count in separate array the number of times it was met. hen for every value from min to max in the array output K is the number calculated in the previous array.

⏲️ **Time complexity**: 
- worst case => O(n + k) where K is the largest element in sequence
- best case  => O(n + k) where K is the largest element in sequence

➡️ **Implementation**: [Click here](/Lesson08-Sorting-Algorithms/src/main/CountingSort.java)

## Quick Sort
- A quick sort algorithm is built around choosing a pivot element in an array. If we take the example of an array of numbers that need to be sorted in ascending order, a quick sort algorithm will pick one entry (the current element) and compare it to all other entries. 
- The algorithm will then divide the array into two sections. One section will be for entries lower than the selected pivot element and the other will be for entries larger than the pivot element. This is called “partitioning” the array (you may even hear quick sort referred to as a partition algorithm). Pivot values are then picked for those two new sections and the process is repeated for all the elements in the array.

⏲️ **Time complexity**: 
- worst case => O(n²) when the array is already sorted
- best case  => O(N*(log(N))

➡️ **Implementation**: [Click here](/Lesson08-Sorting-Algorithms/src/main/QuickSort.java )
