// To find GCD to 2 no using Euclid's Algorithm

int eclid_gcd(int a, int b) {
  int dividend = a >= b ? a:b;
  int divisor = a <= b ? a:b;
  while (divisor != 0) {
    int remainder = dividend % divisor;
    dividend = divisor;
    divisor = remainder;
  }
  return dividend;
}

Time complexity - O(log b)

int eclid_gcd2(int a, int b) {
  while (b != 0) {
    int remainder = a % b;
    a = b;
    b = remainder;
  }
  return a;
}


int eclid_gcd_rec(int a, int b) {
return b == 0 ? a : eclid_gcd_rec(b, a%b);
}
