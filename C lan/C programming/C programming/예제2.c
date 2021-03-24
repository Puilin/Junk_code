#include <stdio.h>
#include <stdlib.h>

//int Min(int a, int b, int c)
//{
//	if ((a < b) & (a < c)) {
//		return a;
//	}
//	else if ((b < a) & (b < c)) {
//		return b;
//	}
//	else {
//		return c;
//	}
//}
//
//int make_to_one(int n)
//{
//	int memo[1000001] = { 0 };
//	if (n <= 3) {
//		if (n == 1) {
//			memo[1] = 0;
//		}
//		else if (n == 2) {
//			memo[2] = 1;
//		}
//		else {
//			memo[3] = 1;
//		}
//	}
//	else {
//		memo[1] = 0;
//		memo[2] = 1;
//		memo[3] = 1;
//		for (int i = 4; i <= n; i++) {
//			int temp[3] = { 0 };
//			temp[0] = memo[i - 1] + 1;
//			if (i % 3 == 0) {
//				temp[1] = memo[i / 3] + 1;
//			}
//			else if (i % 2 == 0) {
//				temp[2] = memo[i / 2] + 1;
//			}
//			else {
//				return 0;
//			}
//			memo[i] = Min(temp[0], temp[1], temp[2]);
//		}
//	}
//	return memo[n];
//}
//
//int main(void)
//{
//	int inp;
//	scanf_s("%d", &inp);
//	printf("%d", make_to_one(inp));
//}

void fun1(int* p) {
	*p = 24;
	printf("Â¥ÀÜ %p\n", p);
}

int main2()
{
	int arg = 20;
	int* p_arg = &arg;

	fun1(&arg);
	printf("%d\n", arg);
	printf("%d\n", *p_arg);
	printf("%p", p_arg);
}