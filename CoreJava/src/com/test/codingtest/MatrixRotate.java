package com.test.codingtest;

public class MatrixRotate {
	
	public static void rotateClockwise(int[][] m){
		
		if((m.length==0)||(m[0].length!=m.length)) return;
		int n=m.length;
		for(int layer=0;layer<n/2;layer++){
			int first=layer;
			int last=n-1-layer;
			for(int i=first;i<last;i++){
				int offset=i-first;
				int top=m[first][i];	//save top
				//left to top
				m[first][i]=m[last-offset][first];
				//bottom to left
				m[last-offset][first]=m[last][last-offset];
				//right to bottom
				m[last][last-offset]=m[i][last];
				//top to right
				m[i][last]=top;
			}
		}
	}
	public static void rotateAnticlockwise(int[][] m){
		if(m.length==0|| (m.length!=m[0].length)) return;
		int n=m.length;
		for(int layer=0;layer<n/2;layer++){
			int first=layer;
			int last=n-1-layer;
			for(int i=first;i<last;i++){
				int offset=i-first;
				int bottom=m[last][i];	//save bottom
				//left to bottom
				m[last][i]=m[i][first];
				//top to left
				m[i][first]=m[first][last-offset];
				//right to top
				m[first][last-offset]=m[last-offset][last];
				//bottom to right
				m[last-offset][last]=bottom;
				
			}
		}
	}
	public static void main(String[] args) {
		int[][] a={{1,2,3},{4,5,6},{7,8,9}};
		int rotate=1;
		if(rotate==-1){
			rotateClockwise(a);
			}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
		if(rotate==1)
		{
			rotateAnticlockwise(a);
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}

}
