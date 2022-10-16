package dev.iceey.infoClass;


public class VipRoom extends StandardRoom {
	private double roomPrice = 500;
	
	
    public VipRoom() {
    	
	}

	public VipRoom(String roomNumber, int howManyDaysToStay) {
		super(roomNumber, howManyDaysToStay);
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
		return "��Դ�ͧ��ͧ = "+" VipRoom"+" | "+"�����Ţ��ͧ�ѡ = "+this.roomNumber+" | "
		+"�������ѹ = "+this.howManyDaysToStay+" | "+"�Ҥ��������ͧ���� = "+calRoomPrice();
	}
}
