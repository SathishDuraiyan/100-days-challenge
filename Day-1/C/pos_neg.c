#include<stdio.h>
int main(){
    int n;
    printf("Enter the Number: ");
    scanf("%d",&n);
    if(n>0){
        printf("Is Positive");
    }
    else{
        printf("Is Negative");
    }
    return 0;
}