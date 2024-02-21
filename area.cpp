// main.cpp
#include<iostream>
#include "boxArea.h"
#include "boxVolume.h"

int main() {
    float length, width, height;

    // Input from the user
    std::cout << "Enter the length of the box: ";
    std::cin >> length;

    std::cout << "Enter the width of the box: ";
    std::cin >> width;

    std::cout << "Enter the height of the box: ";
    std::cin >> height;

    // Display area and volume
    #ifdef BOX_AREA_H
        boxArea(length, width, height);
    #else
        std::cout << "boxArea function not defined!" << std::endl;
    #endif

    #ifdef BOX_VOLUME_H
        boxVolume(length, width, height);
    #else
        std::cout << "boxVolume function not defined!" << std::endl;
    #endif

    return 0;
}
