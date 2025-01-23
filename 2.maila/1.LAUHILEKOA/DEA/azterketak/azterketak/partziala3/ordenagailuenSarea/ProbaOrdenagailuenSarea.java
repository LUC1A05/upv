package ordenagailuenSarea;

public class ProbaOrdenagailuenSarea {

	public static void main(String[] args) {
		Boolean[][]adjMatrix = new Boolean[3][3];
		adjMatrix[0][1] = true;
		adjMatrix[0][0] = false;
		adjMatrix[0][2] = true;
		adjMatrix[1][2] = true;
		adjMatrix[1][0] = false;
		adjMatrix[1][1] = false;
		adjMatrix[2][1] = true;
		adjMatrix[2][0] = false;
		adjMatrix[2][2] = false;
		OrdenagailuenSarea os = new OrdenagailuenSarea(adjMatrix);
		os.kostuakLortu();
		os.inprimagailua();
	}

}
