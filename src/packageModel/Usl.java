package packageModel;

public class Usl {
	    private int id;
	    private String nazwa;
	    
	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getNazwa() {
	        return nazwa;
	    }
	    public void setNazwa(String nazwa) {
	        this.nazwa = nazwa;
	    }

	 
	    public Usl() {}
	    public Usl( String nazwa) {
	        //this.id = id;
	        this.nazwa = nazwa;
	    }
	    public String toString() {
	        return "-"+nazwa+"-";
	    }
}