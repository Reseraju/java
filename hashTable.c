#include <stdio.h>
#include<stdlib.h>
int TABLE_SIZE;
void insert();
void display();
void search();
int h[20];
int main(){
int opt,i;
printf("Enter the TABLE SIZE\n");
scanf("%d",&TABLE_SIZE);
do{
printf("\nChoose your option \n1.Insert\n2. Display \n3. Search \n4.Exit \n");
scanf("%d",&opt);
switch(opt){
case 1:
insert();
break;
case 2:
display();
break;
case 3:
search();
break;
case 4:exit(0);
}
}while(opt!=4);
return 0;
}
void insert(){
int key,index,i,hkey;
printf("\nEnter the key to insert into hash table\n");
scanf("%d",&key);
hkey=key%TABLE_SIZE;
for(i=0;i<TABLE_SIZE;i++){
index=(hkey+i)%TABLE_SIZE;
if(h[index] == NULL){
h[index]=key;
break;
}
}

if(i == TABLE_SIZE){
printf("\nelement cannot be inserted\n");
}
}
void display(){
int i;
printf("\nElements in the hash table are \n");
printf("Index\tValue\n\n");
for(i=0;i< TABLE_SIZE; i++){
if(h[i]==NULL){
printf("%d\t-\n",i);
}
else{
printf("%d\t%d\n",i,h[i]);
}
}
}
void search(){
int key,index,i,flag=0,hkey;
printf("\nenter search element\n");
scanf("%d",&key);
hkey=key%TABLE_SIZE;
for(i=0;i<TABLE_SIZE; i++){
index=(hkey+i)%TABLE_SIZE;
if(h[index]==key){
printf("value is found at index %d",index);
flag=1;
break;
}
}
if(flag==0){
printf("\n value is not found\n");
}
}