package dev.iceey.infoClass;

import dev.iceey.infoClass.OwnerInformation;

public class CatInformation {
	private String catName;
    private String catAge;
    private double weight;
    private String breed;
    private String furColor;
    private String congenitalDisease;
    private String catVaccineBook;
    private OwnerInformation owner;
    
    public CatInformation() {

    }

    public CatInformation(String catName, String catAge, double weight, String breed, String furColor,
            String congenitalDisease,String catVaccineBook,OwnerInformation owner) {
        this.catName = catName;
        this.catAge = catAge;
        this.weight = weight;
        this.breed = breed;
        this.furColor = furColor;
        this.congenitalDisease = congenitalDisease;
        this.catVaccineBook = catVaccineBook;
        this.owner = owner;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatAge(String catAge) {
        this.catAge = catAge;
    }

    public String getCatAge() {
        return catAge;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setCongenitalDisease(String congenitalDisease) {
        this.congenitalDisease = congenitalDisease;
    }
    
    public void setCatVaccineBook(String catVaccineBook) {
        this.catVaccineBook = catVaccineBook;
    }

    public String getCatVaccineBook() {
        return catVaccineBook;
    }

    public String getCongenitalDisease() {
        return congenitalDisease;
    }

    public String toString() {
        return "����������ͧ = "+this.catName+" | "+"����������ͧ = "+this.catAge+" | "+"���˹ѡ������ͧ = "+this.weight
        		+" | "+"��¾ѹ���ͧ������ͧ = "+this.breed+" | "+"�բ��ͧ������ͧ = "+this.furColor+"\n"
        		+"�ä��Шӵ�Ǣͧ��� = "+this.congenitalDisease+" | "+"������˹ѧ����Ѥ�չ�ͧ������ͧ = "+this.catVaccineBook
        		+" | "+"��Ңͧ��Ǥ�ͤس = "+this.owner.getFullName();
    }
}
