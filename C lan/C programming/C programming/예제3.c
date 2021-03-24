#include <stdio.h> 
#include <stdlib.h> 

int main() {
    int bin[8] = { 0 };
    int inp, i, j, stat = 0, oldnum; // 띄어쓰기 정리  
    int size = sizeof(bin) / sizeof(int);
    printf("Dec.. ");
    scanf_s("%d", &inp);
    oldnum = inp;
    if (inp < 0) {
        stat = 1;
        inp = -inp;
    }
    for (i = 0; i < size; i++) {
        bin[size - i - 1] = inp % 2;
        inp = inp / 2;
    }
    if (!stat) {
        printf("..> %d", inp);
        for (i = 0; i < size; i++) {
            printf("%3d", bin[i]);
        }
    }
    else {
        printf("..[%d] 부호와절대값:\t", oldnum);
        bin[0] = !bin[0];
        for (i = 0; i < size; i++) {
            printf("%3d", bin[i]);
        }
        printf("\n..[%d] 1의보수 :\t", oldnum); // 줄 정리  
        for (i = 1; i < size; i++) {
            bin[i] = !bin[i];
        }
        for (i = 0; i < size; i++) {
            printf("%3d", bin[i]);
        }
        printf("\n..[%d] 2의보수 :\t", oldnum);
        for (i = size - 1; i >= 0; i--) if (bin[i] ^= 1) break; // 위의 1의 보수를 이용하여 2의 보수화  
        for (i = 0; i < size; i++) {
            for (i = 0; i < size; i++) {
                printf("%3d", bin[i]);
            }
        }
    } // 중괄호 추가  
    return 0;
}