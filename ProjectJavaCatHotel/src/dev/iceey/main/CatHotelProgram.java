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
			System.out.print("\n"+"<<หน้าหลัก>>"+"\n");
			System.out.print("\n"+"กรุณาเลือกสิ่งที่ต้องการจะแก้ไขตามตัวเลือกดังต่อไปนี้" + "\n"+"\n" +"1.เช็คสถานะห้องพักและข้อมูลอื่นๆ"+" | "+"2.แก้ไขข้อมูลของห้องพักและอื่นๆ"+"\n"
					+"3.เพิ่มข้อมูลการเข้าพัก"+" | "+"4.ลบข้อมูลการเข้าพัก"+" | "+"0.ออกจากการทำงาน"+"\n"+"= ");
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
				System.out.print("\n"+"<<ระบบได้ออกจากการทำงานของโปรแกรมเรียบร้อยแล้ว>>");
				break;
			}else 
			{
				System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" | "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
				continue;
			}
			
			
		}

	}

}
