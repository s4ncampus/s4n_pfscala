#include <iostream>

int gcd(int x, int y);

int
main(void) {

  std::cout << "Enter dos valores enteros separados por espacios: "
            << std::endl;

  int a, b;

  std::cin >> a >> b;

  std::cout << "Resultado: gcd(" << a << "," << b << ")="
            << gcd(a,b) << std::endl;

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
c3
