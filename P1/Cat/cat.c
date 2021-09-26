#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#include "cat.h"

struct Cat {

	char _name[16];
	int _age;
	double _weight;
	int _purrLevel;
	double _fluffiness;

};


cat* newCat(char *name, int age, double weight, int purrLevel, double fluffiness) {

	cat *new_cat = (cat*) malloc(sizeof(struct Cat));

	strcpy(new_cat->_name, name);
	new_cat->_age = age;
	new_cat->_weight = weight;
	new_cat->_purrLevel = purrLevel;
	new_cat->_fluffiness = fluffiness;

	return new_cat;
}


void destroyCat(cat *x) {

	if(x != NULL) free(x);
}


char* getCatName(cat *x) {
	return x->_name;
}
int getCatAge(cat *x) {
	return x->_age;
}
double getCatWeight(cat *x) {
	return x->_weight;
}
int getCatPurrLevel(cat *x) {
	return x->_purrLevel;
}
double getCatFluffiness(cat *x) {
	return x->_fluffiness;
}


int equalsCat(cat *x, cat *y) {

	if(!strcmp(getCatName(x), getCatName(y)) && getCatAge(x) == getCatAge(y)
		&& getCatWeight(x) == getCatWeight(y) && getCatPurrLevel(x) == getCatPurrLevel(y)
		&& getCatFluffiness(x) == getCatFluffiness(y))
		return 1;
	return 0;
}


void printCat(cat* x) {

	printf("== Cat ==\n");
	printf("Name:		%s\n", x->_name);
	printf("Age:		%d\n", x->_age);
	printf("Weight:		%lf\n", x->_weight);
	printf("Purr Level:	%d\n", x->_purrLevel);
	printf("Fluffiness:	%lf\n", x->_fluffiness);
}
