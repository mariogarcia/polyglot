
#include "Algorithms.h"

extern "C" int getMax(int* numbers,int numbersLength) {

  Algorithms instance;
  return instance.getMax(numbers,numbersLength);

}

int Algorithms::getMax(int* numbers,int numbersLength) {

  int max = 0;

  for (int i = 0; i < numbersLength ; i++) {
    int next = numbers[i];
    if (next > max){
      max = next; 
    }
  }

  return max;

}
