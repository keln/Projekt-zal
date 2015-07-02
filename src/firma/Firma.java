package firma;


	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;


	import packageModel.Klient;
import packageModel.Usl;
import packageModel.Uslugi;
	 
	public class Firma {
	 
	    public static final String DRIVER = "org.sqlite.JDBC";
	    public static final String DB_URL = "jdbc:sqlite:C:/Users/KONRAD/Desktop/Nowy folder/Nowy folder (2)/sqlite-shell-win32-x86-3081002/firma.db";
	 
	    private Connection conn;
	    private Statement stat;
	 
	    public Firma() {
	        try {
	            Class.forName(Firma.DRIVER);
	        } catch (ClassNotFoundException e) {
	            System.err.println("Brak sterownika JDBC");
	            e.printStackTrace();
	        }
	 
	        try {
	            conn = DriverManager.getConnection(DB_URL);
	            stat = conn.createStatement();
	        } catch (SQLException e) {
	            System.err.println("Problem z otwarciem polaczenia");
	            e.printStackTrace();
	        }
	 
	        createTables();
	    }
	 
	    public boolean createTables()  {
	        String createKlienci = "CREATE TABLE IF NOT EXISTS klienci (id_Klienta INTEGER PRIMARY KEY AUTOINCREMENT, imie varchar(255), nazwisko varchar(255), pesel int)";
	        String createUsl = "CREATE TABLE IF NOT EXISTS Usl (id_Usl INTEGER PRIMARY KEY AUTOINCREMENT, nazwa varchar(255))";
	        String createUslugi = "CREATE TABLE IF NOT EXISTS Uslugi (id_Uslugi INTEGER PRIMARY KEY AUTOINCREMENT, cena int,data varchar(255), miejscowosc varchar(255))";
	        try {																				
	            stat.execute(createKlienci);
	            stat.execute(createUsl);
	            stat.execute(createUslugi);
	        } catch (SQLException e) {
	            System.err.println("Blad przy tworzeniu tabeli");
	            e.printStackTrace();
	            return false;
	        }
	        return true;
	    }
	 
	    public boolean insertKlient(String imie, String nazwisko, String pesel) {
	        try {
	            PreparedStatement prepStmt = conn.prepareStatement(
	                    "insert into klienci values (NULL, ?, ?, ?);");
	            prepStmt.setString(1, imie);
	            prepStmt.setString(2, nazwisko);
	            prepStmt.setString(3, pesel);
	            prepStmt.execute();
	        } catch (SQLException e) {
	            System.err.println("Blad przy wstawianiu Klienta");
	            e.printStackTrace();
	            return false;
	        }
	        return true;
	    }
	 
	    public boolean insertUsl(String nazwa) {
	        try {
	            PreparedStatement prepStmt = conn.prepareStatement(
	                    "insert into Usl values (NULL, ?);");
	            prepStmt.setString(1, nazwa);
	            
	            prepStmt.execute();
	        } catch (SQLException e) {
	            System.err.println("Blad przy wypozyczaniu");
	            return false;
	        }
	        return true;
	    }
	 
	    public boolean insertUslugi(String cena, String data, String miejscowosc) {
	        try {
	            PreparedStatement prepStmt = conn.prepareStatement(
	                    "insert into Uslugi values (NULL,?,?,?);");
	            
	            
	      
	            //prepStmt.setInt(1, id);
	          //  prepStmt.setInt(2, idUsl);
	            prepStmt.setString(1, cena);
	            prepStmt.setString(2, data);
	            prepStmt.setString(3, miejscowosc);
	            prepStmt.execute();
	        } catch (SQLException e) {
	            System.err.println("Blad przy wypozyczaniu");
	            return false;
	        }
	        return true;
	    }
	 
	    public List<Klient> selectKlienci() {
	        List<Klient> klienci = new LinkedList<Klient>();
	        try {
	            ResultSet result = stat.executeQuery("SELECT * FROM klienci");
	            int id;
	            String imie, nazwisko, pesel;
	            while(result.next()) {
	                id = result.getInt("id_Klienta");
	                imie = result.getString("imie");
	                nazwisko = result.getString("nazwisko");
	                pesel = result.getString("pesel");
	                klienci.add(new Klient(id, imie, nazwisko, pesel));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return null;
	        }
	        return klienci;
	    }
	 
	    public List<Usl> selectUsl() {
	        List<Usl> Usl = new LinkedList<Usl>();
	        try {
	            ResultSet result = stat.executeQuery("SELECT * FROM Usl");
	            //int id;
	            String nazwa;
	            while(result.next()) {
	                
	                nazwa = result.getString("nazwa");
	                Usl.add(new Usl(nazwa));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return null;
	        }
	        return Usl;
	    }
	    public List<Uslugi> selectUslugi() {
	        List<Uslugi> Uslugi = new LinkedList<Uslugi>();
	        try {
	            ResultSet result = stat.executeQuery("SELECT * FROM Uslugi");
	            //int id;
	            int cena;
				String data,miejscowosc;
	            while(result.next()) {
	                
	                cena = result.getInt("cena");
	                data = result.getString("data");
	                miejscowosc = result.getString("miejscowosc");
	                Uslugi.add(new Uslugi(cena,data,miejscowosc));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return null;
	        }
	        return Uslugi;
	    }
	 
	    public void closeConnection() {
	        try {
	            conn.close();
	        } catch (SQLException e) {
	            System.err.println("Problem z zamknieciem polaczenia");
	            e.printStackTrace();
	        }
	    }
	}