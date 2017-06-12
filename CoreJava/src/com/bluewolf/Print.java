package com.bluewolf;

public class Print {

	public Print() {
		// TODO Auto-generated constructor stub
	}
	static int getIntegerComplement(int n) {
        int m=n;
        String s="";
    while(m!=0){
       int rem=m%2;
       m=m/2;
        if(rem==1)
          s=s+"0";
        else
            s=s+"1";
    }
    System.out.print(s);
        double op=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
            	
                op=op+Math.pow(2, i);
                System.out.println(op);
            }
            
        }
        System.out.println((int)op);
        return (int)op;
       
    }
	public static void main(String[] args) {
		System.out.println(getIntegerComplement(50));
	}

}
