package dev.iceey.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class ShowData {

	public static void lineEnd() {
		System.out.println("\n"+("----------------------------------------------------------------------------------"+"\n"));
	}
	
	public static void shomeDataRoomEmpty(HashMap<String, ArrayList<Object>> dict) 
	{
		lineEnd();
		System.out.println("<<หมายเลขห้องที่ยังว่างอยู่>>"+"\n");
		
		

		for(int numberOfRooms = 1 ; numberOfRooms <= dict.size();numberOfRooms++ ) 
		{
			String roomnumber = "";
			if(numberOfRooms<=9) 
			{
				roomnumber = "0"+numberOfRooms;
				if(numberOfRooms == 1) 
				{
					System.out.print("\n"+"ห้องVipRoom"+"\n"+"\n"+"ห้องหมายเลข : ");
				}
				
				if(dict.get(roomnumber).size() == 0)
				{
					System.out.print(roomnumber+",");
					
				}

			}else if(numberOfRooms<=20)
			{
				if(numberOfRooms == 11) 
				{
					System.out.print("\n"+"\n"+"ห้องStandardRoom"+"\n"+"\n"+"ห้องหมายเลข : ");
				}
				if(numberOfRooms == 10)
				{
					roomnumber = roomnumber+numberOfRooms;
					if(dict.get(roomnumber).size() == 0)
					{
						System.out.println(roomnumber);
					}
				}
				else 
				{
					roomnumber = roomnumber+numberOfRooms;
					if(dict.get(roomnumber).size() == 0 && numberOfRooms < 20)
					{
						System.out.print(roomnumber+",");
						
					}else if(dict.get(roomnumber).size() == 0 && numberOfRooms == 20) 
					{
						System.out.println(roomnumber);
					}
						
				}
				
			}
				
		}
		lineEnd();
	}
	
	public static void showDataSimple(HashMap<String, ArrayList<Object>> dict) {
		
		System.out.print("\n");
		for(int numberOfRooms = 1 ; numberOfRooms <= dict.size();numberOfRooms++ ) 
		{
			String roomnumber = "";
			if(numberOfRooms<=9) 
			{
				roomnumber = "0"+numberOfRooms;
				System.out.print("ข้อมูลห้องหมายเลข "+roomnumber+" VipRoom"+" : ");
			}else if(numberOfRooms<=20)
			{
				if(numberOfRooms == 10) 
				{
					roomnumber = roomnumber+numberOfRooms;
					System.out.print("ข้อมูลห้องหมายเลข "+roomnumber+" VipRoom"+" : ");
				}
				else 
				{
					roomnumber = roomnumber+numberOfRooms;
					System.out.print("ข้อมูลห้องหมายเลข "+roomnumber+" StandardRoom"+" : ");	
				}
				
			}
			
			for(int dataNumber = 0;dataNumber<=4;dataNumber++) 
			{
				if(dict.get(roomnumber).size() != 0) 
				{
					if(dataNumber == 0) 
					{
						System.out.print("หมายเลขห้อง = "+dict.get(roomnumber).get(dataNumber)+" | ");
					}else if(dataNumber == 1) 
					{
						System.out.print("ชื่อของเจ้าของห้อง = "+dict.get(roomnumber).get(dataNumber)+" | ");

					}else if(dataNumber == 2) 
					{
						System.out.print("ชือของแมวในห้อง = "+dict.get(roomnumber).get(dataNumber)+" | ");

					}else if(dataNumber == 3) 
					{
						System.out.print("จำนานวันที่เข้าพัก = "+dict.get(roomnumber).get(dataNumber)+" วัน"+" | ");
						
					}else if(dataNumber == 4) 
					{
						System.out.println("ราคารวมที่ต้องชำระ = "+dict.get(roomnumber).get(dataNumber)+" บาท");
					}
					
					else 
					{
						System.out.println("error!!");
					}
					
				}else if(dict.get(roomnumber).size() == 0 && dataNumber==0)
				{
					System.out.println("ยังว่างอยู่");
				}
				
			}
		}
	}
	
	public static void showmeDataOwnerInof(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("\n"+"ต้องการแสดงข้อมูลของเจ้าของห้องหมายเลขอะไร"+"\n"+"= ");
		String numbeRoomKey= kb.next();
		

		if(mandatoryNumberRoom.contains(numbeRoomKey)) 
		{
			numbeRoomKey = numbeRoomKey;

		}else 
			{while(true) 
			{
				System.out.println("กรุณากรอกหมายเลขห้องให้ถูกต้อง!!"+"\n");
				System.out.print("\n"+"ต้องการแสดงข้อมูลของเจ้าของห้องหมายเลขอะไร"+"\n"+"= ");
				String numbeRoomKeyRe= kb.next();
				if(mandatoryNumberRoom.contains(numbeRoomKeyRe)) 
				{
					numbeRoomKey = numbeRoomKeyRe;
					break;
				}else 
				{
					continue;
				}
				
			}
		}
		
		if(dict.get(numbeRoomKey).size() != 0) 
		{
			System.out.print("\n"+dict.get(numbeRoomKey).get(5)+"\n");
		}else if(dict.get(numbeRoomKey).size() == 0)
		{
			System.out.print("\n"+"ไม่พบข้อมูล"+"\n");
		}
	}
	
	public static void showmeDataCatInof(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("ต้องการแสดงข้อมูลของแมวของห้องหมายเลขอะไร"+"\n"+"= ");
		String numbeRoomKey= kb.next();
		

		if(mandatoryNumberRoom.contains(numbeRoomKey)) 
		{
			numbeRoomKey = numbeRoomKey;

		}else 
			{while(true) 
			{
				System.out.println("กรุณากรอกหมายเลขห้องให้ถูกต้อง!!"+"\n");
				System.out.print("ต้องการแสดงข้อมูลของแมวของห้องหมายเลขอะไร"+"\n"+"= ");
				String numbeRoomKeyRe= kb.next();
				if(mandatoryNumberRoom.contains(numbeRoomKeyRe)) 
				{
					numbeRoomKey = numbeRoomKeyRe;
					break;
				}else 
				{
					continue;
				}
				
			}
		}
		
		if(dict.get(numbeRoomKey).size() != 0) 
		{
			System.out.print("\n"+dict.get(numbeRoomKey).get(6)+"\n");
		}else if(dict.get(numbeRoomKey).size() == 0)
		{
			System.out.print("\n"+"ไม่พบข้อมูล"+"\n");
		}
	}
	
	public static void showmeDataRoomInof(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("\n"+"ต้องการแสดงข้อมูลของห้องหมายเลขอะไร"+"\n"+"= ");
		String numbeRoomKey= kb.next();
		

		if(mandatoryNumberRoom.contains(numbeRoomKey)) 
		{
			numbeRoomKey = numbeRoomKey;

		}else 
		{	while(true) 
			{
				System.out.println("กรุณากรอกหมายเลขห้องให้ถูกต้อง!!"+"\n");
				System.out.print("\n"+"ต้องการแสดงข้อมูลของห้องหมายเลขอะไร"+"\n"+"= ");
				String numbeRoomKeyRe= kb.next();
				if(mandatoryNumberRoom.contains(numbeRoomKeyRe)) 
				{
					numbeRoomKey = numbeRoomKeyRe;
					break;
				}else 
				{
					continue;
				}
				
			}
		}
		
		if(dict.get(numbeRoomKey).size() != 0) 
		{
			System.out.print("\n"+dict.get(numbeRoomKey).get(7)+"\n");
		}else if(dict.get(numbeRoomKey).size() == 0)
		{
			System.out.print("\n"+"ไม่พบข้อมูล"+"\n");
		}
	}
	private static void showDataRoom(HashMap<String, ArrayList<Object>> dict,ArrayList<String> numberVipRoom,ArrayList<String> numberStandardRoom,ArrayList<String> mandatoryNumberRoom)
	{
		Scanner kb = new Scanner(System.in);
		while (true) 
		{
			System.out.print("\n"+"1.เช็คสถานะห้องพักทั้งหมด"+" | "+"2.เช็คสถานะห้องพักแบบVipRoomทั้งหมด"+" | "
					+"3.เช็คสถานะห้องพักแบบStandardRoomทั้งหมด"+" | "+"4.เช็คข้อมูลของห้องพักแบบระบุหมายเลขห้อง"+"\n"+"= ");
			String mainKey2 = kb.next();
			if(mainKey2.equals("1")) 
			{
				System.out.print("\n"+"<<ระบบเช็คสถานะห้องพักทั้งหมด>>"+"\n");
				showDataSimple(dict);
				lineEnd();
				break;
				
			}else if(mainKey2.equals("2"))
			{
				System.out.print("\n"+"<<ระบบเช็คสถานะห้องพักแบบVipRoomทั้งหมด>>"+"\n");
				System.out.print("\n");
				for(int numberOfRooms = 1 ; numberOfRooms <= numberVipRoom.size();numberOfRooms++ ) 
				{
					String roomnumber = "";
					if(numberOfRooms<=10) 
					{
						if(numberOfRooms == 10) 
						{
							roomnumber = roomnumber+numberOfRooms;
							System.out.print("ข้อมูลห้องหมายเลข "+roomnumber+" VipRoom"+" : ");
						}else 
						{
							roomnumber = "0"+numberOfRooms;
							System.out.print("ข้อมูลห้องหมายเลข "+roomnumber+" VipRoom"+" : ");
						}
					}
					for(int dataNumber = 0;dataNumber<=4;dataNumber++) 
					{
						if(dict.get(roomnumber).size() != 0) 
						{
							if(dataNumber == 0) 
							{
								System.out.print("หมายเลขห้อง = "+dict.get(roomnumber).get(dataNumber)+" | ");
							}else if(dataNumber == 1) 
							{
								System.out.print("ชื่อของเจ้าของห้อง = "+dict.get(roomnumber).get(dataNumber)+" | ");

							}else if(dataNumber == 2) 
							{
								System.out.print("ชือของแมวในห้อง = "+dict.get(roomnumber).get(dataNumber)+" | ");

							}else if(dataNumber == 3) 
							{
								System.out.print("จำนานวันที่เข้าพัก = "+dict.get(roomnumber).get(dataNumber)+" วัน"+" | ");
								
							}else if(dataNumber == 4) 
							{
								System.out.println("ราคารวมที่ต้องชำระ = "+dict.get(roomnumber).get(dataNumber)+" บาท");
							}
							
							else 
							{
								System.out.println("error!!");
							}
							
						}else if(dict.get(roomnumber).size() == 0 && dataNumber==0)
						{
							System.out.println("ยังว่างอยู่");
						}
						
					}
				
				}lineEnd();
				break;
			}else if(mainKey2.equals("3"))
			{
				System.out.print("\n"+"<<ระบบเช็คสถานะห้องพักแบบStandardRoomทั้งหมด>>"+"\n");
				System.out.print("\n");
				for(int numberOfRooms = 11 ; numberOfRooms <= 20;numberOfRooms++ ) 
				{
					String roomnumber = "";
					roomnumber = roomnumber+numberOfRooms;
					System.out.print("ข้อมูลห้องหมายเลข "+roomnumber+" StandardRoom"+" : ");
					
					for(int dataNumber = 0;dataNumber<=4;dataNumber++) 
					{
						if(dict.get(roomnumber).size() != 0) 
						{
							if(dataNumber == 0) 
							{
								System.out.print("หมายเลขห้อง = "+dict.get(roomnumber).get(dataNumber)+" | ");
							}else if(dataNumber == 1) 
							{
								System.out.print("ชื่อของเจ้าของห้อง = "+dict.get(roomnumber).get(dataNumber)+" | ");

							}else if(dataNumber == 2) 
							{
								System.out.print("ชือของแมวในห้อง = "+dict.get(roomnumber).get(dataNumber)+" | ");

							}else if(dataNumber == 3) 
							{
								System.out.print("จำนานวันที่เข้าพัก = "+dict.get(roomnumber).get(dataNumber)+" วัน"+" | ");
								
							}else if(dataNumber == 4) 
							{
								System.out.println("ราคารวมที่ต้องชำระ = "+dict.get(roomnumber).get(dataNumber)+" บาท");
							}
							
							else 
							{
								System.out.println("error!!");
							}
							
						}else if(dict.get(roomnumber).size() == 0 && dataNumber==0)
						{
							System.out.println("ยังว่างอยู่");
						}
						
					}
					
				}lineEnd();break;
			}else if(mainKey2.equals("4")) 
			{
				System.out.print("\n"+"<<ระบบเช็คข้อมูลของห้องพักแบบระบุหมายเลขห้อง>>"+"\n");
				showmeDataRoomInof(dict,mandatoryNumberRoom);
				lineEnd();
				break;
			}else 
			{
				System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" | "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
				continue;
			}
		}
	}
	
	private static void showDataOnwerAndCatInfo(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{
		Scanner kb = new Scanner(System.in);
		while (true) 
		{
			System.out.print("\n"+"1.เช็คข้อมูลของเจ้าของห้อง"+" | "+"2.เช็คข้อมูลของแมว"+"\n"+"= ");
			String mainKey2 = kb.next();
			if (mainKey2.equals("1")) 
			{
				showmeDataOwnerInof(dict, mandatoryNumberRoom);
				break;
			}else if (mainKey2.equals("2")) 
			{
				showmeDataCatInof(dict, mandatoryNumberRoom);
				break;
			}else 
			{
				System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" | "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
				continue;
			}
		}
	}
	
	public static void showDataInof(HashMap<String, ArrayList<Object>> dict,ArrayList<String> numberVipRoom,ArrayList<String> numberStandardRoom,ArrayList<String> mandatoryNumberRoom) 
	{
		
		Scanner kb = new Scanner(System.in);
		boolean continuekey = true;
		
		while (continuekey)
		{
			System.out.print("\n"+"<<ระบบเช็คสถานะห้องพักและข้อมูลอื่นๆ>>"+"\n");
			System.out.print("\n"+"1.เช็คสถานะห้องพัก"+" | "+"2.เช็คข้อมูลของผู้เข้าพัก"+"\n"+"= ");
			
			String mainKey1 = kb.next();
			if(mainKey1.equals("1"))
			{
				lineEnd();
				System.out.print("\n"+"<<ระบบเช็คเช็คสถานะห้องพัก>>"+"\n");
				showDataRoom(dict, numberVipRoom, numberStandardRoom, mandatoryNumberRoom);
				
				Boolean checkingContinuekeyShowDataInfo = checkingContinuekeyShowDataInfo(dict,continuekey);
				if(checkingContinuekeyShowDataInfo)
				{
					continue;
				}else
				{
					if(!(checkingContinuekeyShowDataInfo)) 
					{
						break;
					}
				}
				
			}else if(mainKey1.equals("2"))
			{
				lineEnd();
				System.out.print("\n"+"<<เช็คข้อมูลของผู้เข้าพัก>>"+"\n");
				showDataOnwerAndCatInfo(dict, mandatoryNumberRoom);
				
				Boolean checkingContinuekeyShowDataInfo = checkingContinuekeyShowDataInfo(dict,continuekey);
				
				if(checkingContinuekeyShowDataInfo)
				{
					continue;
				}else
				{
					if(!(checkingContinuekeyShowDataInfo)) 
					{
						break;
					}
				}
			}else 
			{
				System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" | "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
				continue;
			}
			

		}
		
	}
	
	private static boolean checkingContinuekeyShowDataInfo(HashMap<String, ArrayList<Object>> dict,boolean leavekey) 
	{
		Scanner kb = new Scanner(System.in);
		boolean leave = true;
		while(leave)
		{
			System.out.print("\n"+"ต้องการทำการเช็คสถานะห้องพักและข้อมูลอื่นๆต่ออีกหรือไม่? | กรอกYเมื่อต้องการทำการเช็คต่อ กรอกNเมื่อต้องการออกจากการเช็ค"+"\n"+"= ");
			String mainLeaveKey = kb.next().toUpperCase();
			if(mainLeaveKey.equals("Y"))
			{
				
				leave = false;
			}
			else
			{
				if(mainLeaveKey.equals("N"))
				{
					leavekey = false;
					leave = false;
				}else
				{
					System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" | "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
					continue;
				}
			}
		}
		return leavekey;
	}
	
}
