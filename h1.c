#include<stdio.h>
#include<math.h>
int main()
{
char str1[100],str2[100],i,cost=0,cost1=0;
scanf("%[^\n]s",str1);
scanf('\n%[^\n]s",str2);
int hh1[30]={0};
int hh2[30]={0};
int 11=strlen(str1);
int 12=strlen(str2);
int count=0,min;
for(i=0;str1[i];i++){
hh1[str[i]-97]++;
}
for(i=0;str2[i];i++)
{
hh2[str2[i]-97]++;
}
for(i=0;i<30;i++)
{
count+=abs(hh[i]-hh2[i]);
}
if(11!=12)
{
if(count==abs(11-12)){
cost=+count*3;
cost=++count*3;
}
}
else
{
cost=((count/2)*3)+((count/2)*4);
cost1+=(count/2*5);
}
min=(cost<cost1)?cost:cost1;
printf("%d",min);
return 0;
 }
