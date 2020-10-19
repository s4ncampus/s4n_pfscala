#include <iostream>

int gcd(int a, int b);

int
main(void) {

  std::cout << "Enter three integer values separated by spaces: ";
  std::cout.flush();

  int a, b, c;

  std::cin >> a >> b >> c;

  std::cout << "The minimum size to cut is: "
	    << gcd(gcd(a, b),c)
	    << std::endl;

  return 0;
}

int
gcd(int a, int b) {
  while (a != b)
    if (a > b)
      a = a - b;
    else
      b = b - a;
  return a;
}
