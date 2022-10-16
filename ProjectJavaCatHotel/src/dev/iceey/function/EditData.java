package dev.iceey.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import dev.iceey.function.ShowData;
import dev.iceey.infoClass.OwnerInformation;
import dev.iceey.infoClass.CatInformation;
import dev.iceey.infoClass.StandardRoom;
import dev.iceey.infoClass.VipRoom;

public class EditData {

	public static void addData(HashMap<String, ArrayList<Object>> dict,ArrayList<String> numberVipRoom,ArrayList<String> numberStandardRoom,ArrayList<String> mandatoryNumberRoom) 
	
	{
		Scanner kb = new Scanner(System.in);

		
		while (true) 
		{
			System.out.print("\n"+"<<ระบบเพิ่มข้อมูลการเข้าพัก>>"+"\n");
			System.out.print("\n"+"คุณต้องการเพิ่มข้อมูลหรือไม่ | ใช่ให้กรอก Y | ไม่ให้กรอก N"+"\n"+"= ");
			String key = kb.next().toUpperCase();

			if (key.equals("Y")) 
			{
				System.out.println("\n"+"<<ข้อมูลของผู้จองห้องพัก>>"+"\n");
				
				System.out.print("ชื่อของผู้จองห้องพัก"+"\n"+"= ");
				kb.nextLine();
				String ownerName = kb.nextLine();
				
				System.out.print("\n"+"อายุของผู้จองห้องพัก"+"\n"+"= ");
				String ownerAge = kb.nextLine();
				
				System.out.print("\n"+"เบอร์โทรติดต่อของผู้จองห้องพัก"+"\n"+"= ");
				String ownerContact = kb.next();
				
				System.out.print("\n"+"ที่อยู่ของผู้จองห้องพัก"+"\n"+"= ");
				kb.nextLine();
				String ownerAddress = kb.nextLine();
				
				System.out.print("\n"+"เลขบัตรประชาชนของผู้จองห้องพัก"+"\n"+"= ");
				String ownerIdCard = kb.next();
				
				OwnerInformation objectOwner = new OwnerInformation(ownerName,ownerAge,ownerContact,ownerAddress,ownerIdCard);
				
				ShowData.lineEnd();
				
				System.out.println("\n"+"<<ข้อมูลของแมว>>"+"\n");
				System.out.print("\n"+"ต้องการฝากแมวกี่ตัว"+"\n"+"= ");
				
				int numberOfcats = kb.nextInt();
				
				for(int cats=1;cats <= numberOfcats;cats++)
				{
					System.out.print("\n"+"<<ข้อมูลของแมวตัวที่"+cats+">>"+"\n");
					
					System.out.print("\n"+"ชื่อของแมว"+"\n"+"= ");
					String catName = kb.next();
					
					System.out.print("\n"+"อายุของแมว"+"\n"+"= ");
					kb.nextLine();
					String catAge = kb.nextLine();
					
					System.out.print("\n"+"น้ำหนักของแมว"+"\n"+"= ");
					double catWeight = kb.nextDouble();
					
					System.out.print("\n"+"สายพันธุ์ของแมว"+"\n"+"= ");
					String catBreed = kb.next();
					
					System.out.print("\n"+"สีขนของแมว"+"\n"+"= ");
					String catfurColor = kb.next();
					
					System.out.print("\n"+"โรคประจำตัวของแมว"+"\n"+"= ");
					String catCongentaldisease = kb.next();
					
					System.out.print("\n"+"ข้อมูลหนังสือวัคซีนของแมว"+"\n"+"= ");
					String catVaccineBook = kb.next();
					
					CatInformation objectCat = new CatInformation(catName,catAge,catWeight,catBreed,catfurColor
							,catCongentaldisease,catVaccineBook,objectOwner);
					
					ShowData.lineEnd();
					
					while (true) 
					{
						ShowData.shomeDataRoomEmpty(dict);
						
						System.out.print("หมายเลขห้องที่คุณต้องการเพิ่มข้อมูล"+"\n"+"= ");
						String roomNumber = kb.next();
						
						if(mandatoryNumberRoom.contains(roomNumber)) 
						{
							roomNumber = roomNumber;

						}else 
						{	while(true) 
							{
								System.out.println("\n"+"กรุณากรอกหมายเลขห้องให้ถูกต้อง!!"+"\n");
								System.out.print("หมายเลขห้องที่คุณต้องการเพิ่มข้อมูล"+"\n"+"= ");
								String roomNumberRe = kb.next();
								if(mandatoryNumberRoom.contains(roomNumberRe)) 
								{
									roomNumber = roomNumberRe;
									break;
								}else 
								{
									continue;
								}
							}
						}
						
						if(dict.get(roomNumber).size() != 0) 
						{
							System.out.println("\n"+"ห้องดังกล่าวมีผู้จองแล้ว!! | กรุณากรอกหมายเลขห้องอื่นอีกครั้ง "+"\n");
							continue;
						}
						
						System.out.print("\n"+"จำนวนวันที่เข้าพัก"+"\n"+"= ");
						int daysToStay = kb.nextInt();
						
						if (numberVipRoom.contains(roomNumber)) 
						{
							VipRoom objectRoom = new VipRoom(roomNumber,daysToStay);
							dict.get(roomNumber).add(objectRoom.getRoomNumber());
							dict.get(roomNumber).add(objectOwner.getFullName());
							dict.get(roomNumber).add(objectCat.getCatName());
							dict.get(roomNumber).add(objectRoom.getHowManyDaysToStay());
							dict.get(roomNumber).add(objectRoom.calRoomPrice());
							dict.get(roomNumber).add(objectOwner);
							dict.get(roomNumber).add(objectCat);
							dict.get(roomNumber).add(objectRoom);
						}else if (numberStandardRoom.contains(roomNumber)) 
						{
							StandardRoom objectRoom = new StandardRoom(roomNumber,daysToStay);
							dict.get(roomNumber).add(objectRoom.getRoomNumber());
							dict.get(roomNumber).add(objectOwner.getFullName());
							dict.get(roomNumber).add(objectCat.getCatName());
							dict.get(roomNumber).add(objectRoom.getHowManyDaysToStay());
							dict.get(roomNumber).add(objectRoom.calRoomPrice());
							dict.get(roomNumber).add(objectOwner);
							dict.get(roomNumber).add(objectCat);
							dict.get(roomNumber).add(objectRoom);
						}else 
						{
							System.out.print("error!!");
						}
						ShowData.lineEnd();
						break;

					}
					
				}
			}else if (key.equals("N")) 
			{
				break;
			}else 
			{
				System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
				continue;
			}
		}
		


	}
	
	private static String checkErrorRoomEmptyEdit(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{
		Scanner kb = new Scanner(System.in);
		
		while (true) 
		{
			
			System.out.print("\n"+"หมายเลขห้องที่คุณต้องการแก้ไขข้อมูล"+"\n"+"= ");
			String roomNumber = kb.next();
			
			if(mandatoryNumberRoom.contains(roomNumber)) 
			{
				roomNumber = roomNumber;

			}else 
			{	while(true) 
				{
					if (roomNumber.equals("0")) 
					{
						return roomNumber;
					}
					System.out.println("\n"+"กรุณากรอกหมายเลขห้องให้ถูกต้อง!!"+"\n");
					System.out.print("หมายเลขห้องที่คุณต้องการแก้ไขข้อมล"+"\n"+"= ");
					String roomNumberRe = kb.next();
					if(mandatoryNumberRoom.contains(roomNumberRe)) 
					{
						roomNumber = roomNumberRe;
						break;
					}else 
					{
						continue;
					}
				}
			}
			
			if(dict.get(roomNumber).size() == 0) 
			{
				System.out.println("\n"+"ห้องดังกล่าวไม่พบข้อมูล!! | กรุณากรอกหมายเลขห้องอื่นอีกครั้ง "+"\n"
						+"หากไม่ต้องแก้ไขข้อมูลแล้วให้กรอก 0 "+"\n");
				continue;
			}
			return roomNumber;
		}
		
	}
	
	private static void editDataManyOwnersInOne(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{
		Scanner kb = new Scanner(System.in);
		
		ShowData.lineEnd();
		System.out.print("\n"+"<<ระบบแก้ไขข้อมูลเจ้าของแมวหลายห้องทีเดียว>>"+"\n");
		
		ArrayList<String> manyOwner = new ArrayList<String>();
		System.out.print("\n"+"ต้องการแก้ไขพร้อมกันกี่ห้อง"+"\n"+"= ");
		int howManyOwner = kb.nextInt();
		
		for(int ownerI = 1;ownerI <= howManyOwner;ownerI++) 
		{
			String numberRoom = checkErrorRoomEmptyEdit(dict, mandatoryNumberRoom);
			if(numberRoom.equals("0"))
			{
				ownerI = howManyOwner;
			}else 
			{
				manyOwner.add(numberRoom);
			}
		}
		
		Boolean continuekey = true;
		
		while (continuekey) 
		{
			ShowData.lineEnd();
			System.out.print("\n"+"<<ระบบแก้ไขข้อมูลเจ้าของแมวหลายห้องทีเดียว>>"+"\n");
			System.out.print(
					"\n"+"กรุณาเลือกสิ่งที่ต้องการจะแก้ไขตามตัวเลือกดังต่อไปนี้" + "\n" + "1.แก้ไขข้อมูลชื่อเจ้าของแมว"
							+ "\n" + "2.แก้ไขข้อมูลอายุเจ้าของแมว" + "\n" + "3.แก้ไขข้อมูลเบอร์โทรติดต่อเจ้าของแมว" + "\n"
							+ "4.แก้ไขข้อมูลที่อยู่เจ้าของแมว" + "\n" + "5.แก้ไขข้อมูลเลขประชาชนเจ้าของแมว" + "\n" +"0.ถ้าไม่ต้องการจะแก้ไขข้อมูลแล้ว"+"\n"+"= ");
			String keyEditOwner = kb.next();

			if (keyEditOwner.equals("1")) {
				
				System.out.print("\n"+"กรุณากรอกชื่อเจ้าของแมวที่ต้องการจะแก้ไข"+"\n" + "= ");
				String ownerName = kb.next();
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setFullName(ownerName);
					dict.get(manyOwner.get(ownerI)).set(1,ownerName);
					System.out.print("\n");
				}

			} else if (keyEditOwner.equals("2")) {
				System.out.print("\n"+"กรุณากรอกอายุเจ้าของแมวที่ต้องการจะแก้ไข"+ "\n" + "= ");
				kb.nextLine();
				String ownerAge = kb.nextLine();
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setAge(ownerAge);
					System.out.print("\n");
				}

			} else if (keyEditOwner.equals("3")) {
				System.out.print("\n"+"กรุณากรอกเบอร์ติดต่อเจ้าของแมวที่ต้องการจะแก้ไข"+ "\n" + "= ");
				String ownerContactNumber = kb.next();
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setContactNumber(ownerContactNumber);
					System.out.print("\n");
				}

			} else if (keyEditOwner.equals("4")) {
				System.out.print("\n"+"กรุณากรอกที่อยู่เจ้าของแมวที่ต้องการจะแก้ไข"+ "\n" + "= ");
				String ownerAddress = kb.next();
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setAddress(ownerAddress);
					System.out.print("\n");
				}

			} else if (keyEditOwner.equals("5")) {
				System.out.print("\n"+"กรุณากรอกเลขประชาชนเจ้าของแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
				String ownerIdCard = kb.next();
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setIdCard(ownerIdCard);
					System.out.print("\n");
				}
			
			}else if(keyEditOwner.equals("0"))
			{
				System.out.print("\n");
				continuekey = false;
			} else {
				System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
			}
		}
	
	}
	
	private static void editDataManyOwners(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{
		Scanner kb = new Scanner(System.in);
		
		ShowData.lineEnd();
		System.out.print("\n"+"<<ระบบแก้ไขข้อมูลเจ้าของแมวหลายห้อง>>"+"\n");
		
		ArrayList<String> manyOwner = new ArrayList<String>();
		System.out.print("\n"+"ต้องการแก้ไขพร้อมกันกี่ห้อง"+"\n"+"= ");
		int howManyOwner = kb.nextInt();
		
		for(int ownerI = 1;ownerI <= howManyOwner;ownerI++) 
		{
			String numberRoom = checkErrorRoomEmptyEdit(dict, mandatoryNumberRoom);
			if(numberRoom.equals("0"))
			{
				ownerI = howManyOwner;
			}else 
			{
				manyOwner.add(numberRoom);
			}
		}
		
		Boolean continuekey = true;
		
		while (continuekey) 
		{
			ShowData.lineEnd();
			System.out.print("\n"+"<<ระบบแก้ไขข้อมูลเจ้าของแมวหลายห้อง>>"+"\n");
			System.out.print(
					"\n"+"กรุณาเลือกสิ่งที่ต้องการจะแก้ไขตามตัวเลือกดังต่อไปนี้" + "\n" + "1.แก้ไขข้อมูลชื่อเจ้าของแมว"
							+ "\n" + "2.แก้ไขข้อมูลอายุเจ้าของแมว" + "\n" + "3.แก้ไขข้อมูลเบอร์โทรติดต่อเจ้าของแมว" + "\n"
							+ "4.แก้ไขข้อมูลที่อยู่เจ้าของแมว" + "\n" + "5.แก้ไขข้อมูลเลขประชาชนเจ้าของแมว" + "\n" +"0.ถ้าไม่ต้องการจะแก้ไขข้อมูลแล้ว"+"\n"+"= ");
			String keyEditOwner = kb.next();

			if (keyEditOwner.equals("1")) {
				
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("\n"+"กรุณากรอกชื่อเจ้าของแมวที่ต้องการจะแก้ไขของหมายเลขห้อง "+manyOwner.get(ownerI)+"\n" + "= ");
					String ownerName = kb.next();
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setFullName(ownerName);
					dict.get(manyOwner.get(ownerI)).set(1,ownerName);
					System.out.print("\n");
				}

			} else if (keyEditOwner.equals("2")) {
				
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("\n"+"กรุณากรอกอายุเจ้าของแมวที่ต้องการจะแก้ไขของหมายเลขห้อง "+manyOwner.get(ownerI)+ "\n" + "= ");
					kb.nextLine();
					String ownerAge = kb.nextLine();
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setAge(ownerAge);
					System.out.print("\n");
				}

			} else if (keyEditOwner.equals("3")) {
				
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("\n"+"กรุณากรอกเบอร์ติดต่อเจ้าของแมวที่ต้องการจะแก้ไขของหมายเลขห้อง "+manyOwner.get(ownerI)+ "\n" + "= ");
					String ownerContactNumber = kb.next();
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setContactNumber(ownerContactNumber);
					System.out.print("\n");
				}

			} else if (keyEditOwner.equals("4")) {
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("\n"+"กรุณากรอกที่อยู่เจ้าของแมวที่ต้องการจะแก้ไขของหมายเลขห้อง "+manyOwner.get(ownerI)+ "\n" + "= ");
					String ownerAddress = kb.next();
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setAddress(ownerAddress);
					System.out.print("\n");
				}

			} else if (keyEditOwner.equals("5")) {
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("\n"+"กรุณากรอกเลขประชาชนเจ้าของแมวที่ต้องการจะแก้ไขของหมายเลขห้อง "+manyOwner.get(ownerI) + "\n" + "= ");
					String ownerIdCard = kb.next();
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setIdCard(ownerIdCard);
					System.out.print("\n");
				}
			
			}else if(keyEditOwner.equals("0"))
			{
				System.out.print("\n");
				continuekey = false;
			} else {
				System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
			}
		}
	
	}
	
	private static void editDataManyCats(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{
		Scanner kb = new Scanner(System.in);
		
		ShowData.lineEnd();
		System.out.print("\n"+"<<ระบบแก้ไขข้อมูลแมวแบบหลายห้องพร้อมกัน>>"+"\n");
		
		ArrayList<String> manyOwner = new ArrayList<String>();
		System.out.print("\n"+"ต้องการแก้ไขพร้อมกันกี่ห้อง"+"\n"+"= ");
		int howManyOwner = kb.nextInt();
		
		for(int ownerI = 1;ownerI <= howManyOwner;ownerI++) 
		{
			String numberRoom = checkErrorRoomEmptyEdit(dict, mandatoryNumberRoom);
			if(numberRoom.equals("0"))
			{
				ownerI = howManyOwner;
			}else 
			{
				manyOwner.add(numberRoom);
			}
		}
		
		Boolean continuekey = true;
		
		while (continuekey) 
		{
			ShowData.lineEnd();
			System.out.print("\n"+"<<ระบบแก้ไขข้อมูลแมวแบบหลายห้องพร้อมกัน>>"+"\n");
			System.out.print(
					"\n"+"กรุณาเลือกสิ่งที่ต้องการจะแก้ไขตามตัวเลือกดังต่อไปนี้" + "\n" + "1.แก้ไขข้อมูลชื่อแมว"
							+ "\n" + "2.แก้ไขข้อมูลอายุเแมว" + "\n" + "3.แก้ไขข้อมูลน้ำหนักแมว" + "\n"
							+ "4.แก้ไขข้อมูลสายพันธุ์แมว" + "\n" + "5.แก้ไขข้อมูลสีขนแมว" + "\n" 
							+"6.แก้ไขข้อมูลโรคประจำตัวของแมว"+"\n"+"7.แก้ไขข้อมูลหนังสือวัคซีนแมว"+"\n"+"0.ถ้าไม่ต้องการจะแก้ไขข้อมูลแล้ว"+"\n"+"= ");
			String keyEditCat = kb.next();

			if (keyEditCat.equals("1")) {
				
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("\n"+"กรุณากรอกชื่อแมวที่ต้องการจะแก้ไขของหมายเลขห้อง"+manyOwner.get(ownerI) + "\n" + "= ");
					String catName = kb.next();
					((CatInformation) dict.get(manyOwner.get(ownerI)).get(6)).setCatName(catName);
					dict.get(manyOwner.get(ownerI)).set(2,catName);
					System.out.print("\n");
				}

			} else if (keyEditCat.equals("2")) {
				
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("\n"+"กรุณากรอกอายุเจ้าของแมวที่ต้องการจะแก้ไขของหมายเลขห้อง "+manyOwner.get(ownerI) + "\n" + "= ");
					kb.nextLine();
					String catAge = kb.nextLine();
					((CatInformation) dict.get(manyOwner.get(ownerI)).get(6)).setCatAge(catAge);
					System.out.print("\n");
				}

			} else if (keyEditCat.equals("3")) {
				
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("กรุณากรอกอายุเจ้าของแมวที่ต้องการจะแก้ไขของหมายเลขห้อง "+manyOwner.get(ownerI) + "\n" + "= ");
					double catWeight = kb.nextDouble();
					((CatInformation) dict.get(manyOwner.get(ownerI)).get(6)).setWeight(catWeight);
					System.out.print("\n");
				}

			} else if (keyEditCat.equals("4")) {
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("กรุณากรอกสายพันธุ์แมวที่ต้องการจะแก้ไขของหมายเลขห้อง "+manyOwner.get(ownerI) + "\n" + "= ");
					String catBreed = kb.next();
					((CatInformation) dict.get(manyOwner.get(ownerI)).get(6)).setBreed(catBreed);
					System.out.print("\n");
				}

			} else if (keyEditCat.equals("5")) {
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("กรุณากรอกสีขนแมวที่ต้องการจะแก้ไขของหมายเลขห้อง "+manyOwner.get(ownerI) + "\n" + "= ");
					String catFurColor = kb.next();
					((CatInformation) dict.get(manyOwner.get(ownerI)).get(6)).setFurColor(catFurColor);
					System.out.print("\n");
				}
			
			}else if (keyEditCat.equals("6")) {
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("กรุณากรอกโรคประจำตัวของแมวที่ต้องการจะแก้ไขของหมายเลขห้อง "+manyOwner.get(ownerI) + "\n" + "= ");
					String catCongenitalDisease = kb.next();
					((CatInformation) dict.get(manyOwner.get(ownerI)).get(6)).setCongenitalDisease(catCongenitalDisease);
					System.out.print("\n");
				}
			
			}else if (keyEditCat.equals("7")) {
				
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("กรุณากรอกหนังสือวัคซีนแมวที่ต้องการจะแก้ไขของหมายเลขห้อง "+manyOwner.get(ownerI) + "\n" + "= ");
					String catCatVaccineBook = kb.next();
					((CatInformation) dict.get(manyOwner.get(ownerI)).get(6)).setCatVaccineBook(catCatVaccineBook);
					System.out.print("\n");
				}
			
			}else if(keyEditCat.equals("0"))
			{
				System.out.print("\n");
				continuekey = false;
			} else {
				System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
			}
		}
	
	}
	
	public static void editDataSimple(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{

		while(true)
		{
			Scanner kb = new Scanner(System.in);
			ShowData.lineEnd();
			System.out.print("\n"+"<<ระบบแก้ไขข้อมูลของห้องพักและอื่นๆ>>"+"\n");
			System.out.println("\n"+"กรุณาเลือกสิ่งที่ต้องการจะแก้ไขตามตัวเลือกดังต่อไปนี้" + "\n"+"\n" + "1.แก้ไขข้อมูลเจ้าของแมว"
					+ " | " + "2.แก้ไขข้อมูลแมว" + "\n" + "3.แก้ไขข้อมูลห้อง"+" | " +"0.หยุดการทำงานของการแก้ไขข้อมูล");
			System.out.print("= ");
			String key = kb.next();

			
			//แก้ไขข้อมูลเจ้าของแมว
			if (key.equals("1")) {
				
				System.out.print("\n"+"<<ระบบแก้ไขข้อมูลเจ้าของแมว>>"+"\n");
				System.out.print("\n"+"กรุณาเลือกสิ่งที่ต้องการจะแก้ไขตามตัวเลือกดังต่อไปนี้" + "\n"+"\n" 
				+ "1.แก้ไขข้อมูลเจ้าของแมวแบบห้องเดียว"+ " | " + "2.แก้ไขข้อมูลเจ้าของแมวแบบหลายห้องพร้อมกัน" + " | "+"3.แก้ไขข้อมูลเจ้าของแมวแบบหลายห้องพร้อมกันทีเดียว" + "\n"+"= ");
				String key2 = kb.next();
				
				if(key2.equals("1")) 
				{
					String numberRoom = checkErrorRoomEmptyEdit(dict, mandatoryNumberRoom);
					if (numberRoom.equals("0")) 
					{
						break;
					}
					System.out.print("\n");
					
					while (true) 
					{
						ShowData.lineEnd();
						System.out.print("\n"+"<<ระบบแก้ไขข้อมูลเจ้าของแมวแบบห้องเดียว>>"+"\n");
						System.out.print(
								"\n"+"กรุณาเลือกสิ่งที่ต้องการจะแก้ไขตามตัวเลือกดังต่อไปนี้" + "\n" + "1.แก้ไขข้อมูลชื่อเจ้าของแมว"
										+ "\n" + "2.แก้ไขข้อมูลอายุเจ้าของแมว" + "\n" + "3.แก้ไขข้อมูลเบอร์โทรติดต่อเจ้าของแมว" + "\n"
										+ "4.แก้ไขข้อมูลที่อยู่เจ้าของแมว" + "\n" + "5.แก้ไขข้อมูลเลขประชาชนเจ้าของแมว" + "\n" +"0.ถ้าไม่ต้องการจะแก้ไขข้อมูลแล้ว"+"\n"+"= ");
						String keyEditOwner = kb.next();

						if (keyEditOwner.equals("1")) {
							System.out.print("กรุณากรอกชื่อเจ้าของแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
							String ownerName = kb.next();
							((OwnerInformation) dict.get(numberRoom).get(5)).setFullName(ownerName);
							dict.get(numberRoom).set(1,ownerName);
							System.out.print("\n");

						} else if (keyEditOwner.equals("2")) {
							System.out.print("กรุณากรอกอายุเจ้าของแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
							kb.nextLine();
							String ownerAge = kb.nextLine();
							((OwnerInformation) dict.get(numberRoom).get(5)).setAge(ownerAge);
							System.out.print("\n");

						} else if (keyEditOwner.equals("3")) {
							System.out.print("กรุณากรอกเบอร์ติดต่อเจ้าของแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
							String ownerContactNumber = kb.next();
							((OwnerInformation) dict.get(numberRoom).get(5)).setContactNumber(ownerContactNumber);
							System.out.print("\n");

						} else if (keyEditOwner.equals("4")) {
							System.out.print("กรุณากรอกที่อยู่เจ้าของแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
							String ownerAddress = kb.next();
							((OwnerInformation) dict.get(numberRoom).get(5)).setAddress(ownerAddress);
							System.out.print("\n");

						} else if (keyEditOwner.equals("5")) {
							System.out.print("กรุณากรอกเลขประชาชนเจ้าของแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
							String ownerIdCard = kb.next();
							((OwnerInformation) dict.get(numberRoom).get(5)).setIdCard(ownerIdCard);
							System.out.print("\n");
						
						}else if(keyEditOwner.equals("0"))
						{
							System.out.print("\n");
							break;
						} else {
							System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
						}
					}
				}else if(key2.equals("2")) 
				{
					editDataManyOwners(dict, mandatoryNumberRoom);
				}else if(key2.equals("3")) 
				{
					editDataManyOwnersInOne(dict, mandatoryNumberRoom);
				}
				else {
					System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
				}
					
			//แก้ไขข้อมูลแมว
			} else if (key.equals("2")) {
				
				System.out.print("\n"+"<<ระบบแก้ไขข้อมูลแมว>>"+"\n");
				System.out.print("\n"+"กรุณาเลือกสิ่งที่ต้องการจะแก้ไขตามตัวเลือกดังต่อไปนี้" + "\n"+"\n" 
				+ "1.แก้ไขข้อมูลแมวแบบห้องเดียว"+ " | " + "2.แก้ไขข้อมูลแมวแบบหลายห้องพร้อมกัน"+ "\n"+"= ");
				String key2 = kb.next();
				
				if (key2.equals("1")) 
				{
					String numberRoom = checkErrorRoomEmptyEdit(dict, mandatoryNumberRoom);
					if (numberRoom.equals("0")) 
					{
						break;
					}
					
					System.out.print("\n");
					while (true) 
					{
						ShowData.lineEnd();
						System.out.print("\n"+"<<ระบบแก้ไขข้อมูลแมวแบบห้องเดียว>>"+"\n");
						System.out.print(
								"\n"+"กรุณาเลือกสิ่งที่ต้องการจะแก้ไขตามตัวเลือกดังต่อไปนี้" + "\n" + "1.แก้ไขข้อมูลชื่อแมว"
										+ "\n" + "2.แก้ไขข้อมูลอายุเแมว" + "\n" + "3.แก้ไขข้อมูลน้ำหนักแมว" + "\n"
										+ "4.แก้ไขข้อมูลสายพันธุ์แมว" + "\n" + "5.แก้ไขข้อมูลสีขนแมว" + "\n" 
										+"6.แก้ไขข้อมูลโรคประจำตัวของแมว"+"\n"+"7.แก้ไขข้อมูลหนังสือวัคซีนแมว"+"\n"+"0.ถ้าไม่ต้องการจะแก้ไขข้อมูลแล้ว"+"\n"+"= ");
						String keyEditCat = kb.next();

						if (keyEditCat.equals("1")) {
							System.out.print("กรุณากรอกชื่อแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
							String catName = kb.next();
							((CatInformation) dict.get(numberRoom).get(6)).setCatName(catName);
							dict.get(numberRoom).set(2,catName);
							System.out.print("\n");

						} else if (keyEditCat.equals("2")) {
							System.out.print("กรุณากรอกอายุเจ้าของแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
							kb.nextLine();
							String catAge = kb.nextLine();
							((CatInformation) dict.get(numberRoom).get(6)).setCatAge(catAge);
							System.out.print("\n");
							
						} else if (keyEditCat.equals("3")) {
							System.out.print("กรุณากรอกอายุเจ้าของแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
							double catWeight = kb.nextDouble();
							((CatInformation) dict.get(numberRoom).get(6)).setWeight(catWeight);
							System.out.print("\n");

						} else if (keyEditCat.equals("4")) {
							System.out.print("กรุณากรอกสายพันธุ์แมวที่ต้องการจะแก้ไข" + "\n" + "= ");
							String catBreed = kb.next();
							((CatInformation) dict.get(numberRoom).get(6)).setBreed(catBreed);
							System.out.print("\n");

						} else if (keyEditCat.equals("5")) {
							System.out.print("กรุณากรอกสีขนแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
							String catFurColor = kb.next();
							((CatInformation) dict.get(numberRoom).get(6)).setFurColor(catFurColor);
							System.out.print("\n");
						
						}else if (keyEditCat.equals("6")) {
							System.out.print("กรุณากรอกโรคประจำตัวของแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
							String catCongenitalDisease = kb.next();
							((CatInformation) dict.get(numberRoom).get(6)).setCongenitalDisease(catCongenitalDisease);
							System.out.print("\n");
						
						}else if (keyEditCat.equals("7")) {
							System.out.print("กรุณากรอกหนังสือวัคซีนแมวที่ต้องการจะแก้ไข" + "\n" + "= ");
							String catCatVaccineBook = kb.next();
							((CatInformation) dict.get(numberRoom).get(6)).setCatVaccineBook(catCatVaccineBook);
							System.out.print("\n");
						
						}else if(keyEditCat.equals("0"))
						{
							System.out.print("\n");
							break;
						} else {
							System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
						}
					}
				}else if (key2.equals("2")) 
				{
					editDataManyCats(dict, mandatoryNumberRoom);
				}else {
					System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
				}
				

				
			//แก้ไขข้อมูลห้อง
			} else if (key.equals("3")) {
				String numberRoom = checkErrorRoomEmptyEdit(dict, mandatoryNumberRoom);
				if (numberRoom.equals("0")) 
				{
					break;
				}
				
				System.out.print("\n");
				
				while (numberRoom.equals("01") || numberRoom.equals("02") || numberRoom.equals("03") || numberRoom.equals("04") ||
						numberRoom.equals("05") || numberRoom.equals("06") || numberRoom.equals("07") || numberRoom.equals("08") ||
						numberRoom.equals("09") || numberRoom.equals("10")) 
				{
					ShowData.lineEnd();
					System.out.print("\n"+"<<ระบบแก้ไขข้อมูลห้องVipRoom>>"+"\n");
					System.out.print(
							"\n"+"กรุณาเลือกสิ่งที่ต้องการจะแก้ไขตามตัวเลือกดังต่อไปนี้" + "\n" + "1.แก้ไขข้อมูลเข้าพักกี่วัน"
									+ "\n" +"0.ถ้าไม่ต้องการจะแก้ไขข้อมูลแล้ว"+"\n"+"= ");
					String keyEditCat = kb.next();

					if (keyEditCat.equals("1")) {
						System.out.print("กรุณากรอกจำนวนวันที่เข้าพักที่ต้องการจะแก้ไข" + "\n" + "= ");
						int days = kb.nextInt();
						((VipRoom) dict.get(numberRoom).get(7)).setHowManyDaysToStay(days);
						dict.get(numberRoom).set(3,((VipRoom) dict.get(numberRoom).get(7)).getHowManyDaysToStay());
						dict.get(numberRoom).set(4,((VipRoom) dict.get(numberRoom).get(7)).calRoomPrice());
						System.out.print("\n");
						
					}else if(keyEditCat.equals("0"))
					{
						System.out.print("\n");
						break;
					} else {
						System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
					}
				}
				
				while (numberRoom.equals("11") || numberRoom.equals("12") || numberRoom.equals("13") || numberRoom.equals("14") ||
						numberRoom.equals("15") || numberRoom.equals("16") || numberRoom.equals("17") || numberRoom.equals("18") ||
						numberRoom.equals("19") || numberRoom.equals("20")) 
				{
					ShowData.lineEnd();
					System.out.print("\n"+"<<ระบบแก้ไขข้อมูลห้องStandardRoom>>"+"\n");
					System.out.print(
							"\n"+"กรุณาเลือกสิ่งที่ต้องการจะแก้ไขตามตัวเลือกดังต่อไปนี้" + "\n" + "1.แก้ไขข้อมูลเลขห้อง"
									+ "\n" +"0.ถ้าไม่ต้องการจะแก้ไขข้อมูลแล้ว"+"\n"+"= ");
					String keyEditCat = kb.next();

					if (keyEditCat.equals("1")) {
						
						System.out.print("กรุณากรอกจำนวนวันที่เข้าพักที่ต้องการจะแก้ไข" + "\n" + "= ");
						int days = kb.nextInt();
						((StandardRoom) dict.get(numberRoom).get(7)).setHowManyDaysToStay(days);
						dict.get(numberRoom).set(3,((StandardRoom) dict.get(numberRoom).get(7)).getHowManyDaysToStay());
						dict.get(numberRoom).set(4,((StandardRoom) dict.get(numberRoom).get(7)).calRoomPrice());
						System.out.print("\n");
						
					}else if(keyEditCat.equals("0"))
					{
						System.out.print("\n");
						break;
					} else {
						System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
					}
				}
			
			//หยุดการทำงานของการแก้ไขข้อมูล
			} else if(key.equals("0")) 
			{
				System.out.print("\n");
				break;
				
			}else {
				System.out.println("\n"+"คุณกรอกตัวเลือกผิด!!"+" "+"กรุณากรอกตัวเลือกตามที่ให้มาเท่านั้น!!"+"\n");
			}
		}

	}


	
	public static void clearData(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{
		
		Scanner kb = new Scanner(System.in);
		boolean continuekey = true;
		//leavekeyChecking(dict,leavekey);
		while (continuekey) 
		{
			System.out.print("\n"+"ต้องการลบข้อมูลห้องหมายเลขอะไร"+"\n"+"= ");
			String numbeRoom = kb.next();
			if (numbeRoom.equals("0")) 
			{
				continuekey = false;
			}else 
			{
				if (mandatoryNumberRoom.contains(numbeRoom)) 
				{
					dict.get(numbeRoom).clear();
					System.out.print("\n");
					System.out.print("\n"+"ระบบได้ทำการลบข้อมูลของห้องหมายเลข "+numbeRoom+" เรียบร้อยแล้ว"+"\n");
					
					Boolean continuekeyClearData = checkingContinuekeyClearData(dict, continuekey);
					if(continuekeyClearData)
					{
						continue;
					}else
					{
						if (!(continuekeyClearData)) 
						{
							break;
						}
					}
					
					
				}else 
				{
					System.out.println("\n"+"กรุณากรอกหมายเลขห้องให้ถูกต้อง!!"+"\n");
					continue;
				}
			}
		}
	}

	private static boolean checkingContinuekeyClearData(HashMap<String, ArrayList<Object>> dict,boolean leavekey) 
	{
		Scanner kb = new Scanner(System.in);
		boolean leave = true;
		while(leave)
		{
			System.out.print("\n"+"ต้องการลบข้อมูลอีกหรือไม่? | กรอกYเมื่อต้องการทำการเช็คต่อ กรอกNเมื่อต้องการออกจากการเช็ค"+"\n"+"= ");
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
