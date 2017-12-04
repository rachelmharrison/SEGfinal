public class ParisMetro
{
	String[][] station=new String[376];
	AdjacencyMapGraph graph;
	public static void main (String[] args)
	{

	}

	public static void readMetro(String filename)
	{
		graph=new AdjacencyMapGraph(true);
		StringTokenizer st;
		BuffferedReader in=new BuffferedReader(new FileReader("metro.txt"));
		String ve=in.readLine();

		for(int i=0; i<375; i++)
		{

			st=new StringTokenizer(in.readLine());
			st.nextToken();
			station[i]=st.nextToken().trim();
		}

		in.readLine();//$

		Hashtable<String, Vertex> vertices = new Hashtable<String, Vertex>();

		String line;
		while ((line = in.readLine()) != null) {
			Sst = new StringTokenizer(line);
			if (st.countTokens() != 3)
				throw new IOException("Incorrect input file at line " + line);
			String source = st.nextToken();
			String dest = st.nextToken();
			Integer weight = new Integer(st.nextToken());
			
			Vertex<String> sv = vertices.get(source);
			if (sv == null) {
				// Source vertex not in graph -- insert
				sv = graph.insertVertex(source);
				vertices.put(source, sv);
			}
			Vertex<String> dv = vertices.get(dest);
			if (dv == null) {
				// Destination vertex not in graph -- insert
				dv = graph.insertVertex(dest);
				vertices.put(dest, dv);
			}
			// check if edge is already in graph
			if (graph.getEdge(sv, dv) == null) {
				// edge not in graph -- add
				//e's element is now the distance between the vertices
				//Modified by Thais Bardini on November 19th, 2017 (tbard069@uottawa.ca)
				Edge<Integer> e = graph.insertEdge(sv, dv, weight);
			}
		}

		System.out.println(graph.toString());


	}


}