import java.util.*;
class Student {
int rollno;
void getnum()
{
Scanner in = new Scanner(System.in);
System.out.println("Enter the rollno: ");
rollno = in.nextInt();
}
void putnum()
{
System.out.println("Rollno: "+rollno);
}
}
class Test extends Student {
int mark1, mark2;
void getmarks()
{
Scanner in = new Scanner(System.in);
System.out.println("Enter mark 1 and mark 2: ");
mark1 = in.nextInt();
mark2 = in.nextInt();
}
void putmarks()
{
System.out.println("Mark 1: "+ mark1);
System.out.println("Mark 2: "+ mark2);
}
}
class Result extends Test {
int total;
void calculateTotal()
{
total = mark1 + mark2;
}

void puttotal()
{
System.out.println("Total: "+total);
System.out.println();
}
}
public class studentresult {
public static void main(String[] args)
{
System.out.print("Enter the number of students");
Scanner in = new Scanner(System.in);
int n = in.nextInt();
Result[] obj = new Result[n];
for (int i=0; i< n; i++) {
obj[i] = new Result();
obj[i].getnum();
obj[i].getmarks();
obj[i].calculateTotal();
}
for (int i=0; i< n; i++) {
obj[i].putnum();
obj[i].putmarks();
obj[i].puttotal();
System.out.println();
}
}
}