package dev.iceey.infoClass;

public class StandardRoom {
	
	protected String roomNumber;
	protected int howManyDaysToStay;
	private double roomPrice = 200;

	
    public StandardRoom() {

	}

	public StandardRoom(String roomNumber, int howManyDaysToStay) {
		this.roomNumber = roomNumber;
		this.howManyDaysToStay = howManyDaysToStay;
	}

	public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setHowManyDaysToStay(int howManyDaysToStay) {
        this.howManyDaysToStay = howManyDaysToStay;
    }

    public int getHowManyDaysToStay() {
        return howManyDaysToStay;
    }
    
    
    public double calRoomPrice()
    {
    	double calTotal = this.howManyDaysToStay*this.roomPrice;
    	return calTotal;
    }


	public String toString() {
		return "ชนิดของห้อง = "+" StandardRoom"+" | "+"หมายเลขห้องพัก = "+this.roomNumber+" | "
		+"อยู่กี่วัน = "+this.howManyDaysToStay+" | "+"ราคารวมที่ต้องชำระ = "+calRoomPrice();
	}
}
