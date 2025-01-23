package lagunenZerrenda;

public class Lista {
	 Adabegi first;
	 public Lista() {
		 this.first = null;
	 }
	 public void addPertsona(Pertsona p) {
		 Adabegi lag = first;
		 Adabegi berria = new Adabegi(p);
		 if(first == null) {
			 first = berria;
		 }
		 else {
			 while(lag.next != null) {
				 lag = lag.next;
			 }
			 lag.next = berria; 
		 }
	 }
	 public void ezabatu(String pId){
	 // Aurrebaldintza: “id” listako elementu bati dagokio
	 // Postbaldintza: “id” balioari dagokion elementua zerrendatik kendu da.
	 // Ezabatu dira (null balioa esleituz) “id” elementuari
	 // zegozkion loturak
		 if (first == null) return;
		 Adabegi lag = first;
		 Adabegi aurrekoa = null;
		 Pertsona[]lagunZ;
		 while(lag != null) {
			 if(lag.info.id.equals(pId)) {
				 if(lag == first) {
					 lagunZ = lag.info.lagunak;
					 first = lag.next;
				 }
				 else {
					 lagunZ = lag.info.lagunak;
					 aurrekoa.next = lag.next;
				 }
				 for(Pertsona laguna:lagunZ) {
					 if(laguna != null) {
						 for(int i= 0; i< laguna.lagunak.length;i++) {
							 if(laguna.lagunak[i] != null) {
								 if(laguna.lagunak[i].id.equals(pId)) {
									 laguna.lagunak[i] = null;
									 break;
								 } 
							 }
						 }
					 }
				 } 
				 return;
			 }
			 aurrekoa = lag;
			 lag = lag.next;
		 }
	}
	 public void inprimatu() {
		 Adabegi lag = first;
		 while(lag != null) {
			 System.out.print("\n"+lag.info.id+"-->");
			 lag.info.inprimatuLagunak();
			 lag = lag.next;
		 }
		 
	 }
}

