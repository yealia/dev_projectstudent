package main.java.com.example.medic.model.dto;

public class Medic {
    private int phaNo;
    private String phaName;
    private String phaType;
    private int phaPrice;
    private int phaStock;

    
    
    
    
    public Medic(int phaNo, String phaName, String phaType, int phaPrice, int phaStock) {
        this.phaNo = phaNo;
        this.phaName = phaName;
        this.phaType = phaType;
        this.phaPrice = phaPrice;
        this.phaStock = phaStock;
    }
    public Medic(String phaName , int phaStock) {
    	this.phaName =phaName;
    	this.phaStock = phaStock;
	}

    public Medic() {
		super();
	}

	@Override
    public String toString() {
        return "Medic{" +
                "phaNo=" + phaNo +
                ", phaName='" + phaName + '\'' +
                ", phaType='" + phaType + '\'' +
                ", phaPrice=" + phaPrice +
                ", phaStock=" + phaStock +
                '}';
    }

	public int getPhaNo() {
		return phaNo;
	}

	public void setPhaNo(int phaNo) {
		this.phaNo = phaNo;
	}

	public String getPhaName() {
		return phaName;
	}

	public void setPhaName(String phaName) {
		this.phaName = phaName;
	}

	public String getPhaType() {
		return phaType;
	}

	public void setPhaType(String phaType) {
		this.phaType = phaType;
	}

	public int getPhaPrice() {
		return phaPrice;
	}

	public void setPhaPrice(int phaPrice) {
		this.phaPrice = phaPrice;
	}

	public int getPhaStock() {
		return phaStock;
	}

	public void setPhaStock(int phaStock) {
		this.phaStock = phaStock;
	}


}
