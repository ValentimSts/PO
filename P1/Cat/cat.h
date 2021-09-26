#ifndef _CAT_H_
#define _CAT_H_

typedef struct Cat cat;

cat* newCat(char *name, int age, double weight, int purrLevel, double fluffiness);
void destroyCat(cat *x);

int equalsCat(cat *x, cat *y);
char* getCatName(cat *x);
int getCatAge(cat *x);
double getCatWeight(cat *x);
int getCatPurrLevel(cat *x);
double getCatFluffiness(cat *x);

void printCat(cat *x);

#endif
