public  class  palindrome

{

protected static void main(String args[])

{

int  n= Integer.parseInt(args[0]);
int  n1=n;
int  r=0;

int  c=0;

while (n1 >0 )

{
r =n1 %10;

n1=n1/10;

c=c *10 +r;


}

if  (n==c) 

System.out.println("Palindrome");

else

System.out.println("not Palindrome");


}


}