// Find all factors of a number
1. Here we use same logic as of prime no co-factors
2. Set an empty list -> A 
3. for i: 1 to sqrt(n)
   - if (n%i == 0)
   - add i to list A
   - if (i != sqrt(n))   // This is done to remove duplicate values, for e.g. in case of 36, 6 will be added 2 times in the List. 
	   add n/i to list A  // To remove duplicacy we can use Set instead of List.
	   
4. Time complexity - O(sqrt(n)), Space complexity - O(1)  
