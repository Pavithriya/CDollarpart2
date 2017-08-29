public  class armstrong

{

protected static void main(String args[])

{

int  n= Integer.parseInt(args[0]);
int  n1=n;
int  s=0;
int  r=0;

while  ( n>0)

{

r= n %10;

n=n/10;

s=s+r*r*r;


}
if (s==n1)
System.out.println("Armstrong");
else
System.out.println("not Armstrong");



}


}