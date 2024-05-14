package stringproblemspack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringProblemCls {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for(int i=1;i<=5;i++) {
//			for(int j=i;j<=5;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		for(int i=1;i<=5;i++) {
//			for(int j=i;j<=5;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=i;j<=5;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=1;i<=5;i++) {
//			for(int j=i;j<=5;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=i;j<=5;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
StringProblemCls obj=new StringProblemCls();
//obj.chartoAscii("abcdefgh");
//obj.sortArr();
//obj.largestEle();
//obj.sortstrArr();
//obj.findDub();
//obj.reverseStr();
//System.out.println(obj.isPrime());
//System.out.println(obj.fact(4));
//obj.armstrongNum();
//obj.strConut();
//obj.removeDubStr();
//obj.fibo();
//obj.findWordCount("thuparku thuppaya thoovum thuparku thoovum malai kalai malai");
//obj.findSumOfTwoEle();
//obj.makeFirstLetterCapital();
//obj.checkArrincreasing();
//obj.findMisingNum();
//obj.reverseWords();
//obj.findMinMaxNum();
//obj.handleFun();
//System.out.println(obj.isConsecutive());
//obj.checkLeapYear();
//obj.rotate();
//obj.rotateLeft();
//obj.findBinery();
//obj.findSingleNum();
//obj.findLeader();
//obj.findMactchingword();

		
	}

//	public void chartoAscii(String str) {
//		int len=str.length();
//		for(int i=0;i<len;i++) {
//			char c=str.charAt(i);
//			System.out.println(c+" "+(int)c);
//		}
//		
//	}
	
//	public void sortArr() {
//		int[] arr= {4,9,34,22,14,87,96};
//		int tmp;
//		for(int i=0;i<arr.length;i++)	{
//			for(int j=0;j<arr.length-i-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					tmp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=tmp;
//				}
//			}
//		}
//		for(int k:arr) {
//			System.out.print(k+" ");
//		}
//			}
	
//	public void largestEle() {
//		int[] arr= {4,9,34,22,14,87,96};
//		int max=arr[0];
//		int sec=0;
//		for(int i=1;i<arr.length;i++) {
//			if(max<arr[i]) {
//				sec=max;
//				max=arr[i];
//			}
//			
//		}
//		System.out.println(max+" "+sec);
//		
//		
//	}
	
//	public void sortstrArr() {
//	String[] arr= {"manoj","zen","karthik","deva","abi","cat"};
//	String tmp;
//	for(int i=0;i<arr.length;i++)	{
//		for(int j=0;j<arr.length-i-1;j++) {
//			if(arr[j].compareTo(arr[j+1])>0) {
//				tmp=arr[j];
//				arr[j]=arr[j+1];
//				arr[j+1]=tmp;
//			}
//		}
//	}
//	for(String k:arr) {
//		System.out.print(k+" ");
//	}
//		}
	
	
	
//	public void findDub() {
//		int arr[]= {4,7,8,4,12,8,67,76,67};
//		int len=arr.length;
//		int tmp;
//		for(int i=0;i<arr.length;i++)	{
//			for(int j=0;j<arr.length-i-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					tmp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=tmp;
//				}
//			}
//		}
//		
		
//		for(int k=0;k<arr.length-1;k++) {
//			if(arr[k]==arr[k+1]) {
//				for(int m=k+1;m<arr.length-1;m++) {
//					arr[m]=arr[m+1];
//					
//				}
//				
//					
//			}
//		}
//		int uni=0;
//		for(int i=0;i<len-1;i++) {
//			if(arr[i]!=arr[i+1]) {
//				arr[uni++]=arr[i];
//			}
//		}
//		
//		for(int k=0;k<len;k++) {
//			System.out.print(arr[k]);
//		}
		
	
//	public void reverseStr() {
//		String str="refer";
//		String rev="";
//		for(int i=0;i<str.length();i++) {
//			rev=str.charAt(i)+rev;
//		}
//	
//	System.out.println(rev);
//	System.out.println(str);
//	
//
//	}
	
//	public void reverseNum() {
//		int num=63799918;
//		int tmp,sum=0;
//		while(num>0) {
//			tmp=num%10;
//			sum=sum*10+tmp;
//			num=num/10;
//		}
//		System.out.println(sum);
//		
//	}

	
//	public boolean isPrime() {
//		int num=10;
//		boolean isp=true;
//		for(int i=2;i<num;i++){
//			if(num%i==0) {
//				System.out.println("Its not prime");
//				isp=false;
//				break;
//			}
//		}
//		return isp;
//		
//	}
	
//	public int fact(int n) {
//		if(n==1||n==0) {
//			return 1;
//		}else {
//			return n*fact(n-1);
//		}
//		
//	}
	
//	public void armstrongNum() {
//		int num=153;
//		int tmp;
//		int dub=0;
//		while(num>0) {
//			tmp=num%10;
//			dub+=Math.pow(tmp, 3);
//			num=num/10;
//			
//			
//		}
//		System.out.println(dub);
//	} 
	
	
	
//	public void strConut() {
//		String str="hey everyone hey hai hello everyone";
//		String newstr[]=str.split(" ");
//		Map<String,Integer> obj=new HashMap<>();
//		for(String s:newstr) {
//			if(obj.containsKey(s)) {
//				obj.put(s, obj.get(s)+1);
//				System.out.println(obj.get(s));
//				
//			}else {
//				obj.put(s, 1);
//			}
//			
//		}
//		for(Map.Entry<String, Integer> entity:obj.entrySet()) {{
//			System.out.println(entity.getKey()+" "+ entity.getValue());
//		}
//			
//		}
//		
//	}
	
	
	
//	public void removeDubStr() {
//		String str="kkaarrthrik";
//		Set<Character> obj=new HashSet();
//		StringBuffer sobj=new StringBuffer();
//		for(int i=0;i<str.length();i++) {
//			Character c=str.charAt(i);
//			if(!obj.contains(c)) {
//				obj.add(c);
//				sobj.append(c);
//}
//		}
//System.out.println(sobj);
//		
//	}
	
	
//	public void fibo() {
//		int t1,t2,total;
//		t1=0;
//		t2=1;
//		total=1;
//		System.out.println(t1);
//		for(int i=1;i<10;i++) {
//			System.out.println(total);
//			total=t1+t2;
//			t1=t2;
//			t2=total;
//			
//		}
//	}
	
	//--------------------check anagram----------------------------------------//
	
//	public void checkAnagram(String str1,String str2) {
//		int n1=str1.length();
//		int n2=str2.length();
//		if(n1!=n2) {
//			System.out.println("this is not anagram");
//			return;
//		}
//		char[] ch=str1.toCharArray();
//		char [] c=str2.toCharArray();
//		Arrays.sort(ch);
//		Arrays.sort(c);
//		for(int i=0;i<n1;i++) {
//			if(ch[i]!=c[i]) {
//				System.out.println("its not anagram");
//				break;
//			}
//		}
//		
//	)
		
//	}
	
	
	//------------------------find the same word count-----------------------//
	
	 // not completed//
	
//	public void findWordCount(String str) {
//		String arrstr[]=str.split(" ");
//		Set<String> obj=new HashSet<String>();
//		for(String st:arrstr) {
//			if(!obj.contains(st)) {
//				obj.add(st);
//			}
//		}
//		
//		
//		
//		for(int i=0;i<arrstr.length;i++) {
//			int k=1;
//			for(int j=0;j<arrstr.length;j++) {
//				
//				if((i!=j)) {
//					if(arrstr[i].equals(arrstr[j])) {
//						k++;
//					}
//				}
//				
//			}
//			System.out.println(arrstr[i]+" "+k);
//		}
//		
//	}
	
	
	//-------------------------find the sum of two elements == tarhet-----------------------//
	
//	public void findSumOfTwoEle() {
//		
//		int arr[]= {1,7,8,9,20,12,14};
//		int target=31;
//		boolean ans=false;
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//			
//					if(arr[i]+arr[j]==target){
////						System.out.println(arr[i]+" "+arr[j]);
//						
//						ans=true;
//						
//					}else {
//						ans=false;
//					}
//			
//			}
//		}
//	}
//  
	
	
	//--------------------makefistlettercapital-------------------------------------//
	
//	public void makeFirstLetterCapital() {
//	    String str = "hii i am karthik i went to hospital tomorrow";
//	    String strArr[] = str.split(" ");
//
//	    for (int i = 0; i < strArr.length; i++) {
//	        if (!strArr[i].isEmpty()) {
//	            strArr[i] = strArr[i].substring(0, 1).toUpperCase()+strArr[i].substring(1) ;
//	            System.out.print(strArr[i]+" ");
//	        }
//	    }
//	}

	
	
	//----------------------check array is increasing or decreasing--------------------------------//
	
//	public void checkArrincreasing() {
//		int arr[]= {7,4,3,1,67};
//		boolean increasing=true;
//		boolean decreasing=true;
//		for(int i=0;i<arr.length-1;i++) {
//			if(arr[i]<arr[i+1]) {
//				
//				decreasing=false;
//				
//			}else if(arr[i]>arr[i+1]){
//			
//				increasing=false;
//			}
//			
//			}
//		
//		if(increasing) {
//			System.out.println("increasing");
//		}
//		else if(decreasing) {
//			System.out.println("decreasing");
//		}
//		else {
//			System.out.println("increasing or decreasing");
//		}
//		}

	
	//-------------find missing number in array-----------------------------//
	
//	public void findMisingNum() {
//		
//		int arr[]= {1,2,3,4,5,6,8,9,10};
//		int arrtotal=0;
//		int numtotal=0;
//		int misnum;
//		int n=10;
//		for(int i=0;i<arr.length;i++) {
//			arrtotal=arrtotal+arr[i];
//		}
//		System.out.println(arrtotal);
//		
//		numtotal=n*(n+1)/2;
//		System.out.println(numtotal);
//		
//		misnum=numtotal-arrtotal;
//		System.out.println(misnum);
//		
//		
//	}
	
	
	//----------------------reverse words------------------------------//
	
//	public void reverseWords() {
//		String str="i am karthik";
//		StringBuilder obj=new StringBuilder();
//		String arrstr[]=str.split(" ");
//		for(int i=arrstr.length-1;i>=0;i--) {
//			obj.append(arrstr[i]);
//			obj.append(" ");
//			
//		}
//		System.out.println(obj);
		
		//----------no use inbuilt function---------------------//
		
//		String arr[]=new String[3];
//		int j=0;
//		String st="";
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)!=' ') {
//				 st=st+str.charAt(i);
//			}
//			else if(str.charAt(i)==' ') {
//
//				arr[j++]=st;
//				System.out.println(st);
//				st="";
//			
//			}
//	
//		}
//		arr[j++]=st;
//		for(String s:arr) {
//			System.out.println(s);
//		}
//		
//	}
	
	
	//-----------------------------findminmaxNum---------------------------//
	
//	public void findMinMaxNum() {
//		int arr[]= {8,9,14,45,87,23,76,43,1};
//		int max=arr[0];
//		int min=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//				
//			}
//			else if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
//		System.out.println(max+" "+min);
//	}
	
	
	//-----------------------------print hello---------------------------//
	
//	public void handleFun() {
//		int n=1;
//		while(n==1) {
//			System.out.println("Enter te number");
//			Scanner sc=new Scanner(System.in);
//			int num=sc.nextInt();
//			if(num%3==0&&num%5==0) {
//				System.out.println(num);
//			}
//			else if(num%5==0) {
//				System.out.println("HELLO WORLD");
//			}
//			else if(num%3==0) {
//				System.out.println("World");
//			}
//			
//			System.out.println("if you want to not continue enter 0 ");
//			n=sc.nextInt();
//			
//		}
//		
//	}
	
	
	//-------------------check consecutive or non consecutive-----------------------------//
	
	
	
	
//	public boolean isConsecutive() {
//		int arr[]= {4,5,6,8,11,12,13,14};
//		if(arr.length<2) {
//			return false;
//			
//		}
//		
//		for(int i=0;i<arr.length-1;i++) {
//			if(arr[i+1]-arr[i]!=1) {
//			
//				return false;
//			}
//			
//			
//		}
//		return true;
//			}
	
	
	//------------------------------check leap year-------------------------------------//
	
//	public void checkLeapYear() {
//		int num=1800;
//		if(num%4==0&&num%100!=0) {
//			System.out.println("leap year");
//		}
//		else if(num%400==0) {
//			System.out.println("leap year");
//		}else {
//			System.out.println("non leap year");
//		}
//	}
//	
	
	//--------------------------rotate right--------------------//
	
//	public void rotate() {
//		int arr[]= {4,5,6,7,8,9};
//
//		int last=arr[arr.length-1];
//		for(int i=arr.length-1;i>=0;i--) {
//			if(i==0) {
//				arr[i]=last;
//				
//			}else {
//				arr[i]=arr[i-1];
//			}
//		}
//		for(int k:arr) {
//			System.out.print(k+" ");
//		}
//	}
	
	
	//------------------------rotate left----------------------------//
//	public void rotateLeft() {
//		int arr[]= {4,5,6,7,8,9};
//		int first=arr[0];
//  for(int i=0;i<arr.length;i++) {
//	  if(i==arr.length-1) {
//		  arr[i]=first;
//	  }else {
//		  arr[i]=arr[i+1];
//	  }
// }
//  for(int k:arr) {
//		System.out.print(k+" ");
//	}
//		
//	}
//
//	
	
	//---------------find binery -----------------------------//
	
//	public void findBinery() {
//		int num=344;
	
//		String str=" ";
//		while(num>0) {
//			int tmp=num%2;
//			str=tmp+str;
//			num=num/2;
//			
//		}
//		System.out.println(str);
//		
//	}
	
	//---------------------find a single number in a array----------------------------//
	
//   public void findSingleNum() {
//   int arr[]= {2,2,1,4,1,6,7};
//   int result=0;
//   for(int n:arr) {
//	result ^=n;
//   }
//    System.out.println(result);
//   
//	}
	
	
	// --find leader number its means that number oda  right side all number < that number--------------------//
	
//	public void findLeader() {
//		int arr[]= {16,17,4,3,5,2};
//		boolean is=false;
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					is=true;
//				}else {
//					is=false;
//					break;
//				}
//				
//			}
//			if(is==true) {
//				System.out.println(arr[i]);
//			}
//		}
		
		//--------or----------------//
		
//		int max=2;
//		for(int i=arr.length-2;i>=0;i--) {
//			if(arr[i]>max) {
//				System.out.println(arr[i]);
//				max=arr[i];
//			}
//		}
//	}
	
	
	//--------------find the matching character----------------------------//
	
	
//	public void findMactchingword() {
//		String str1="hello world";
//		
//		String str2="delhi";
//		String newstr="";
//		
//		//--remove the dublicate-------//
//		
//		char arrchar1[]=str1.toCharArray();
//		Set<Character> obj=new HashSet<Character>();
//		for(char k:arrchar1) {
//			if(!obj.contains(k)) {
//				obj.add(k);
//				newstr+=k;
//			}
//			
//		}
//		System.out.println(newstr);
//	
//		
//		char arrchar2[]=str2.toCharArray();
//		for(int i=0;i<newstr.length();i++) {
//			for(int j=0;j<arrchar2.length;j++) {
//
//					if(newstr.charAt(i)==arrchar2[j]) {
//						System.out.println(newstr.charAt(i));
//					
//						break;
//					}
//					
//
//				
//			}
//			
//		}
//		
//		
//	}

	
	
	//------------------Equilibrium-----------------------//
	
	public void findEquilibrium() {
		int arr[]= {1,3,5,2,2};
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
