#include<stdio.h>
int main(){
	int x,y;
	scanf("%d %d",&x,&y);

	if(x>0)
		x=1;
	else
		x=0;

	if(y>0)
		y=1;
	else
		y=0;

	if(x==1&&y==1)
		printf("1\n");
	if(x==1&&y==0)
		printf("4\n");
	if(x==0&&y==1)
		printf("2\n");
	if(x==0&&y==0)
		printf("3\n");
}
