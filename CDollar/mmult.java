import  java.io.*;

public  class  mmult

{
protected static void main(String args[])

{

int  n= Integer.parseInt(args[0]);

int  m= Integer.parseInt(args[1]);
int  p= Integer.parseInt(args[2]);

int  a[][] = new int[100][100];

int  b[][] = new int[100][100];

int  c[][] = new int[100][100];

for(int  i=0;i<=m;i++)

{

for(int  j=0;j<=n;j++)


{

BufferedReader br= new  BufferedReader(new InputStreamReader(System.in));

int s= Integer.parseInt(br.readLine());

a[i][j]=s;

}


}



for(int  i=0;i<=m;i++)

{

for(int  j=0;j<=n;j++)


{
System.out.print(" "+a[i][j]);

}

System.out.println(" ");

}

/***  B MATRIX  ****/


for(int  i=0;i<=m;i++)

{

for(int  j=0;j<=n;j++)


{

BufferedReader br= new  BufferedReader(new InputStreamReader(System.in));

int s= Integer.parseInt(br.readLine());

b[i][j]=s;

}


}



for(int  i=0;i<=m;i++)

{

for(int  j=0;j<=n;j++)


{
System.out.print(" "+b[i][j]);

}

System.out.println(" ");

}


for  (int i=0; i<=m;i++)

{

for(int  j=0;j<=n;j++)
{
for(int  k=0;k<=p;k++)

{
c[i][k]=c[i][k]+a[i][j] * b[j][k];

}
}


}




for(int  i=0;i<=m;i++)

{

for(int  k=0;k<=p;k++)


{
System.out.print(" "+c[i][k]);

}

System.out.println(" ");

}






}



}