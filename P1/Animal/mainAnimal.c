#include <stdio.h>

#include "animal.h"

int main() {

	animal* a1 = newAnimal("Tareco", 12, 3.4);
	animal* a2 = newAnimal("Piloto", 1, 12.3);

	printAnimal(a1);
	printAnimal(a2);

	printf("a1 == a1? %s\n", equalsAnimal(a1, a1) ? "yes" : "no");
	printf("a1 == a2? %s\n", equalsAnimal(a1, a2) ? "yes" : "no");

	destroyAnimal(a1);
	destroyAnimal(a2);

	return 0;
}
