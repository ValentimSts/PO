#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#include "animal.h"


struct Animal {

	char _name[16];
	int _age;
	double _weight;

};


animal* newAnimal(const char *name, int age, double weight) {

	animal *new_animal = (animal*) malloc(sizeof(struct Animal));

	strcpy(new_animal->_name, name);
	new_animal->_age = age;
	new_animal->_weight = weight;

	return new_animal;
}


void destroyAnimal(animal *x) {

	if(x != NULL) free(x);
}


char* getAnimalName(animal *x) { 
	return x->_name; 
}
int getAnimalAge(animal *x) { 
	return x->_age; 
}
double getAnimalWeight(animal *x) { 
	return x->_weight; 
}


int equalsAnimal(animal *x, animal *y) {

	if(!strcmp(getAnimalName(x), getAnimalName(y)) && x->_age == y->_age
		&& x->_weight == y->_weight)
		return 1;
	return 0;
}

void printAnimal(animal *x) {
	printf("== Animal ==\n");
	printf("Name:	%s\n", x->_name);
	printf("Age:	%d\n", x->_age);
	printf("Weight:	%lf\n", x->_weight);
}
