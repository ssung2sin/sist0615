//package main;
//
//import java.util.Scanner;
//
//public class Main5 {
//
//   public static void main(String[] args) {
//      // TODO Auto-generated method stub
//      Scanner sc=new Scanner(System.in);
//    
//      int n=sc.nextInt();
//      int x=sc.nextInt();
//      int y=sc.nextInt();
//      int a=0;
//      int b=0;
//      int i,j=0;
//      int [] tmp;
//      int cnt=0;
//      int n2=1;
//      int tmpx=0,tmpy=0;
//      for(int c=1;c<=n;c++) {
//    	  n2*=2;
//      }
//      tmp=new int[n];
//      for(int k=0;k<tmp.length;k++){
//    	  tmp[k]=1;
//      }
//      int [][]arr=new int[n2][n2];
//      while(true) {
//    	  for(i=a;i<a+2;i++) {
//    	  	for(j=b;j<b+2;j++) {
//    	  		arr[i][j]=cnt;
//    	  		cnt++;
//    	  		}
//
//    	 }
//    	 if(i==j) {
//      	  	if(tmp[n2-1]==4) {
//      	  		System.out.println(arr[x][y]);
//      	  		return;
//      	  	}
//	  		for(int l=(tmp.length-1);l<=0;l--) {
//	  			
//	  		}
//  	  	 }
//  	  	 else if(j-tmp>i) {
//  	  		 tmp2=b;
//  	  		 a+=2;
//  	  		 b=tmp1;
//  	  	 }
//  	  	else if(i>j) {
//  	  		tmp1=a;
//  	  		b+=2;
//  	  		a=tmp2;
//  	  	}
//      }
//      
//   }
//
//}