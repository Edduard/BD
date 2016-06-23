package agentiemodelling;

import java.sql.*;

public class AgentieModelling
{
    public static void main(String[] args)
    {
    	/*
    	 * Declaram toate variabilele din tabela pentru a putea adauga entitati
    	 */
    	//Tabela Model
    	int ID_model, Greutate, Inaltime, Talie, Bust, Solduri, Salariu;
    	String Nume, Prenume, CNP, I_tata, Data_nastere, Oras, Cul_par, Cul_ochi, Nr_tel, Data_angajarii, Autocaracterizare;
    	//Tabela Eveniment
    	int ID_eveniment, Editie;
    	String Nume_eveniment, Data, Locatie, Tip, Descriere;
    	//Tabela Participare
    	int ID_participare;
    	//Tabela Parteneri_evenimente
    	int ID_parteneri_evenimente;
    	String Nume_parteneriat, Tip_parteneriat;

    	
	    try{
	        String url = "jdbc:mysql://localhost:3306/";
	        String user = "root";
	        String password = "minimmaxim";   // O sa fac un frame in care utilizatorul iintroduce userul si parola
	        
	        Command.Connect(url,user,password); // verifica pe net ce returneaza functia ca sa faci un mesaj de eroare
	      
	        /* Aici variabilele alea primesc valori de la use prin interfata jframe
	        * Mai jos vom simula acest lucru 
	        */
	        Nume = "Ionnn";
	        Prenume = "Ionica";
			CNP = "1234567890123";
			I_tata = "L";
			Data_nastere = "1994-05-23";
			Oras = "Bucuresti";
			Greutate = 77;
			Inaltime = 170;
			Talie = 90;
			Bust = 60;
			Solduri = 90;
			Cul_par = "Saten";
			Cul_ochi = "Caprui";
			Nr_tel = "0876543234";
			Data_angajarii = "2009-03-22";
			Salariu = 1500;
			Autocaracterizare = "Eu sunt ION!";
			
			Nume_eveniment = "X Modelling";
			Data = "2014-03-03";
			Editie = 4;
			Locatie = "Pitesti";
			Tip = "Recrutare";
			Descriere = "X Modells recruteaza fotomodele!";
                //
                MainForm form= new MainForm();
                form.setVisible(true);
                
                //
	        //Command.AddModel(Nume, Prenume, CNP, I_tata, Data_nastere, Oras, Greutate, Inaltime, 
	        //		Talie, Bust, Solduri, Cul_par, Cul_ochi, Nr_tel, Data_angajarii, Salariu, Autocaracterizare);
	        
			
                //
	        //Command.AddEvent(Nume_eveniment, Data, Editie, Locatie, Tip, Descriere);
	        //
			
			//
	        //ID_model = 1;
	        //ID_eveniment = 1;
	        //ResultSet rezultatInterogareEditare = Command.EditModelInterogare(ID_model)	;	
	        
	        /*	
	        // Testare concept result test
	        //
	        while (rezultatInterogareEditare.next())
            {
		        System.out.println(rezultatInterogareEditare.getString("ID_model") + " " + rezultatInterogareEditare.getString("Nume") + " " + 
		        		rezultatInterogareEditare.getString("CNP") + " " + rezultatInterogareEditare.getString("I_tata") + " " + 
		        		rezultatInterogareEditare.getString("Data_nastere") + " " + rezultatInterogareEditare.getString("Oras") + " " + 
		        		rezultatInterogareEditare.getString("Greutate") + " " + rezultatInterogareEditare.getString("Inaltime") + " " + 
		        		rezultatInterogareEditare.getString("Talie") + " " + rezultatInterogareEditare.getString("Bust") + " " + 
		        		rezultatInterogareEditare.getString("Solduri") + " " + rezultatInterogareEditare.getString("Cul_par") + " " + 
		        		rezultatInterogareEditare.getString("Cul_ochi") + " " + rezultatInterogareEditare.getString("Nr_tel") + " " +
		        		rezultatInterogareEditare.getString("Data_angajarii") + " " + rezultatInterogareEditare.getString("Salariu") + " " + 
		        		rezultatInterogareEditare.getString("Autocaracterizare"));
            }
	        // Afisarea result test-ului functioneaza!
	        */
	   
	        //
	        //Command.EditModelEditare(ID_model, Nume, Prenume, CNP, I_tata, Data_nastere, Oras, Greutate, Inaltime, 
	        //		Talie, Bust, Solduri, Cul_par, Cul_ochi, Nr_tel, Data_angajarii, Salariu, Autocaracterizare);
	        //
	        
	        //
	        //Command.DeleteModel(ID_model);
	        //
	        
	        //
	        //Command.DeleteEvent(ID_eveniment);
	        //

	        //
	        //Command.Disconnect();
	        //

	    }
	    catch (Exception e)
	    {
	    	e.printStackTrace();
	    }
    }
}