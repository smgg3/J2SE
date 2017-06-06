package com.bluewolf;

public class Sort {

	static int[] meanderingArray(int[] unsorted) {
        for(int i=1;i<unsorted.length;){
            
            int j=i,min=i-1,max=i-1;
            while(j<unsorted.length){
                if(unsorted[min]>unsorted[j]){
                    min=j;
                }
                if(unsorted[max]<unsorted[j]){
                    max=j;
                }
                j++;
            }
            int temp=unsorted[i];
            unsorted[i]=unsorted[min];
            unsorted[min]=temp;
            temp=unsorted[i-1];
            unsorted[i-1]=unsorted[max];
            unsorted[max]=temp;
            i=i+2;
        }
        for(int i=0;i<12;i++){
        	System.out.println(unsorted[i]);
        }
    return unsorted;

    }

	public static void main(String[] args) {
		int[] unsorted={904304,
				-927571,
				860511,
				-825806,
				732004,
				-721722,
				536428,
				-292822,
				211621,
				-287004,
				161270,
				-27676};
		meanderingArray(unsorted);

	}
	
	
}
