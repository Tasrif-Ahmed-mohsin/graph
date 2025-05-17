import java.util.ArrayList;

public class classroom {
  static  class edge{

      int src;
      int dest;
 edge(int s, int d){
     this.src = s;
     this.dest = d;
 }
  }

public static void creategraph(ArrayList<edge> graph[]){

       for(int i=0;i<graph.length;i++){
           graph[i]=new ArrayList<edge>();
       }
graph[0].add(new edge(0,2));
       graph[1].add(new edge(1,2));
    graph[1].add(new edge(1,3));
    graph[2].add(new edge(2,0));
       graph[2].add(new edge(2,1));
    graph[2].add(new edge(2,3));
       graph[3].add(new edge(3,1));
    graph[3].add(new edge(3,2));
}
    public static void main(String[] args) {

int v=4;
ArrayList<edge> graph[]=new ArrayList[v];
creategraph(graph);


for(int i=0;i<graph.length;i++){
    for(int j=0;j<graph[i].size();j++){
        System.out.print(graph[i].get(j).src+"-"+graph[i].get(j).dest+"");
        System.out.printf("||");
    }
    System.out.println();
}


    }
}
