// Find all prime numbers upto n 
1. First way is a trivial division.
 - We run a loop from 2 to n. -> Time complexity O(n)
 - Call the function isPrime(x) to check for prime validation -> Time complexity O(sqrt(n))
 - So total time complexity is O(n.sqrt(n))
 
2. We can use an ancient algorithm named Sieve of Eratosthenes
 - Here we create a list containing all numbers from 2 to n.
 - We take the first prime number that is 2 and check all numbers in the list, we strike out the number that are multiple of 2.
 - Then we take 3 and strike out all number multiple of 3.
 - We proceed in the same way and check for multiples of those numbers which are not striked out.
 - Then list finally contains the numbers which are prime. 
 - Space Complexity - O(n), Time Complexity - O(n.log log(n))

