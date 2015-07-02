package packageModel;

public class Klient {
    private int id;
    private String imie;
    private String nazwisko;
    private String pesel;
 
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getPesel() {
        return pesel;
    }
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
 
    public Klient() { }
    public Klient(int id, String imie, String nazwisko, String pesel) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }
 
    @Override
    public String toString() {
        return ""+id+" - "+imie+" "+nazwisko+" - "+pesel+" ";
    }
	public void add(Klient klient) {
		// TODO Auto-generated method stub
		
	}
}