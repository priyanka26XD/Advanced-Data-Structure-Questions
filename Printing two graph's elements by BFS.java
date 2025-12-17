
import java.util.*;

class bfs{
    public static void main(String[] args){
        int[][] edges={{0,1},{0,2},{1,2},{2,3},{4,5},{4,6}};
        int V=7;
        int e=6;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>(V);
        for(int i=0;i<7;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        System.out.println(adj);

        boolean[] isVisited=new boolean[7];
    
        for(int i=0;i<7;i++){
            if(!isVisited[i]){
                bfs(i,adj,isVisited);
            }
        }
    }
    public static void bfs(int start,ArrayList<ArrayList<Integer>> adj, boolean[] isVisited){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(start);
        isVisited[start]=true;
        while(!queue.isEmpty()){
            int x=queue.poll();
            System.out.print(x+" ");
            for(int num:adj.get(x)){
                if(!isVisited[num]){
                    queue.add(num);
                    isVisited[num]=true;
                }
            }
        }
    }
}
