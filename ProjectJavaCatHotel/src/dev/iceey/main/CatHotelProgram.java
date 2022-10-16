package dev.iceey.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import dev.iceey.function.ShowData;
import dev.iceey.function.EditData;

public class CatHotelProgram {

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		HashMap<String, ArrayList<Object>> catHotal = new HashMap<String, ArrayList<Object>>();
		ArrayList<String> mandatoryNumberRoom = new ArrayList<String>();
		ArrayList<String> numberVipRoom = new ArrayList<String>();
		ArrayList<String> numberStandardRoom = new ArrayList<String>();
		
		for(int numberOfRooms = 1 ; numberOfRooms <= 20;numberOfRooms++ ) 
		{
			String roomnumber = "";
			if(numberOfRooms <= 9) 
			{
				roomnumber = roomnumber+"0"+numberOfRooms;
				catHotal.put(roomnumber, new ArrayList<Object>());
				mandatoryNumberRoom.add(roomnumber);
				numberVipRoom.add(roomnumber);
			}else if (numberOfRooms <= 20) 
			{
				if(numberOfRooms == 10)
				{
					roomnumber = roomnumber+numberOfRooms;
					catHotal.put(roomnumber, new ArrayList<Object>());
					mandatoryNumberRoom.add(roomnumber);
					numberVipRoom.add(roomnumber);
				}else 
				{
					roomnumber = roomnumber+numberOfRooms;
					catHotal.put(roomnumber, new ArrayList<Object>());
					mandatoryNumberRoom.add(roomnumber);
					numberStandardRoom.add(roomnumber);
				}
			}
		}
		
		
		while(true) 
		{
			
			ShowData.lineEnd();
			System.out.print("\n"+"<<CATHOTELRU>>");
			System.out.print("\n"+"<<˹����ѡ>>"+"\n");
			System.out.print("\n"+"��س����͡��觷���ͧ��è���䢵��������͡�ѧ���仹��" + "\n"+"\n" +"1.��ʶҹ���ͧ�ѡ��Т���������"+" | "+"2.��䢢����Ţͧ��ͧ�ѡ�������"+"\n"
					+"3.���������š����Ҿѡ"+" | "+"4.ź�����š����Ҿѡ"+" | "+"0.�͡�ҡ��÷ӧҹ"+"\n"+"= ");
			String mainKey = kb.next();
			
			if (mainKey.equals("1")) 
			{
				ShowData.lineEnd();
				ShowData.showDataInof(catHotal, numberVipRoom, numberStandardRoom,mandatoryNumberRoom);
				continue;
			}else if (mainKey.equals("2")) 
			{
				ShowData.lineEnd();
				EditData.editDataSimple(catHotal,mandatoryNumberRoom);
				continue;
			}else if (mainKey.equals("3")) 
			{
				ShowData.lineEnd();
				EditData.addData(catHotal, numberVipRoom, numberStandardRoom,mandatoryNumberRoom);
				continue;
			}else if (mainKey.equals("4")) 
			{
				ShowData.lineEnd();
				EditData.clearData(catHotal,mandatoryNumberRoom);
				continue;
			}else if (mainKey.equals("0")) 
			{
				System.out.print("\n"+"<<�к����͡�ҡ��÷ӧҹ�ͧ��������º��������>>");
				break;
			}else 
			{
				System.out.println("\n"+"�س��͡������͡�Դ!!"+" | "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
				continue;
			}
			
			
		}

	}

}
