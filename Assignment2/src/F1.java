

abstract class F1info {
    public void getInformation() {
    }
}

class Info extends F1info {
	
	void getList() { 
		System.out.println("=========================================================");
		System.out.println("                  List of Information                    ");
		System.out.println("=========================================================");
		System.out.println("NAME               ORIGIN       TEAM          POINTS");
		System.out.println("1.Lewis Hamilton   England      Mercedes      347");
		System.out.println("2.Valtteri Bottas  Poland       Mercedes      223");
		System.out.println("3.Max Verstappen   Netherlands  Red Bull      214");
		System.out.println("4.Sergio Pérez     Mexico       Racing Point  125");
		System.out.println("5.Daniel Ricciardo Australia    Renault       119");
		System.out.println("6.Carlos Sainz     Spain        McLaren       105");
		System.out.println("7.Alexander Albon  Thailand     Red Bull      105");
		System.out.println("8.Charles Leclerc  Monaco       Ferrari       98");
		System.out.println("9.Lando Norris     England      McLaren       97");
		System.out.println("10.Pierre Gasly    French       Scuderia      75");	
		System.out.println("=========================================================");
		System.out.println();
	}
}

class Brazil extends F1info {
    String Result;

    Brazil(String x) {
        this.Result = x;
    }
    void getScore(){
        System.out.println("======================= Result ==========================");
    	System.out.println("Place   : São Paulo, Brazil");
    	System.out.println("Circuit : José Carlos Pace");
    	System.out.println("Time    : 01 December 2020");
        System.out.println("----------------------- Winner --------------------------");
        System.out.println("first   : Lewis Hamilton         01:42:09");
        System.out.println("second  : Carlos Sainz           01:43:16");
        System.out.println("third   : Daniel Ricciardo       01:45:33");
        System.out.println("=========================================================");
    }
}

class Singapore extends F1info { 
	String Day, Month, place, Year, circuit, position, lap;
	  
		Singapore() {
	        this.place = "Singapore";
	        this.circuit = "Marina Bay";
		}

		Singapore(String d, String m, String y) {
	        this.Day = d;
	        this.Month = m;
	        this.Year = y;        
		}
		
		Singapore(String l, String p) {
			this.lap = l;
			this.position = p;
		}
}

class Italia extends F1info { 
	String Day, Month, place, Year, circuit, Link;
	  
		Italia() {
			this.place = "Milan, italia";
	        this.circuit = "Autodromo";
	        this.Link = "https://www.F1.com/buyticket/";
		}

		Italia(String d, String m, String y) {
	        this.Day = d;
	        this.Month = m;
	        this.Year = y;        
		}
}

public class F1{
    public static void main(String[] args){

    	//list of the drivers
    	Info obj8 = new Info();
    	obj8.getList();
    	
    	//Brazil
    	Brazil obj = new Brazil("Result");
        obj.getScore();
    	
    	//Singapore
        Singapore obj1 = new Singapore();
        Singapore obj2 = new Singapore();
        Singapore obj3 = new Singapore("13","December","2020");
        Singapore obj4 = new Singapore("Lap (54/78)","\n1. Sebastian Vettel \n2. Lewis Hamilton \n3. Daniel Ricciardo \n4. Charles Leclerc \n5. Max Verstappen \n6. Valtteri Bottas \n7. Sergio Perez \n8. Romain Grosjean \n9. Kimi Raikkonen \n10. Carlos Sainz");

        System.out.println("====================== Live Match =======================");
        System.out.println("Place   : " + obj1.place );
        System.out.println("Circuit : " + obj2.circuit);
        System.out.println("Time    : " + obj3.Day + " " + obj3.Month + " " + obj3.Year);
        System.out.println("--------------------- Live Position ----------------------");
        System.out.println(obj4.lap + obj4.position);
        System.out.println("========================================================= \n");
        
        //italia
        Italia obj5 = new Italia();
        Italia obj6 = new Italia();
        Italia obj7 = new Italia("25","December","2020");
        
        System.out.println("====================== Next Match =======================");
        System.out.println("Place   : " + obj5.place);
        System.out.println("Circuit : " + obj6.circuit);
        System.out.println("Time    : " + obj7.Day + " " + obj7.Month + " " + obj7.Year);
        System.out.println("Link Ticket : " + obj5.Link);
        System.out.println("========================================================= \n");
    }
}