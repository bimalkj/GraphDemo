package mypack;

import java.util.*;

public class Graph {
		int novert;
		LinkedList<Integer> va[];

	
	public Graph(int novert) {
		this.novert=novert;
		va=new LinkedList[novert];
		for (int i = 0; i < novert; i++) {
			va[i]=new LinkedList<Integer>();
		}
	}
	
	void addEdge(int o,int d) {
		va[o].add(d);
	}

	void compute() {
		int n[]= {23,45,12,1,10,45};
		int min=n[0];int sum=0;
		for (int i = 0; i < n.length; i++) {
			if ((n[i]%2==0) && (min>n[i])) 
				{ min=n[i];sum+=min; }	
		}
		System.out.println(sum);
	}
	
	void BFT(int v) {
		boolean[] visited=new boolean[novert];
		LinkedList<Integer> tl=new LinkedList<Integer>();
		tl.add(v);
		visited[v]=true;
		
		while(!tl.isEmpty()) {
			int n=tl.poll();
			System.out.print(n+" ");
			
			Iterator<Integer> i=va[n].iterator();
			while(i.hasNext()) {
				int c=i.next();
				if(!visited[c]) {
					visited[c]=true;
					tl.add(c);
				}
			}
		}
	}
	
	void DFTUtil(int v, boolean visited[])
    {
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = va[v].iterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFTUtil(n, visited);
        }
    }
   
    void DFT(int v)
    {
       
        boolean visited[] = new boolean[novert];
        DFTUtil(v, visited);
    }
	
	void disp(int v) {
		Iterator<Integer> i=va[v].iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
