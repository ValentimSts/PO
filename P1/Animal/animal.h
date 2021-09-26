#ifndef _ANIMAL_H_
#define _ANIMAL_H_

typedef struct Animal animal;


animal* newAnimal(const char *name, int age, double weight);
void destroyAnimal(animal *x);

int equalsAnimal(animal *x, animal *y);
char* getAnimalName(animal *x);
int getAnimelAge(animal *x);
double getAnimalWeight(animal *x);
void printAnimal(animal *x);


#endif
