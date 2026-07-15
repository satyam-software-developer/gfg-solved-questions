 #include <stdlib.h>

int* getArray(int n) {
    int* ptr = (int*)malloc(n * sizeof(int));

    for (int i = 0; i < n; i++) {
        ptr[i] = 1;
    }

    return ptr;
}