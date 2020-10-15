#include <iostream>

int gcd(int x, int y);

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
gcd(int x, int y) {
  while (x != y)
    if (x > y)
      x = x - y;
    else
      y = y - x;
  return x;
}

