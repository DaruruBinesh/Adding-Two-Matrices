import java.util.Scanner;
class AddingMatrices{
public static void main(String[] args){
Scanner a=new Scanner(System.in);
int i,j,b1,b2,b3,b4;
int s[][] = new int[100][100];
int x[][] = new int[100][100];
int A[][] = new int[100][100];
System.out.println(" ");
System.out.print("--> 1st D of matrix :");
b1=a.nextInt();
System.out.print("--> 2nd D of matrix :");
b2=a.nextInt();
System.out.println(" ");
for(i=0;i<b1;i++){
for(j=0;j<b2;j++){
System.out.print("Enter A "+(i+1)+"x"+(j+1)+" : ");
s[i][j]=a.nextInt();
}
}
System.out.println(" ");
System.out.print("--> 1st D of matrix :");
b3=a.nextInt();
System.out.print("--> 2nd D of matrix :");
b4=a.nextInt();
System.out.println(" ");
for(i=0;i<b3;i++){
for(j=0;j<b4;j++){
System.out.print("Enter B "+(i+1)+"x"+(j+1)+" : ");
x[i][j]=a.nextInt();
}
}

for(i=0;i<b1;i++){
for(j=0;j<b2;j++){

A[i][j]=s[i][j]+x[i][j];
}
}
System.out.println(" ");
System.out.println("--------------");
System.out.println(" ");
for(i=0;i<b1;i++){
for(j=0;j<b2;j++){
System.out.print(A[i][j]);
System.out.print(" ");
if(j==b2-1){
System.out.println(" ");
}else{}

}
}
}
}