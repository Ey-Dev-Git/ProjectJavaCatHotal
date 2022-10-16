package dev.iceey.infoClass;

public class OwnerInformation {

    private String fullName;
    private String age;
    private String contactNumber;
    private String address;
    private String idCard;

    public OwnerInformation() {

    }

    public OwnerInformation(String fullName, String age, String contactNumber, String address, String idCard) {
        this.fullName = fullName;
        this.age = age;
        this.contactNumber = contactNumber;
        this.address = address;
        this.idCard = idCard;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public String toString() {
        return "ชื่อเจ้าของห้อง = "+this.fullName+" | "+"อายุของเจ้าของห้อง = "+this.age+" | "+"เบอร์ติดต่อของเจ้าของห้อง = "+this.contactNumber
        		+" | "+"ที่อยู่ของเจ้าของห้อง = "+this.address+" | "+"เลขบัตรประชาชน = "+this.idCard;
    }
}
