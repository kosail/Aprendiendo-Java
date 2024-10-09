#include "stdio.h"
#include "stdbool.h"

void printmenu() {
    printf("+---- Basic Calculator ----+\n");   
    printf("1) Add\n2) Subtract\n3) Multiply\n4) Divide\n5) Times\n0) Exit\n\n");
    printf(">> ");
}

void sum(int* a, int* b, int* result) {
    *result = *a + *b;
}

void subtract(int*a, int* b, int* result) {
    *result = *a - *b;
}

void multiply(int* a, int* b, int* result) {
    *result = *a * *b;
}

void divide(int* a, int* b, int* result) {
    if (*b == 0) {
        printf("Error: Division by zero cannot be performed!\n");
        return;
    }

    *result = *a / *b;
}

void times(int* a, int* b, int* result) {
    if (*b == 0) return;

    *result *= *a;
    (*b)--;
    times(a, b, result);

}

int main() {
    int option = 0;
    
    do {
        printmenu();
        int input_status = scanf("%d", &option);

        if (input_status != 1) {
            printf("Invalid menu option. Please, try again");
            continue;
        }

        int num1 = 0, num2 = 0;
        if (option != 0) {
            printf("First number to operate: ");
            scanf("%d", &num1);

            printf("\nSecond number to operate: ");
            scanf("%d", &num2);
        }

        int result = 1;
        switch (option) {
            case 1:
                sum(&num1, &num2, &result);
                break;
            
            case 2:
                subtract(&num1, &num2, &result);
                break;

            case 3:
                multiply(&num1, &num2, &result);
                break;

            case 4:
                divide(&num1, &num2, &result);
                break;

            case 5:
                times(&num1, &num2, &result);
        }

        printf("\nResult: %d\n", result);

    } while(option != 0);

    return 0;
}
