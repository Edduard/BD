package agentiemodelling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Command {
	static Connection con;
	static Statement stt;
	static ResultSet res;
	static PreparedStatement prep;
	
	public static void Connect(String url, String user, String password){
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
	        con = DriverManager.getConnection(url, user, password);
		} 
		catch (Exception e){
            e.printStackTrace();
        }
	}
	
	/*
	 * Adauga Model
	 */
	
	public static void AddModel(String Nume, String Prenume, 
			String CNP, String I_tata, String Data_nastere, String Oras, int Greutate, int Inaltime,
			int Talie, int Bust, int Solduri, String Cul_par, String Cul_ochi, String Nr_tel, String Data_angajarii,
			int Salariu, String Autocaracterizare){
		try{
			
			stt = con.createStatement();
            stt.execute("USE AgentieModelling");
                        
            stt.execute("INSERT INTO Model (Nume, Prenume, CNP, "
            								+ "I_tata, Data_nastere, Oras, Greutate, Inaltime, "
            								+ "Talie, Bust, Solduri, Cul_par, Cul_ochi, Nr_tel, Data_angajarii, "
            								+ "Salariu, Autocaracterizare) VALUES"
            								+ "('" + Nume + "', '" + Prenume + "', '" + CNP
            								+ "', '" + I_tata + "', '" + Data_nastere + "', '" + Oras + "', '" + Greutate 
            								+ "', '" + Inaltime + "', '" + Talie + "', '" + Bust + "', '" + Solduri
            								+ "', '" + Cul_par + "', '" + Cul_ochi + "', '" + Nr_tel + "', '" + Data_angajarii
            								+ "', '" + Salariu + "', '" + Autocaracterizare + "')");
            
            ResultSet res = stt.executeQuery("SELECT * FROM Model WHERE Nume = 'Ion' ");
            
//            while (res.next())
//            {
//                System.out.println(res.getString("ID_model") + " " + res.getString("Nume") + " " + 
//			                		res.getString("CNP") + " " + res.getString("I_tata") + " " + 
//			                		res.getString("Data_nastere") + " " + res.getString("Oras") + " " + 
//			                		res.getString("Greutate") + " " + res.getString("Inaltime") + " " + 
//			                		res.getString("Talie") + " " + res.getString("Bust") + " " + 
//			                		res.getString("Solduri") + " " + res.getString("Cul_par") + " " + 
//			                		res.getString("Cul_ochi") + " " + res.getString("Nr_tel") + " " +
//			                		res.getString("Data_angajarii") + " " + res.getString("Salariu") + " " + 
//			                		res.getString("Autocaracterizare"));
//            }
			//prep.close();
            res.close();
            stt.close();
		}
		catch (Exception e){
            e.printStackTrace();
        }
	}
	
	/*
	 * Adauga Eveniment
	 */
	
	public static void AddEvent(String Nume_eveniment, String Data, int Editie, 
								String Locatie, String Tip, String Descriere){
		
		try{
			
			stt = con.createStatement();
            stt.execute("USE AgentieModelling");
                        
            stt.execute("INSERT INTO Evenimente (Nume, Data, Editie, "
            								+ "Locatie, Tip, Descriere) VALUES"
            								+ "('" + Nume_eveniment + "', '" + Data + "', '" + Editie
            								+ "', '" + Locatie + "', '" + Tip + "', '" + Descriere + "')");
            
            ResultSet res = stt.executeQuery("SELECT * FROM Evenimente WHERE Nume = 'X Modelling' ");
            
//            while (res.next())
//            {
//                System.out.println(res.getString("ID_eveniment") + " " + res.getString("Nume") + " " + 
//			                		res.getString("Data") + " " + res.getString("Editie") + " " + 
//			                		res.getString("Locatie") + " " + res.getString("Tip") + " " + 
//			                		res.getString("Descriere"));
//            }
            res.close();
            stt.close();
		}
		catch (Exception e){
            e.printStackTrace();
        }
		
	}
	
	/*
	 * Edit Model Interogare - Userul alege ce model sa editeze
	 */
	
	public static ResultSet EditModelInterogare(int ID_model){

		try{
			
			stt = con.createStatement();
            stt.execute("USE AgentieModelling");
            
            ResultSet res = stt.executeQuery("SELECT ID_model, Nume, Prenume, CNP, "
            								+ "I_tata, Data_nastere, Oras, Greutate, Inaltime, "
            								+ "Talie, Bust, Solduri, Cul_par, Cul_ochi, Nr_tel, Data_angajarii, "
            								+ "Salariu, Autocaracterizare "
            								+ "FROM Model WHERE ID_model = '" + ID_model + "' ");
    		return res;
		}
		catch (Exception e){
            e.printStackTrace();
        }
		finally {
		}
		return res;
	}
	
	/*
	 * Edit Model Editare - Userul editeaza modelul ales
	 */
	
	public static void EditModelEditare(int ID_model, String Nume, String Prenume, 
			String CNP, String I_tata, String Data_nastere, String Oras, int Greutate, int Inaltime,
			int Talie, int Bust, int Solduri, String Cul_par, String Cul_ochi, String Nr_tel, String Data_angajarii,
			int Salariu, String Autocaracterizare){
		
		try{
			
			stt = con.createStatement();
            stt.execute("USE AgentieModelling");
            
            stt.execute("UPDATE model" 
            		+ " SET Nume='" + Nume + "', Prenume='" + Prenume + "' , CNP='" + CNP 
					+ "', I_tata='" + I_tata + "', Data_nastere='" + Data_nastere + "', Oras='" + Oras 
					+ "', Greutate='" + Greutate + "', Inaltime= '" + Inaltime
					+ "', Talie='" + Talie + "', Bust='" + Bust + "', Solduri='" + Solduri 
					+ "', Cul_par='" + Cul_par + "', Cul_ochi='" + Cul_ochi + "', Nr_tel='" + Nr_tel 
					+ "', Data_angajarii='" + Data_angajarii + "', Salariu='" + Salariu
					+ "', Autocaracterizare='" + Autocaracterizare + "'"
					+ " WHERE ID_model = '" + ID_model + "' ");            
		}
		catch (Exception e){
            e.printStackTrace();
        }
	}
	
	/*
	 * Edit Event - Userul alege ce eveniment sa editeze
	 */
	
	public static ResultSet EditEventInterogare(int ID_eveniment){
		
		try{
			
			stt = con.createStatement();
            stt.execute("USE AgentieModelling");
         
            ResultSet res = stt.executeQuery("SELECT Nume, Data, Editie, "
					+ "Locatie, Tip, Descriere "
					+ "FROM Evenimente "
					+ "WHERE ID_eveniment = '" + ID_eveniment + "' ");
            
            return res;
		}
		catch (Exception e){
            e.printStackTrace();
        }
		finally {
		}
		return res;
	}
	
	/*
	 * Edit Event - Userul editeaza evenimentul ales
	 */
	
	public static void EditEventEditare(int ID_eveniment, String Nume_eveniment, 
                                            String Data, int Editie, String Locatie,
                                            String Tip, String Descriere){
		
		try{
			
			stt = con.createStatement();
            stt.execute("USE AgentieModelling");
         
            stt.execute("Update Evenimente"
            		+ " SET Nume='" + Nume_eveniment + "', Data='" + Data + "', Editie='" + Editie 
					+ "', Locatie='" + Locatie + "', Tip='" + Tip + "', Descriere='" + Descriere + "' "
					+ "WHERE ID_eveniment = '" + ID_eveniment + "' ");
            
		}
		catch (Exception e){
            e.printStackTrace();
        }
	}
	
	/*
	 * Delete model
	 */
	
	public static void DeleteModel(int ID_model){
		
		try{
			
			stt = con.createStatement();
            stt.execute("USE AgentieModelling");
            
            stt.execute("DELETE FROM Model " 
            		+ "WHERE ID_model = '" + ID_model + "';");           
            
		}
		catch (Exception e){
            e.printStackTrace();
        }
	}
	
	/*
	 * Delete Event
	 */
	
	public static void DeleteEvent(int ID_eveniment){
		
		try{
			
			stt = con.createStatement();
            stt.execute("USE AgentieModelling");
            
            stt.execute("DELETE FROM Evenimente " 
            		+ "WHERE ID_eveniment = '" + ID_eveniment + "';");    
            
		}
		catch (Exception e){
            e.printStackTrace();
        }
	}
        
        /*
         * Custom Command
        */
		
        public static ResultSet CustomQuery(String Command){
            try{
                	
            stt = con.createStatement();
            stt.execute("USE AgentieModelling");
            
            ResultSet res = stt.executeQuery(Command);    
            
            return res;
		}
		catch (Exception e){
                    e.printStackTrace();
                }
            finally{
            }
            return res;
        }
        
	/*
	 * Order Models By 
	 */
	
	public static void OrderModelBy(int ID_eveniment){
		
		try{
			
            stt = con.createStatement();
            stt.execute("USE AgentieModelling");
            
            stt.executeQuery("DELETE FROM Evenimente " 
            		+ "WHERE ID_eveniment = '" + ID_eveniment + "';");    
            
		}
		catch (Exception e){
            e.printStackTrace();
        }
	}
        
        /*
	 * Disconnect from the database
	 */
	
	public static void Disconnect(){
		try{
			con.close();
		}
		catch (Exception e){
            e.printStackTrace();
        }
	}
	
}

