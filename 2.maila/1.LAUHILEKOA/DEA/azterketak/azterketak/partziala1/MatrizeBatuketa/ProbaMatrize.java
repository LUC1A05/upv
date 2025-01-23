package MatrizeBatuketa;

public class ProbaMatrize {
	public static void main(String[]args) {
		Node n1,n2,n3,n4,n5,n6,n7,n8;
		Matrize m1,m2;
		
		n1 = new Node(1,1,2);
		n2 = new Node(1,2,3);
		n3 = new Node(2,1,5);
		n4 = new Node(3,2,3);
		n5 = new Node(1,1,4);
		n6 = new Node(2,2,2);
		n7 = new Node(3,1,5);
		n8 = new Node(3,2,1);
		
		m1 = new Matrize();
		m1.addNode(n1);
		m1.addNode(n2);
		m1.addNode(n3);
		m1.addNode(n4);
		m1.inprimatuMat();
		System.out.println();
		
		m2 = new Matrize();
		m2.addNode(n5);
		m2.addNode(n6);
		m2.addNode(n7);
		m2.addNode(n8);
		m2.inprimatuMat();
		System.out.println();
		
		Matrize m3 = new Matrize();
		Matrize m4 = m3.batura(m1, m2);
		m4.inprimatuMat();
	}

}
