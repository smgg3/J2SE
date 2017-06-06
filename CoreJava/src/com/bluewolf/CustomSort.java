package com.bluewolf;

public class CustomSort {

	public CustomSort() {
		// TODO Auto-generated constructor stub
	}

    static int moves(int[] a) {
    int moves=0;
    int i=0,j=a.length-1,e=0,o=0;
        while(i<j){
            if(o==0){
                while(a[i]%2!=1&&i<a.length){
                    i++;
                }
            }
            if(a[i]%2==1)o=1;
            if(e==0){
                while(a[j]%2!=0&&j>=0){
                    j--;
                }
            }
            if(a[j]%2==0)e=1;
            if(o==1&&e==1&&i<j){
                int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
                moves++;
                
            } 
            e=0;o=0;
        }
        return moves;

    }

	public static void main(String[] args) {
		int [] q={13,21,3,5};
		System.out.println(moves(q));

	}

}
