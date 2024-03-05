// Header includes for necessary libraries
#include <bits/stdc++.h>
#include <windows.h>
#include <unistd.h>
#include <iostream>
#include <iomanip>
#include <vector>
#include <sstream>
#include <cmath>
#include <limits>

using namespace std;

// Constant for maximum size
const int MAX_SIZE = 500;

// Global arrays and variables for process and job sizes, options, and timers
int ProcessSize[MAX_SIZE], BlockSize[MAX_SIZE], option;
int process = sizeof(ProcessSize) / sizeof(ProcessSize[0]);
int jobs = sizeof(BlockSize) / sizeof(BlockSize[0]);
int TimerL, CoaTime, ComTime;

// Function to clear the console screen
void clearConsole() {
    cout << "\033[2J\033[1;1H";
}

// Function implementing the First Fit algorithm
void FirstFitAlgo(int BlockSize[], int jobs, int ProcessSize[], int process) {
    // Array to store the chosen block for each process
    int move[process];
    memset(move, -1, sizeof(move));

    // Loop through each process
    for (int ctr = 0; ctr < process; ctr++) {
        // Loop through each job (memory block)
        for (int x = 0; x < jobs; x++) {
            TimerL++;

            // Handling Coalescing Hole Time
            if (CoaTime > 0) {
                TimerL = CoaTime + BlockSize[x];
                TimerL++;
            } else if (CoaTime == 0) {
                CoaTime = 0;
            }

            // Handling Compaction Time
            if (ComTime > 0) {
                TimerL = ComTime + BlockSize[x];
                TimerL++;
            } else if (ComTime == 0) {
                ComTime = 0;
            }

            // Allocating blocks to processes based on First Fit
            if (BlockSize[x] >= ProcessSize[ctr]) {
                move[ctr] = x;
                BlockSize[x] -= ProcessSize[ctr];
                break;
            } else if (BlockSize[x] <= ProcessSize[ctr]) {
                BlockSize[x]++;
                move[ctr] = x;
                BlockSize[x] -= ProcessSize[ctr];
            } else if (BlockSize[x] >= ProcessSize[ctr]) {
                BlockSize[x]++;
                move[ctr] = x;
            }
        }
    }

    // Displaying allocation results
    cout << "No.\tSize\tBlock no.\n";

    for (int ctr = 0; ctr < process; ctr++) {
        cout << ctr + 1 << '\t' << ProcessSize[ctr] << '\t';

        if (move[ctr] != -1)
            cout << move[ctr] + 1;
        else
            cout << "Memory Not Allocated";

        cout << endl;
    }

    // Displaying Coalescing Hole Time, Compaction Time, and Total Time Allocated
    cout << "\nTotal Coalescing Hole Time: " << CoaTime << endl;
    cout << "\nTotal Compaction Time: " << ComTime << endl;
    cout << "\nTotal Time Allocated: " << TimerL + CoaTime + ComTime << endl;

    cout << endl << endl;

    // Prompting user to try again or terminate the program
    char ulit;

    while (ulit != 'y' && ulit != 'Y') {
        cout << "Want To Try Again? [Y/N]: ";
        cin >> ulit;
        clearConsole();

        if (ulit != 'Y' && ulit != 'y') {
            cout << "Invalid input.";
            clearConsole();
        }
    }

    if (ulit == 'N' || ulit == 'n') {
        cout << "Program Successfully Terminated";
        exit(0);
    }
}

// Function to display the user manual
void man() {
    // Displaying user manual with relevant information
    clearConsole();
    cout << "====================================================USER MANUAL========================================================\n";
    cout << "\nAbout:\n";
    cout << "This is a C++ simulation program to show a memory allocation simulation\n";
    cout << "This project contains two files:\n";
    cout << "+ Group_6-BM1-M2_-_Summative_Final_Project.cpp contains the C++ codes and algorithm of the memory placement program\n";
    cout << "+ Group_6-BM1-M2_-_Summative_Final_Project.exe executable file that runs the memory placement program\n\n";

    cout << "Program Manual:\n\n";
    cout << "Program will prompt the user for the numerical value of the amount and size of partition/s and process/es.\n";
    cout << "Program will prompt the user to enter the coalescing hole time and compaction time.\n";
    cout << "After inputting all the values, it will then be executed wherein the size, block number, and total time unit will be displayed.\n";
    cout << "Will be prompted if they want to repeat the memory placement procedure by choosing any of the algorithms.\n";
    cout << "Program will prompt a Yes or No command. If the user types Yes, the program will run again. If not, the user will be taken back to the main page.\n\n";

    cout << "[1] First Fit chooses the partition with greater or equal size to the process\n";
    cout << "[2] User Manual contains details of the program\n";
    cout << "[3] Exit allows the user to exit from the memory2 placement simulation\n\n";

    cout << "References:\n";
    cout << "https://www.geeksforgeeks.org/program-first-fit-algorithm-memory-management/\n";
    cout << "https://www.youtube.com/watch?v=3A5W-0Bknv0&t=303s\n\n";

    char ulit;
    cout << "Want to Return? [Y/N]: ";
    cin >> ulit;

    // Handling user input for returning or terminating the program
    while (ulit != 'y' && ulit != 'Y') {
        cout << "Invalid input. Want to Return? [Y/N]: ";
        cin >> ulit;
    }

    if (ulit == 'N' || ulit == 'n') {
        cout << "Program Successfully Terminated";
        exit(0);
    }
}

// Function to get user input with error handling for integers
int getInput(const string& prompt) {
    int value;
    do {
        cout << prompt;
        cin >> value;
        if (cin.fail()) {
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
            cout << "Invalid input. Please enter a valid integer." << endl;
        }
    } while (cin.fail());
    return value;
}

// Main function of the program
int main() {
    // Displaying program information
    cout << "Memory Placement Simulation Program" << endl;
    cout << "Group 6: Patrick Miguel Purificacion, Charles Ian Monteloyola" << endl;
    cout << "Section: BM1  Course: IT54-8l" << endl;

    // Main program loop
    while (true) {
        // Displaying the main menu
        cout << "==================================" << endl;
        cout << "Memory Placement Simulation" << endl;
        cout << "==================================" << endl;
        cout << "[1] First Fit" << endl;
        cout << "[2] User Manual" << endl;
        cout << "[3] Exit" << endl;
        cout << "==================================" << endl;
        option = getInput("Enter Your Desired Output: ");

        // Handling user options
        switch (option) {
            case 1: {
                clearConsole();

                // Getting user input for memory partitions, sizes, processes, times, etc.
                jobs = getInput("Enter memory partitions: ");
                // ... (similar blocks of code for other inputs)

                // Executing the First Fit algorithm with user inputs
                FirstFitAlgo(BlockSize, jobs, ProcessSize, process);

                cout << endl;
                break;
            }
            case 2: {
                // Displaying the user manual
                man();
                cout << endl;
                break;
            }
            case 3: {
                clearConsole();
                cout << "Program Successfully Terminated" << endl;
                exit(0);
            }
            default: {
                cout << "Please Try Again! Incorrect Option" << endl << endl;
                break;
            }
        }
    }
}
