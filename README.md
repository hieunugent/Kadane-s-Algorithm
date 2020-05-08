# Kadane's-Algorithm
- write a function that takes in a non-empty array of integers and returns the maximum sum that can be obtained by summing up all of the integer in a non-empty subarray of the input array.
- A subarray must only contain adjacent numbers
- example:
  - array = [3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4]
  - output = 19  is sum of [1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1]
# brutal - force:
- loop though each index as one, and considering their value.
- compare the maximum value possible with the previous maximum value
- only save the value  of the maximum value in previous maximum
- Time Complexity  O(n^2);
- space O(n) n is length of array
# optimal solution:
- consider the current index max by compare the value of index with value of previous + current index value.
- previous value index must be their possible maximum value
- Time Complexity O(N);
- Space Complexity O(1);
