package lagunenZerrenda;

public class Pertsona {
	 String id;
	 Pertsona[] lagunak; // 10 elementu: bere lagunak (null izan daitezke)
	 public Pertsona(String pId) {
		 id = pId;
		 lagunak = new Pertsona[10];
	 }
	 public void addLaguna(Pertsona laguna) {
		 for(int i = 0; i <lagunak.length; i++) {
			 if(lagunak[i] == null) {
				 lagunak[i] = laguna;
				 return;
			 }
		 }
	 }
	 public void inprimatuLagunak() {
		 int j = 0;
		 for(int i = 0 ; i <lagunak.length;i++) {
			 if(lagunak[i]!= null) {
				 System.out.print(lagunak[i].id + "   ");
				 j++; 
			 }
		 }
		 if(j == 0) {
			 System.out.print("Ez ditu lagunik 😭");
			 
		 }
	 }
}

