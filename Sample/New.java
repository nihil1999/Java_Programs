/**
 * 
 */
package Sample;

import java.util.Scanner;

/**
 * @author logan
 *
 */
public class New {

	/**
	 * @param args
	 */
		 public static void main(String[] args) {
			 New obj=new New();
		  int[] num1= {2,3,4,3,5};
		  obj.method(num1);
		 }
		 public void method(int[] num1) { 
		  Scanner obj=new Scanner(System.in);
		  System.err.println("Enter the number :");
		  int no=obj.nextInt();
		  
		  int[] num=new int[5];
		  for(int i=num.length-1;i>=0;i--) {
		   num[i]=no%10;
		   no=no/10;
		  }
		  char[] ar=new char[5];
		  for(int j=0;j<num1.length;j++) {
		   boolean[] check=new boolean[5];
		   int count=met(num1,num[j]);
		   for(int i=0;i<num1.length;i++) {
		    if(num[j]==num1[i] && j==i) {
		     ar[j]='c';
		     check[j]=true;
		     if(count==2) {
		      ar[j]='B';
		       }
		     if(count==3) {
		      ar[j]='T';}
		     break;
		    }
		    else if(num[j]==num1[i]) {
		      check[j]=true;
		      ar[j]='p';
		      if(count==2) {
		       ar[j]='R';}
		      if(count==3) {
		       ar[j]='t';} 
		      }
		    else if(check[j]==false)
		     ar[j]='x';
		   }  
		  } 
		  for(int i=0;i<num1.length;i++) {
		   System.out.println(ar[i]);
		  }
		  int count=0;
		  for(int i=0;i<num1.length;i++) {
		   if(ar[i]=='c') 
		    count++; 
		  }
		  if(count==5) {
		   System.out.println("Matching number");
		  }
		  else
		   System.out.println("Non Matching number");
		   method(num1);  
		 }
		 public int met(int num1[],int no) {
		  int count=0;
		  for(int i=0;i<num1.length;i++) {
		   if(no==num1[i])
		    count++;
		  }
		  //System.out.println(count);
		  return count;
		 }
		}
