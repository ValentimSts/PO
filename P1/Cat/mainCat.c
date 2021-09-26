#include <stdio.h>

#include "cat.h"

int main() {

	cat* c1 = newCat("Tareco", 12, 3.4, 3, 3.1);
	cat* c2 = newCat("Piloto", 1, 12.3, 2, 2.7);

	printCat(c1);
	printCat(c2);

	printf("c1 == c1? %s\n", equalsCat(c1, c1) ? "yes" : "no");
	printf("c1 == c2? %s\n", equalsCat(c1, c2) ? "yes" : "no");

	destroyCat(c1);
	destroyCat(c2);

	return 0;
}
