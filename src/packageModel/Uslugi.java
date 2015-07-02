package packageModel;

public class Uslugi {
    private int idUsl;
    private int idKlienta;
    private int ileGodzin;
    private int cena;
    private String miejscowosc;
    private String data;
    
 
    public int getIdUsl() {
        return idUsl;
    }
    public void setIdUsl(int idUsl) {
        this.idUsl = idUsl;
    }
    public int getIdKlient() {
        return idKlienta;
    }
    public void setIdKlient(int idKlienta) {
        this.idKlienta = idKlienta;
    }
 
    public Uslugi() {}
    public Uslugi(/*int ileGodzin,*/int cena,String miejscowosc,String data) {
        //this.idUsl = idUsl;
       // this.idKlienta = idKlienta;
       // this.ileGodzin = ileGodzin;
        this.cena=cena;
        this.miejscowosc=miejscowosc;
        this.data=data;
 
    }
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getMiejscowosc() {
		return miejscowosc;
	}
	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}
	public int getIleGodzin() {
		return ileGodzin;
	}
	public void setIleGodzin(int ileGodzin) {
		this.ileGodzin = ileGodzin;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
    public String toString() {
        return ""+cena+" - "+data+" - "+miejscowosc+"";
    }
}