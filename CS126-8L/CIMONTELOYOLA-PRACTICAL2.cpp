#include <iostream>
#include <iomanip>
#include <limits>  // For clearing input buffer
#include <cstdlib> // For srand and rand
#include <ctime>   // For time

using namespace std;

// Function prototypes
void correct();
void incorrect();
void Ribbon();
void RanNum();
void clearScreen();

int main() {
    int choice;
    char again;

    do {
        clearScreen();

        cout << "~~~~~~~~~~~~~~~~~~~ M E N U ~~~~~~~~~~~~~~~~~~~" << endl
             << "[1] RIBBON " << endl
             << "[2] RANDOM NUMBER " << endl
             << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
             << endl << "ENTER YOUR CHOICE: ";

        while (!(cin >> choice) || (choice < 1 || choice > 2)) {
            clearScreen();
            incorrect();
            cout << "Invalid input. Please enter 1 or 2." << endl;
            cin.clear();               // Clear input buffer
            cin.ignore(numeric_limits<streamsize>::max(), '\n');  // Discard invalid input
        }

        clearScreen();

        switch (choice) {
            case 1:
                Ribbon();
                break;
            case 2:
                RanNum();
                break;
        }

        cout << endl << "Do you want to go back to the Menu? (Y/N): ";
        cin >> again;

    } while (again == 'Y' || again == 'y');

    cout << endl << "Thank you for using my program!" << endl;
    return 0;
}

// Function to display a message for correct input
void correct() {
    cout << endl << "Accepted input" << endl;
}

// Function to display a message for incorrect input
void incorrect() {
    cout << endl << "Unaccepted input" << endl;
}

// Function to generate and display a ribbon pattern
void Ribbon() {
    int ribnum, row, col;

    cout << "RIBBON" << endl;
    cout << "Enter size of Ribbon to generate (5-15) odd numbers only: ";
    cin >> ribnum;

    if (ribnum >= 5 && ribnum <= 15 && ribnum % 2 == 1) {
        for (row = 0; row < ribnum; row++) {
            cout << endl;

            for (col = 0; col < ribnum; col++) {
                cout << setw(3);

                if (col == 0 || col == ribnum - 1) {
                    cout << "#";
                } else if (row > 0 && row < ribnum - 1) {
                    if (col == row || col == ribnum - (row + 1)) {
                        cout << "#";
                    } else {
                        cout << " ";
                    }
                } else {
                    cout << " ";
                }
            }
        }
        cout << endl;
    } else {
        cout << "Invalid input for Ribbon size. Please enter an odd number between 5 and 15." << endl;
    }
}

// Function to generate and display random numbers
void RanNum() {
    int n;

    cout << "RANDOM NUMBER GENERATOR" << endl;
    cout << "Enter how many Random Numbers to generate (1-100): ";
    cin >> n;

    if (n >= 1 && n <= 100) {
        int countPositives = 0;
        int countNegatives = 0;
        int highestPositive = 0;
        int highestNegative = -101;
        int lowestPositive = -1;
        int lowestNegative = 0;
        int randomNumber;

        for (int i = 1; i <= n; i++) {

            int seed = i + (rand() % 100);

            if (seed % 2 == 0)
                randomNumber = -100 + rand() % 101;
            else
                randomNumber = rand() % 101;

            cout << randomNumber << "\t";

            if (randomNumber > 0) {
                countPositives++;

                if (highestPositive < randomNumber) {
                    highestPositive = randomNumber;
                }
                if (lowestPositive > randomNumber) {
                    lowestPositive = randomNumber;
                }
            } else {
                countNegatives++;

                if (highestNegative < randomNumber) {
                    highestNegative = randomNumber;
                }
                if (lowestNegative > randomNumber) {
                    lowestNegative = randomNumber;
                }
            }
        }
        cout << endl << "\nThere is/are " << countPositives << " POSITIVE numbers:";
        cout << "\nThe HIGHEST POSITIVE number is " << highestPositive;
        cout << "\nThe LOWEST POSITIVE number is " << lowestPositive << "\n";

        cout << endl << "\nThere is/are " << countNegatives << " NEGATIVE numbers:";
        cout << "\nThe HIGHEST NEGATIVE number is " << highestNegative;
        cout << "\nThe LOWEST NEGATIVE number is " << lowestNegative << "\n";
    } else {
        cout << "Invalid input for the number of random numbers. Please enter a number between 1 and 100." << endl;
    }
}

// Function to clear the screen
void clearScreen() {
    // ANSI escape code to clear screen
    cout << "\033[2J\033[1;1H";
}
