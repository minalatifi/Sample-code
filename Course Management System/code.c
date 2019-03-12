#include <stdio.h>
#include <conio.h>
#include <string.h>
#include <stdlib.h>
struct student
{
	char name[30];
	char family[30];
	char stdno[10];
	float cs;
	float ms;
	float fs;
	float score;
};
typedef struct student stdinfo;

//fonctions
//f1 :
float CharToFlaot(char s[])
{
	int i,dot=0,k=1,j,x;
	float r=0,t=0,y;
	for(i=0;s[i+1];i++)
	{
		if(s[i]!='\r')
		{
			if(s[i]=='.')
			{
				dot=1;
				continue;
			}	
			if(dot)
			{
				y=s[i]-48;
				for(j=0;j<k;j++)
					y=y/10;
				t=t+y;
				k++;
			}
			else
			{
				x=s[i]-48;
				r=r*10;
				r=r+x;
			}
		}
	}
	r=r+t;
	return r;
}

//f2 :
void FinalScore(stdinfo s[],int m)
{
	int i;
	system("cls");
//	int x,y,z;
//	printf("darsad haye nomarat kelasi mianterm va payanterm ra be tartib vared konid:");
//	scanf("%d %d %d",&x,&y,&z);
//	if((x+y+z)==100)
//	{
		for(i=0;i<m;i++)
		{
			s[i].score=(20*(s[i].cs)+20*(s[i].ms)+60*(s[i].fs))/100;
		
		}
//	}
//	else
//		printf("darsad haye vared shode ghabele ghabul nist.\n");
	
	
}

//f3 :
void SortByChar(stdinfo list[],int m,int k)
{
	char n[30],s[10];
	float f;
	int i,j;
	if (k==1)
	{
		for(i=m-1;i>=0;i--)
		{
			for(j=0;j<i;j++)
			{
				if(strcmp(list[j].name,list[j+1].name)>0)
				{
					strcpy(n,list[j].name);
					strcpy(list[j].name,list[j+1].name);
					strcpy(list[j+1].name,n);
					
					strcpy(n,list[j].family);
					strcpy(list[j].family,list[j+1].family);
					strcpy(list[j+1].family,n);
					
					strcpy(s,list[j].stdno);
					strcpy(list[j].stdno,list[j+1].stdno);
					strcpy(list[j+1].stdno,s);
					
					f=list[j].cs;
					list[j].cs=list[j+1].cs;
					list[j+1].cs=f;
					
					f=list[j].ms;
					list[j].ms=list[j+1].ms;
					list[j+1].ms=f;
					
					f=list[j].fs;
					list[j].fs=list[j+1].fs;
					list[j+1].fs=f;
					
					f=list[j].score;
					list[j].score=list[j+1].score;
					list[j+1].score=f;
				}
			}
		}
		
	}
	else if (k==2)
	{
		for(i=m-1;i>=0;i--)
		{
			for(j=0;j<i;j++)
			{
				if(strcmp(list[j].family,list[j+1].family)>0)
				{
					strcpy(n,list[j].name);
					strcpy(list[j].name,list[j+1].name);
					strcpy(list[j+1].name,n);
					
					strcpy(n,list[j].family);
					strcpy(list[j].family,list[j+1].family);
					strcpy(list[j+1].family,n);
					
					strcpy(s,list[j].stdno);
					strcpy(list[j].stdno,list[j+1].stdno);
					strcpy(list[j+1].stdno,s);
					
					f=list[j].cs;
					list[j].cs=list[j+1].cs;
					list[j+1].cs=f;
					
					f=list[j].ms;
					list[j].ms=list[j+1].ms;
					list[j+1].ms=f;
					
					f=list[j].fs;
					list[j].fs=list[j+1].fs;
					list[j+1].fs=f;
					
					f=list[j].score;
					list[j].score=list[j+1].score;
					list[j+1].score=f;
				}
			}
		}
	}
	else
	{
		for(i=m-1;i>=0;i--)
		{
			for(j=0;j<i;j++)
			{
				if(strcmp(list[j].stdno,list[j+1].stdno)>0)
				{
					strcpy(n,list[j].name);
					strcpy(list[j].name,list[j+1].name);
					strcpy(list[j+1].name,n);
					
					strcpy(n,list[j].family);
					strcpy(list[j].family,list[j+1].family);
					strcpy(list[j+1].family,n);
					
					strcpy(s,list[j].stdno);
					strcpy(list[j].stdno,list[j+1].stdno);
					strcpy(list[j+1].stdno,s);
					
					f=list[j].cs;
					list[j].cs=list[j+1].cs;
					list[j+1].cs=f;
					
					f=list[j].ms;
					list[j].ms=list[j+1].ms;
					list[j+1].ms=f;
					
					f=list[j].fs;
					list[j].fs=list[j+1].fs;
					list[j+1].fs=f;
					
					f=list[j].score;
					list[j].score=list[j+1].score;
					list[j+1].score=f;
				}
			}
		}
	}
}

//f4 :
void SortByNumber(stdinfo list[],int m,int k)
{
	char n[30],s[10];
	float f;
	int i,j;
	if (k==1)
	{
		for(i=m-1;i>=0;i--)
		{
			for(j=0;j<i;j++)
			{
				if(list[j].cs>list[j+1].cs)
				{
					strcpy(n,list[j].name);
					strcpy(list[j].name,list[j+1].name);
					strcpy(list[j+1].name,n);
					
					strcpy(n,list[j].family);
					strcpy(list[j].family,list[j+1].family);
					strcpy(list[j+1].family,n);
					
					strcpy(s,list[j].stdno);
					strcpy(list[j].stdno,list[j+1].stdno);
					strcpy(list[j+1].stdno,s);
					
					f=list[j].cs;
					list[j].cs=list[j+1].cs;
					list[j+1].cs=f;
					
					f=list[j].ms;
					list[j].ms=list[j+1].ms;
					list[j+1].ms=f;
					
					f=list[j].fs;
					list[j].fs=list[j+1].fs;
					list[j+1].fs=f;
					
					f=list[j].score;
					list[j].score=list[j+1].score;
					list[j+1].score=f;
				}
			}
		}
		
	}
	if (k==2)
	{
		for(i=m-1;i>=0;i--)
		{
			for(j=0;j<i;j++)
			{
				if(list[j].ms>list[j+1].ms)
				{
					strcpy(n,list[j].name);
					strcpy(list[j].name,list[j+1].name);
					strcpy(list[j+1].name,n);
					
					strcpy(n,list[j].family);
					strcpy(list[j].family,list[j+1].family);
					strcpy(list[j+1].family,n);
					
					strcpy(s,list[j].stdno);
					strcpy(list[j].stdno,list[j+1].stdno);
					strcpy(list[j+1].stdno,s);
					
					f=list[j].cs;
					list[j].cs=list[j+1].cs;
					list[j+1].cs=f;
					
					f=list[j].ms;
					list[j].ms=list[j+1].ms;
					list[j+1].ms=f;
					
					f=list[j].fs;
					list[j].fs=list[j+1].fs;
					list[j+1].fs=f;
					
					f=list[j].score;
					list[j].score=list[j+1].score;
					list[j+1].score=f;
				}
			}
		}
		
	}
	if (k==3)
	{
		for(i=m-1;i>=0;i--)
		{
			for(j=0;j<i;j++)
			{
				if(list[j].fs>list[j+1].fs)
				{
					strcpy(n,list[j].name);
					strcpy(list[j].name,list[j+1].name);
					strcpy(list[j+1].name,n);
					
					strcpy(n,list[j].family);
					strcpy(list[j].family,list[j+1].family);
					strcpy(list[j+1].family,n);
					
					strcpy(s,list[j].stdno);
					strcpy(list[j].stdno,list[j+1].stdno);
					strcpy(list[j+1].stdno,s);
					
					f=list[j].cs;
					list[j].cs=list[j+1].cs;
					list[j+1].cs=f;
					
					f=list[j].ms;
					list[j].ms=list[j+1].ms;
					list[j+1].ms=f;
					
					f=list[j].fs;
					list[j].fs=list[j+1].fs;
					list[j+1].fs=f;
					
					f=list[j].score;
					list[j].score=list[j+1].score;
					list[j+1].score=f;
				}
			}
		}
		
	}
	if (k==4)
	{
		for(i=m-1;i>=0;i--)
		{
			for(j=0;j<i;j++)
			{
				if(list[j].score>list[j+1].score)
				{
					strcpy(n,list[j].name);
					strcpy(list[j].name,list[j+1].name);
					strcpy(list[j+1].name,n);
					
					strcpy(n,list[j].family);
					strcpy(list[j].family,list[j+1].family);
					strcpy(list[j+1].family,n);
					
					strcpy(s,list[j].stdno);
					strcpy(list[j].stdno,list[j+1].stdno);
					strcpy(list[j+1].stdno,s);
					
					f=list[j].cs;
					list[j].cs=list[j+1].cs;
					list[j+1].cs=f;
					
					f=list[j].ms;
					list[j].ms=list[j+1].ms;
					list[j+1].ms=f;
					
					f=list[j].fs;
					list[j].fs=list[j+1].fs;
					list[j+1].fs=f;
					
					f=list[j].score;
					list[j].score=list[j+1].score;
					list[j+1].score=f;
				}
			}
		}
		
	}
	
}
//f5 :

void SearchByChar(stdinfo list[],char s[],int m,int k)
{
	int i,t=0,j,r=1;
	for(i=0;i<m;i++)
	{
	
		if(k==1)
		{	
			for(j=0;s[j];j++)
			{
				if(list[i].name[j]==s[j])
					r=1;
				else
				{
					r=0;
					break;
				}
			}
			if(r)
			{
				t=1;
				printf("Natijeye jostoju:\n\n");
				puts(list[i].name);
				puts(list[i].family);
				puts(list[i].stdno);
				printf("%f\n\n",list[i].cs);
				printf("%f\n\n",list[i].ms);
				printf("%f\n\n",list[i].fs);
				printf("%f\n\n",list[i].score);
				
			}
		}
		else if(k==2)
		{
			for(j=0;s[j];j++)
			{
				if(list[i].family[j]==s[j])
					r=1;
				else
				{
					r=0;
					break;
				}
			}
			if(r)
			{
				t=1;
				printf("Natijeye jostoju:\n\n");
				puts(list[i].name);
				puts(list[i].family);
				puts(list[i].stdno);
				printf("%f\n\n",list[i].cs);
				printf("%f\n\n",list[i].ms);
				printf("%f\n\n",list[i].fs);
				printf("%f\n\n",list[i].score);
				
			}
		}
		else if(k==3)
		{
			for(j=0;s[j];j++)
			{
				if(list[i].stdno[j]==s[j])
					r=1;
				else
				{
					r=0;
					break;
				}

			}
			if(r)
			{
				t=1;
				printf("Natijeye jostoju:\n\n");
				puts(list[i].name);
				puts(list[i].family);
				puts(list[i].stdno);
				printf("%f\n\n",list[i].cs);
				printf("%f\n\n",list[i].ms);
				printf("%f\n\n",list[i].fs);
				printf("%f\n\n",list[i].score);
			}
		}
		r=0;
	}
	if(!t)
		printf("yaft nashod.\n");
}

//f6 :

void SearchByNumber(stdinfo list[],int m,float f,int k)
{
	int i,t=1;
	for(i=0;i<m;i++)
	{
		if(k==1)
		{
			if(list[i].cs==f)
			{
				t=0;
				printf("Natijeye jostoju:\n");
				puts(list[i].name);
				puts(list[i].family);
				puts(list[i].stdno);
				printf("%f\n\n",list[i].cs);
				printf("%f\n\n",list[i].ms);
				printf("%f\n\n",list[i].fs);
				printf("%f\n\n",list[i].score);
			}
		}
		else if(k==2)
		{
			if(list[i].ms==f)
			{
				t=0;
				printf("Natijeye jostoju:\n");
				puts(list[i].name);
				puts(list[i].family);
				puts(list[i].stdno);
				printf("%f\n\n",list[i].cs);
				printf("%f\n\n",list[i].ms);
				printf("%f\n\n",list[i].fs);
				printf("%f\n\n",list[i].score);
			}
		}
		else if(k==3)
		{
			if(list[i].fs==f)
			{
				t=0;
				printf("Natijeye jostoju:\n");
				puts(list[i].name);
				puts(list[i].family);
				puts(list[i].stdno);
				printf("%f\n\n",list[i].cs);
				printf("%f\n\n",list[i].ms);
				printf("%f\n\n",list[i].fs);
				printf("%f\n\n",list[i].score);
			}
		}
		else
		{
			if(list[i].score==f)
			{
				t=0;
				printf("Natijeye jostoju:\n");
				puts(list[i].name);
				puts(list[i].family);
				puts(list[i].stdno);
				printf("%f\n\n",list[i].cs);
				printf("%f\n\n",list[i].ms);
				printf("%f\n\n",list[i].fs);
				printf("%f\n\n",list[i].score);
			}
		}
	}
	if(t)
		printf("yaft nashod.\n");
}

//f7 :
int Change(stdinfo list[],int x)
{
	int k,i,t;
	char n[30];
	float a;
	printf("%d) \n nam:  %s \n nam khanevadegi:  %s \n shomare daneshjui:  %s \n nomre kelasi:  %f \n\n nomre mianterm:  %f \n\n nomre payanterm:  %f \n\n nomre nahayi:  %f \n\n\n",x+1,list[x].name,list[x].family,list[x].stdno,list[x].cs,list[x].ms,list[x].fs,list[x].score);
	printf("\nkodam onsor ra mikhahid taghir dahid?\nlotfan adad an ra vared konid:\n");
	printf("1.nam\n2.nam e khanevadegi\n3.nomre kelasi\n4.nomre mianterm\n5.nomre payanterm\n");
	scanf("%d",&k);
	switch(k)
	{
		case 1:
			printf("nam e jadid ra vared konid:\n");
			scanf("%s",n);		
			strcpy(list[x].name,n);
			break;
		case 2:
			printf("nam e khanevadegi e jadid ra vared konid:\n");
			scanf("%s",n);
			strcpy(list[x].family,n);
			break;
		case 3:
			printf("nomreye jadid ra vared konid:\n");
			scanf("%f",&a);
			list[x].cs=a;
			break;
		case 4:
			printf("nomreye jadid ra vared konid:\n");
			scanf("%f",&a);
			list[x].ms=a;
			break;
		case 5:
			printf("nomreye jadid ra vared konid:\n");
			scanf("%f",&a);
			list[x].fs=a;
			break;
		default:
			printf("adad vared shode sahih nist");
	}
	return k;
}

int main()
{
	FILE *info,*changed;
	//open file :
	info=fopen("E:\\mabani\\project\\information.txt","r+");
	changed=fopen("E:\\mabani\\project\\finalinformation.txt","w+");
	if (!info)
		printf("error: can't read file.");
	//reading data from file to struct :
	stdinfo list[50];
	int i=0,m=0,j;
	char cscore[7],mscore[7],fscore[7];
	while(!feof(info))
	{
		fgets(list[i].name,31,info);
		
		fgets(list[i].family,31,info);
		
		fgets(list[i].stdno,12,info);
		
		fgets(cscore,7,info);
		list[i].cs=CharToFlaot(cscore);
		strcpy(cscore,"\0");
		
		fgets(mscore,7,info);
		list[i].ms=CharToFlaot(mscore);
		strcpy(mscore,"\0");
		
		fgets(fscore,7,info);
		list[i].fs=CharToFlaot(fscore);
		strcpy(fscore,"\0");
		
		
		i++;
		printf("\n\n");
	}
	for(j=(i-1);j<50;j++)
		list[j].cs=0;
	for(j=0;j<50;j++)
		if(list[j].cs!=0)
			m++;
	
	
	//menu :
	int v,k=1;
	int v1,v2;
	int temp,r;
	int x;
	char sh[11];
	int h;
	stdinfo newstd;
	int z;
	while(k==1)
	{
		system("cls");
		printf("\nSalam. Lotfan baraye entekhab har gozine adad an ra vared konid: \n");
		printf("1. mohasebe nomre nahayi daneshju \n");
		printf("2. namayesh list daneshjuyan \n");
		printf("3. jostojuye daneshju \n");
		printf("4. taghir etelaat \n");
		printf("5. ezafe kardan daneshju \n");
		printf("6. hazf daneshju \n");
		printf("7. khoruj \n");
		scanf("%d",&v);
		switch (v)
		{
			case 1:
				FinalScore(list,m);
				printf("Nomre nahayi mohasebe shod.\n\n");
				for(i=0;i<m;i++)
				{
					printf("%d) \n nam:  %s \n nam khanevadegi:  %s \n shomare daneshjui:  %s \n nomre kelasi:  %f \n\n nomre mianterm:  %f \n\n nomre payanterm:  %f \n\n nomre nahayi:  %f \n\n\n",i+1,list[i].name,list[i].family,list[i].stdno,list[i].cs,list[i].ms,list[i].fs,list[i].score);
					fputs(list[i].name,changed);
					fputs(list[i].family,changed);
					fputs(list[i].stdno,changed);
					fprintf(changed,"%f\n",list[i].cs);
					fprintf(changed,"%f\n",list[i].ms);
					fprintf(changed,"%f\n",list[i].fs);
					fprintf(changed,"%f\n",list[i].score);
				}
				printf("Baraye entekhab az menu adad 1 va dar gheir in surat adad 0 ra vared konid:\n");
				scanf("%d",&v1);
				if(v1==1)
					k=1;
				else
					k=0;
				break;
			case 2:
				system("cls");
				printf("List daneshju ha bar che asasi moratab shavad?\nLotfan adad ra vared konid:");
				printf("\n1.nam\n2.nam e khanevadegi\n3.shomare daneshjui\n4.nomre kelasi\n5.nomre mianterm\n6.nomre payanterm\n7.nomre nahayi\n");
				scanf("%d",&v2);
				switch(v2)
				{
					case 1:
						FinalScore(list,m);
						SortByChar(list,m,1);
					//	for(i=0;i<m;i++)
					//		printf("%d) \n nam:  %s \n nam khanevadegi:  %s \n shomare daneshjui:  %s \n nomre kelasi:  %f \n\n nomre mianterm:  %f \n\n nomre payanterm:  %f \n\n nomre nahayi:  %f \n\n\n",i+1,list[i].name,list[i].family,list[i].stdno,list[i].cs,list[i].ms,list[i].fs,list[i].score);
						break;
					case 2:
						FinalScore(list,m);
						SortByChar(list,m,2);
					//	for(i=0;i<m;i++)
					//		printf("%d) \n nam:  %s \n nam khanevadegi:  %s \n shomare daneshjui:  %s \n nomre kelasi:  %f \n\n nomre mianterm:  %f \n\n nomre payanterm:  %f \n\n nomre nahayi:  %f \n\n\n",i+1,list[i].name,list[i].family,list[i].stdno,list[i].cs,list[i].ms,list[i].fs,list[i].score);
						break;
					case 3:
						FinalScore(list,m);
						SortByChar(list,m,3);
					//	for(i=0;i<m;i++)
					//		printf("%d) \n nam:  %s \n nam khanevadegi:  %s \n shomare daneshjui:  %s \n nomre kelasi:  %f \n\n nomre mianterm:  %f \n\n nomre payanterm:  %f \n\n nomre nahayi:  %f \n\n\n",i+1,list[i].name,list[i].family,list[i].stdno,list[i].cs,list[i].ms,list[i].fs,list[i].score);
						break;
					case 4:
						FinalScore(list,m);
						SortByNumber(list,m,1);
					//	for(i=0;i<m;i++)
					//		printf("%d) \n nam:  %s \n nam khanevadegi:  %s \n shomare daneshjui:  %s \n nomre kelasi:  %f \n\n nomre mianterm:  %f \n\n nomre payanterm:  %f \n\n nomre nahayi:  %f \n\n\n",i+1,list[i].name,list[i].family,list[i].stdno,list[i].cs,list[i].ms,list[i].fs,list[i].score);
						break;
					case 5:
						FinalScore(list,m);
						SortByNumber(list,m,2);
					//	for(i=0;i<m;i++)
					//		printf("%d) \n nam:  %s \n nam khanevadegi:  %s \n shomare daneshjui:  %s \n nomre kelasi:  %f \n\n nomre mianterm:  %f \n\n nomre payanterm:  %f \n\n nomre nahayi:  %f \n\n\n",i+1,list[i].name,list[i].family,list[i].stdno,list[i].cs,list[i].ms,list[i].fs,list[i].score);
						break;
					case 6:
						FinalScore(list,m);
						SortByNumber(list,m,3);
					//	for(i=0;i<m;i++)
					//		printf("%d) \n nam:  %s \n nam khanevadegi:  %s \n shomare daneshjui:  %s \n nomre kelasi:  %f \n\n nomre mianterm:  %f \n\n nomre payanterm:  %f \n\n nomre nahayi:  %f \n\n\n",i+1,list[i].name,list[i].family,list[i].stdno,list[i].cs,list[i].ms,list[i].fs,list[i].score);
						break;
						
					case 7:
						FinalScore(list,m);
						SortByNumber(list,m,4);
					//	for(i=0;i<m;i++)
					//		printf("%d) \n nam:  %s \n nam khanevadegi:  %s \n shomare daneshjui:  %s \n nomre kelasi:  %f \n\n nomre mianterm:  %f \n\n nomre payanterm:  %f \n\n nomre nahayi:  %f \n\n\n",i+1,list[i].name,list[i].family,list[i].stdno,list[i].cs,list[i].ms,list[i].fs,list[i].score);
						break;
					default :
						printf("Adad vared shode sahih nemibashad.\n");
				}
				for(i=0;i<m;i++)
				{
					printf("%d) \n nam:  %s \n nam khanevadegi:  %s \n shomare daneshjui:  %s \n nomre kelasi:  %f \n\n nomre mianterm:  %f \n\n nomre payanterm:  %f \n\n nomre nahayi:  %f \n\n\n",i+1,list[i].name,list[i].family,list[i].stdno,list[i].cs,list[i].ms,list[i].fs,list[i].score);
					fputs(list[i].name,changed);
					fputs(list[i].family,changed);
					fputs(list[i].stdno,changed);
					fprintf(changed,"%f\n",list[i].cs);
					fprintf(changed,"%f\n",list[i].ms);
					fprintf(changed,"%f\n",list[i].fs);
					fprintf(changed,"%f\n",list[i].score);
				}
				printf("Baraye entekhab az menu adad 1 va dar gheir in surat adad 0 ra vared konid:\n");
				scanf("%d",&v1);
				if(v1==1)
					k=1;
				else
					k=0;
				break;
			case 3:
				system("cls");
				printf("Bar che asasi mikhahid jostoju konid?\nlotfan adad ra vared konid:\n");
				printf("\n1.nam\n2.nam e khanevadegi\n3.shomare daneshjui\n4.nomre kelasi\n5.nomre mianterm\n6.nomre payanterm\n7.nomre nahayi\n");
				scanf("%d",&v2);
				char s[31];
				float f;
				switch (v2)
				{
					case 1:
						FinalScore(list,m);
						printf("nam e mored nazar khod ra vared konid:\n");
						scanf("%s",&s);
						SearchByChar(list,s,m,1);
						break;
					case 2:
						FinalScore(list,m);
						printf("nam e khanevadegi mored nazar khod ra vared konid:\n");
						scanf("%s",&s);
						SearchByChar(list,s,m,2);
						break;
					case 3:
						FinalScore(list,m);
						printf("shomare daneshjui e mored nazar khod ra vared konid:\n");
						scanf("%s",&s);
						SearchByChar(list,s,m,3);
						break;
					case 4:
						FinalScore(list,m);
						printf("nomre kelasi mored nazar khod ra vared konid:\n");
						scanf("%f",&f);
						SearchByNumber(list,m,f,1);
						break;
					case 5:
						FinalScore(list,m);
						printf("nomre mianterm mored nazar khod ra vared konid:\n");
						scanf("%f",&f);
						SearchByNumber(list,m,f,2);
						break;
					case 6:
						FinalScore(list,m);
						printf("nomre paianterm mored nazar khod ra vared konid:\n");
						scanf("%f",&f);
						SearchByNumber(list,m,f,3);
						break;
					case 7:
						FinalScore(list,m);
						printf("nomre nahayi mored nazar khod ra vared konid:\n");
						scanf("%f",&f);
						SearchByNumber(list,m,f,4);
						break;
					default :
						printf("adad vared shode sahih nist.\n");
						printf("Baraye entekhab az menu adad 1 va dar gheir in surat adad 0 ra vared konid:\n");
						scanf("%d",&v1);
						if(v1==1)
							k=1;
						else
							k=0;
						break;
				}
				
				printf("Baraye entekhab az menu adad 1 va dar gheir in surat adad 0 ra vared konid:\n");
				scanf("%d",&v1);
				if(v1==1)
					k=1;
				else
					k=0;
				break;
				
			case 4:
				
				system("cls");
				printf("shomare daneshjui shakhs mored nazar ra vared konid:\n");
				scanf("%s",sh);
				for(i=0;i<m;i++)
				{
					for(j=0;j<10;j++)
					{
	
						if(list[i].stdno[j]==sh[j])
						{
							r=1;
							x=i;
							if(j==9)
								break;
						}
						else
						{
							r=0;
							x=(-1);
							break;
						}		
					}
					if(r)
						break;
				}
				if(x==(-1))
					printf("daneshju ba in shomare daneshjui vojud nadarad.\n");
				else if(x>=0)
				{
					h=Change(list,x);
					system("cls");
					printf("taghiir emal shod.\n");
					FinalScore(list,m);
					printf("%d) \n nam:  %s \n nam khanevadegi:  %s \n shomare daneshjui:  %s \n nomre kelasi:  %f \n\n nomre mianterm:  %f \n\n nomre payanterm:  %f \n\n nomre nahayi:  %f \n\n\n",x+1,list[x].name,list[x].family,list[x].stdno,list[x].cs,list[x].ms,list[x].fs,list[x].score);
					for(i=0;i<m;i++)
					{
						if(h==1)
						{
							if(x==i)
							{
								fputs(list[i].name,changed);
								fprintf(changed,"\n");
								fputs(list[i].family,changed);
								fputs(list[i].stdno,changed);
								fprintf(changed,"%f\n",list[i].cs);
								fprintf(changed,"%f\n",list[i].ms);
								fprintf(changed,"%f\n",list[i].fs);	
								fprintf(changed,"%f\n",list[i].score);
							}
							else
							{
								fputs(list[i].name,changed);
								fputs(list[i].family,changed);
								fputs(list[i].stdno,changed);
								fprintf(changed,"%f\n",list[i].cs);
								fprintf(changed,"%f\n",list[i].ms);
								fprintf(changed,"%f\n",list[i].fs);	
								fprintf(changed,"%f\n",list[i].score);
							}
							
						}
						else if(h==2)
						{
							if(x==i)
							{
								fputs(list[i].name,changed);
								fputs(list[i].family,changed);
								fprintf(changed,"\n");
								fputs(list[i].stdno,changed);
								fprintf(changed,"%f\n",list[i].cs);
								fprintf(changed,"%f\n",list[i].ms);
								fprintf(changed,"%f\n",list[i].fs);	
								fprintf(changed,"%f\n",list[i].score);
							}
							else
							{
								fputs(list[i].name,changed);
								fputs(list[i].family,changed);
								fputs(list[i].stdno,changed);
								fprintf(changed,"%f\n",list[i].cs);
								fprintf(changed,"%f\n",list[i].ms);
								fprintf(changed,"%f\n",list[i].fs);	
								fprintf(changed,"%f\n",list[i].score);
							}
						}
						else
						{
							if(x==i)
							{
								fputs(list[i].name,changed);
								fputs(list[i].family,changed);
								fputs(list[i].stdno,changed);
								fprintf(changed,"%f\n",list[i].cs);
								fprintf(changed,"%f\n",list[i].ms);
								fprintf(changed,"%f\n",list[i].fs);	
								fprintf(changed,"%f\n",list[i].score);
							}
							else
							{
								fputs(list[i].name,changed);
								fputs(list[i].family,changed);
								fputs(list[i].stdno,changed);
								fprintf(changed,"%f\n",list[i].cs);
								fprintf(changed,"%f\n",list[i].ms);
								fprintf(changed,"%f\n",list[i].fs);	
								fprintf(changed,"%f\n",list[i].score);
							}
						}
					}
					rewind(changed);
				}
				printf("Baraye entekhab az menu adad 1 va dar gheir in surat adad 0 ra vared konid:\n");
				scanf("%d",&v1);
				if(v1==1)
					k=1;
				else
					k=0;
				break;
			case 5:
				system("cls");
				printf("Lotfan etelaat daneshjuye jadid ra be tartib zir vared konid.");
				printf("\n nam:");
				scanf("%s",newstd.name);
				printf("\n nam e khanevadegi:");
				scanf("%s",newstd.family);
				printf("\n shomare daneshjui:");
				scanf("%s",newstd.stdno);
				printf("\n nomre kelasi:");
				scanf("%f",&newstd.cs);
				printf("\n nomre mianterm:");
				scanf("%f",&newstd.ms);
				printf("\n nomre payanterm:");
				scanf("%f",&newstd.fs);
				//
				for(i=0;i<m;i++)
				{
					for(j=0;j<10;j++)
					{
	
						if(list[i].stdno[j]==newstd.stdno[j])
						{
							r=1;
							x=i;
							if(j==9)
								break;
						}
						else
						{
							r=0;
							
							x=(-1);
							break;
						}	
						
					}
					if(r)
						break;
				}
				if(x==(-1))
				{
						strcpy(list[m].name,newstd.name);
						strcpy(list[m].family,newstd.family);
						strcpy(list[m].stdno,newstd.stdno);
						list[m].cs=newstd.cs;
						list[m].ms=newstd.ms;
						list[m].fs=newstd.fs;
						m++;
						printf("daneshju ezafe shod.\n");
						FinalScore(list,m);
						for(i=0;i<m-1;i++)
						{
							fputs(list[i].name,changed);
							fputs(list[i].family,changed);
							fputs(list[i].stdno,changed);
							fprintf(changed,"%f\n",list[i].cs);
							fprintf(changed,"%f\n",list[i].ms);
							fprintf(changed,"%f\n",list[i].fs);	
							fprintf(changed,"%f\n",list[i].score);
						}
						fputs(list[m-1].name,changed);
						fprintf(changed,"\n");
						fputs(list[m-1].family,changed);
						fprintf(changed,"\n");
						fputs(list[m-1].stdno,changed);
						fprintf(changed,"\n");
						fprintf(changed,"%f\n",list[m-1].cs);
						fprintf(changed,"%f\n",list[m-1].ms);
						fprintf(changed,"%f\n",list[m-1].fs);	
						fprintf(changed,"%f\n",list[m-1].score);
				}
				else if(x>=0)
					printf("daneshju ba in shomare daneshjui vojud darad.nemitavanid ezafe konid.\n");
				printf("Baraye entekhab az menu adad 1 va dar gheir in surat adad 0 ra vared konid:\n");
				scanf("%d",&v1);
				if(v1==1)
					k=1;
				else
					k=0;
				break;
			case 6:
				
				system("cls");
				printf("shomare daneshjui shakhs mored nazar ra vared konid:\n");
				scanf("%s",sh);
				for(i=0;i<m;i++)
				{
					for(j=0;j<10;j++)
					{
						if(list[i].stdno[j]==sh[j])
						{
							r=1;
							x=i;
							if(j==9)
								break;
						}
						else
						{
							r=0;
							x=(-1);
							break;
						}		
					}
					if(r)
						break;
				}
				if(x==(-1))
					printf("daneshju ba in shomare daneshjui vojud nadarad.\n");
				else if(x>=0)
				{
					for(i=x;i<m;i++)
					{
						strcpy(list[i].name,list[i+1].name);
						strcpy(list[i].family,list[i+1].family);
						strcpy(list[i].stdno,list[i+1].stdno);
						list[i].cs=list[i+1].cs;
						list[i].ms=list[i+1].ms;
						list[i].fs=list[i+1].fs;
						list[i].score=list[i+1].score;
					}
					m--;
					printf("daneshju hazf shod.");
					FinalScore(list,m);
					for(i=0;i<m;i++)
						{
							printf("%d) \n nam:  %s \n nam khanevadegi:  %s \n shomare daneshjui:  %s \n nomre kelasi:  %f \n\n nomre mianterm:  %f \n\n nomre payanterm:  %f \n\n\n",i+1,list[i].name,list[i].family,list[i].stdno,list[i].cs,list[i].ms,list[i].fs);
							fputs(list[i].name,changed);
							fputs(list[i].family,changed);
							fputs(list[i].stdno,changed);
							fprintf(changed,"%f\n",list[i].cs);
							fprintf(changed,"%f\n",list[i].ms);
							fprintf(changed,"%f\n",list[i].fs);	
							fprintf(changed,"%f\n",list[i].score);
						}
					rewind(changed);
				}
				printf("Baraye entekhab az menu adad 1 va dar gheir in surat adad 0 ra vared konid:\n");
				scanf("%d",&v1);
				if(v1==1)
					k=1;
				else
					k=0;
				break;
				
			case 7:
				system("cls");
				printf("bye bye :)");
				k=0;
				break;
			default :
				printf("Adad vared shode sahih nemibashad.\n");
				printf("Baraye entekhab az menu adad 1 va dar gheir in surat adad 0 ra vared konid:\n");
				scanf("%d",&v1);
				if(v1==1)
					k=1;
				else
				{
					k=0;
					system("cls");
				}
				break;
				
		}
	}
	if(k==0)
	{
		system("cls");
		printf("az barname kharej shodid.\n\n ****khodanegahdar****");
	}
	fclose(info);
	fclose(changed);
	
	
	getch();
	return 0;
}
