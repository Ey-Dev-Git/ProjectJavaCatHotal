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
			System.out.print("\n"+"<<�к����������š����Ҿѡ>>"+"\n");
			System.out.print("\n"+"�س��ͧ�������������������� | ������͡ Y | �������͡ N"+"\n"+"= ");
			String key = kb.next().toUpperCase();

			if (key.equals("Y")) 
			{
				System.out.println("\n"+"<<�����Ţͧ���ͧ��ͧ�ѡ>>"+"\n");
				
				System.out.print("���ͧ͢���ͧ��ͧ�ѡ"+"\n"+"= ");
				kb.nextLine();
				String ownerName = kb.nextLine();
				
				System.out.print("\n"+"���آͧ���ͧ��ͧ�ѡ"+"\n"+"= ");
				String ownerAge = kb.nextLine();
				
				System.out.print("\n"+"�����õԴ��ͧ͢���ͧ��ͧ�ѡ"+"\n"+"= ");
				String ownerContact = kb.next();
				
				System.out.print("\n"+"�������ͧ���ͧ��ͧ�ѡ"+"\n"+"= ");
				kb.nextLine();
				String ownerAddress = kb.nextLine();
				
				System.out.print("\n"+"�Ţ�ѵû�ЪҪ��ͧ���ͧ��ͧ�ѡ"+"\n"+"= ");
				String ownerIdCard = kb.next();
				
				OwnerInformation objectOwner = new OwnerInformation(ownerName,ownerAge,ownerContact,ownerAddress,ownerIdCard);
				
				ShowData.lineEnd();
				
				System.out.println("\n"+"<<�����Ţͧ���>>"+"\n");
				System.out.print("\n"+"��ͧ��ýҡ��ǡ����"+"\n"+"= ");
				
				int numberOfcats = kb.nextInt();
				
				for(int cats=1;cats <= numberOfcats;cats++)
				{
					System.out.print("\n"+"<<�����Ţͧ��ǵ�Ƿ��"+cats+">>"+"\n");
					
					System.out.print("\n"+"���ͧ͢���"+"\n"+"= ");
					String catName = kb.next();
					
					System.out.print("\n"+"���آͧ���"+"\n"+"= ");
					kb.nextLine();
					String catAge = kb.nextLine();
					
					System.out.print("\n"+"���˹ѡ�ͧ���"+"\n"+"= ");
					double catWeight = kb.nextDouble();
					
					System.out.print("\n"+"��¾ѹ���ͧ���"+"\n"+"= ");
					String catBreed = kb.next();
					
					System.out.print("\n"+"�բ��ͧ���"+"\n"+"= ");
					String catfurColor = kb.next();
					
					System.out.print("\n"+"�ä��Шӵ�Ǣͧ���"+"\n"+"= ");
					String catCongentaldisease = kb.next();
					
					System.out.print("\n"+"������˹ѧ����Ѥ�չ�ͧ���"+"\n"+"= ");
					String catVaccineBook = kb.next();
					
					CatInformation objectCat = new CatInformation(catName,catAge,catWeight,catBreed,catfurColor
							,catCongentaldisease,catVaccineBook,objectOwner);
					
					ShowData.lineEnd();
					
					while (true) 
					{
						ShowData.shomeDataRoomEmpty(dict);
						
						System.out.print("�����Ţ��ͧ���س��ͧ�������������"+"\n"+"= ");
						String roomNumber = kb.next();
						
						if(mandatoryNumberRoom.contains(roomNumber)) 
						{
							roomNumber = roomNumber;

						}else 
						{	while(true) 
							{
								System.out.println("\n"+"��سҡ�͡�����Ţ��ͧ���١��ͧ!!"+"\n");
								System.out.print("�����Ţ��ͧ���س��ͧ�������������"+"\n"+"= ");
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
							System.out.println("\n"+"��ͧ�ѧ������ռ��ͧ����!! | ��سҡ�͡�����Ţ��ͧ����ա���� "+"\n");
							continue;
						}
						
						System.out.print("\n"+"�ӹǹ�ѹ�����Ҿѡ"+"\n"+"= ");
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
				System.out.println("\n"+"�س��͡������͡�Դ!!"+" "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
				continue;
			}
		}
		


	}
	
	private static String checkErrorRoomEmptyEdit(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{
		Scanner kb = new Scanner(System.in);
		
		while (true) 
		{
			
			System.out.print("\n"+"�����Ţ��ͧ���س��ͧ�����䢢�����"+"\n"+"= ");
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
					System.out.println("\n"+"��سҡ�͡�����Ţ��ͧ���١��ͧ!!"+"\n");
					System.out.print("�����Ţ��ͧ���س��ͧ�����䢢����"+"\n"+"= ");
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
				System.out.println("\n"+"��ͧ�ѧ�������辺������!! | ��سҡ�͡�����Ţ��ͧ����ա���� "+"\n"
						+"�ҡ����ͧ��䢢�������������͡ 0 "+"\n");
				continue;
			}
			return roomNumber;
		}
		
	}
	
	private static void editDataManyOwnersInOne(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{
		Scanner kb = new Scanner(System.in);
		
		ShowData.lineEnd();
		System.out.print("\n"+"<<�к���䢢�������Ңͧ���������ͧ������>>"+"\n");
		
		ArrayList<String> manyOwner = new ArrayList<String>();
		System.out.print("\n"+"��ͧ�����䢾�����ѹ�����ͧ"+"\n"+"= ");
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
			System.out.print("\n"+"<<�к���䢢�������Ңͧ���������ͧ������>>"+"\n");
			System.out.print(
					"\n"+"��س����͡��觷���ͧ��è���䢵��������͡�ѧ���仹��" + "\n" + "1.��䢢����Ū�����Ңͧ���"
							+ "\n" + "2.��䢢�����������Ңͧ���" + "\n" + "3.��䢢����������õԴ�����Ңͧ���" + "\n"
							+ "4.��䢢����ŷ��������Ңͧ���" + "\n" + "5.��䢢������Ţ��ЪҪ���Ңͧ���" + "\n" +"0.�������ͧ��è���䢢���������"+"\n"+"= ");
			String keyEditOwner = kb.next();

			if (keyEditOwner.equals("1")) {
				
				System.out.print("\n"+"��سҡ�͡������Ңͧ��Ƿ���ͧ��è����"+"\n" + "= ");
				String ownerName = kb.next();
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setFullName(ownerName);
					dict.get(manyOwner.get(ownerI)).set(1,ownerName);
					System.out.print("\n");
				}

			} else if (keyEditOwner.equals("2")) {
				System.out.print("\n"+"��سҡ�͡������Ңͧ��Ƿ���ͧ��è����"+ "\n" + "= ");
				kb.nextLine();
				String ownerAge = kb.nextLine();
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setAge(ownerAge);
					System.out.print("\n");
				}

			} else if (keyEditOwner.equals("3")) {
				System.out.print("\n"+"��سҡ�͡����Դ�����Ңͧ��Ƿ���ͧ��è����"+ "\n" + "= ");
				String ownerContactNumber = kb.next();
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setContactNumber(ownerContactNumber);
					System.out.print("\n");
				}

			} else if (keyEditOwner.equals("4")) {
				System.out.print("\n"+"��سҡ�͡���������Ңͧ��Ƿ���ͧ��è����"+ "\n" + "= ");
				String ownerAddress = kb.next();
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setAddress(ownerAddress);
					System.out.print("\n");
				}

			} else if (keyEditOwner.equals("5")) {
				System.out.print("\n"+"��سҡ�͡�Ţ��ЪҪ���Ңͧ��Ƿ���ͧ��è����" + "\n" + "= ");
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
				System.out.println("\n"+"�س��͡������͡�Դ!!"+" "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
			}
		}
	
	}
	
	private static void editDataManyOwners(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{
		Scanner kb = new Scanner(System.in);
		
		ShowData.lineEnd();
		System.out.print("\n"+"<<�к���䢢�������Ңͧ���������ͧ>>"+"\n");
		
		ArrayList<String> manyOwner = new ArrayList<String>();
		System.out.print("\n"+"��ͧ�����䢾�����ѹ�����ͧ"+"\n"+"= ");
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
			System.out.print("\n"+"<<�к���䢢�������Ңͧ���������ͧ>>"+"\n");
			System.out.print(
					"\n"+"��س����͡��觷���ͧ��è���䢵��������͡�ѧ���仹��" + "\n" + "1.��䢢����Ū�����Ңͧ���"
							+ "\n" + "2.��䢢�����������Ңͧ���" + "\n" + "3.��䢢����������õԴ�����Ңͧ���" + "\n"
							+ "4.��䢢����ŷ��������Ңͧ���" + "\n" + "5.��䢢������Ţ��ЪҪ���Ңͧ���" + "\n" +"0.�������ͧ��è���䢢���������"+"\n"+"= ");
			String keyEditOwner = kb.next();

			if (keyEditOwner.equals("1")) {
				
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("\n"+"��سҡ�͡������Ңͧ��Ƿ���ͧ��è���䢢ͧ�����Ţ��ͧ "+manyOwner.get(ownerI)+"\n" + "= ");
					String ownerName = kb.next();
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setFullName(ownerName);
					dict.get(manyOwner.get(ownerI)).set(1,ownerName);
					System.out.print("\n");
				}

			} else if (keyEditOwner.equals("2")) {
				
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("\n"+"��سҡ�͡������Ңͧ��Ƿ���ͧ��è���䢢ͧ�����Ţ��ͧ "+manyOwner.get(ownerI)+ "\n" + "= ");
					kb.nextLine();
					String ownerAge = kb.nextLine();
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setAge(ownerAge);
					System.out.print("\n");
				}

			} else if (keyEditOwner.equals("3")) {
				
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("\n"+"��سҡ�͡����Դ�����Ңͧ��Ƿ���ͧ��è���䢢ͧ�����Ţ��ͧ "+manyOwner.get(ownerI)+ "\n" + "= ");
					String ownerContactNumber = kb.next();
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setContactNumber(ownerContactNumber);
					System.out.print("\n");
				}

			} else if (keyEditOwner.equals("4")) {
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("\n"+"��سҡ�͡���������Ңͧ��Ƿ���ͧ��è���䢢ͧ�����Ţ��ͧ "+manyOwner.get(ownerI)+ "\n" + "= ");
					String ownerAddress = kb.next();
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setAddress(ownerAddress);
					System.out.print("\n");
				}

			} else if (keyEditOwner.equals("5")) {
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("\n"+"��سҡ�͡�Ţ��ЪҪ���Ңͧ��Ƿ���ͧ��è���䢢ͧ�����Ţ��ͧ "+manyOwner.get(ownerI) + "\n" + "= ");
					String ownerIdCard = kb.next();
					((OwnerInformation) dict.get(manyOwner.get(ownerI)).get(5)).setIdCard(ownerIdCard);
					System.out.print("\n");
				}
			
			}else if(keyEditOwner.equals("0"))
			{
				System.out.print("\n");
				continuekey = false;
			} else {
				System.out.println("\n"+"�س��͡������͡�Դ!!"+" "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
			}
		}
	
	}
	
	private static void editDataManyCats(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{
		Scanner kb = new Scanner(System.in);
		
		ShowData.lineEnd();
		System.out.print("\n"+"<<�к���䢢��������Ẻ������ͧ������ѹ>>"+"\n");
		
		ArrayList<String> manyOwner = new ArrayList<String>();
		System.out.print("\n"+"��ͧ�����䢾�����ѹ�����ͧ"+"\n"+"= ");
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
			System.out.print("\n"+"<<�к���䢢��������Ẻ������ͧ������ѹ>>"+"\n");
			System.out.print(
					"\n"+"��س����͡��觷���ͧ��è���䢵��������͡�ѧ���仹��" + "\n" + "1.��䢢����Ū������"
							+ "\n" + "2.��䢢�������������" + "\n" + "3.��䢢����Ź��˹ѡ���" + "\n"
							+ "4.��䢢�������¾ѹ������" + "\n" + "5.��䢢������բ����" + "\n" 
							+"6.��䢢������ä��Шӵ�Ǣͧ���"+"\n"+"7.��䢢�����˹ѧ����Ѥ�չ���"+"\n"+"0.�������ͧ��è���䢢���������"+"\n"+"= ");
			String keyEditCat = kb.next();

			if (keyEditCat.equals("1")) {
				
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("\n"+"��سҡ�͡������Ƿ���ͧ��è���䢢ͧ�����Ţ��ͧ"+manyOwner.get(ownerI) + "\n" + "= ");
					String catName = kb.next();
					((CatInformation) dict.get(manyOwner.get(ownerI)).get(6)).setCatName(catName);
					dict.get(manyOwner.get(ownerI)).set(2,catName);
					System.out.print("\n");
				}

			} else if (keyEditCat.equals("2")) {
				
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("\n"+"��سҡ�͡������Ңͧ��Ƿ���ͧ��è���䢢ͧ�����Ţ��ͧ "+manyOwner.get(ownerI) + "\n" + "= ");
					kb.nextLine();
					String catAge = kb.nextLine();
					((CatInformation) dict.get(manyOwner.get(ownerI)).get(6)).setCatAge(catAge);
					System.out.print("\n");
				}

			} else if (keyEditCat.equals("3")) {
				
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("��سҡ�͡������Ңͧ��Ƿ���ͧ��è���䢢ͧ�����Ţ��ͧ "+manyOwner.get(ownerI) + "\n" + "= ");
					double catWeight = kb.nextDouble();
					((CatInformation) dict.get(manyOwner.get(ownerI)).get(6)).setWeight(catWeight);
					System.out.print("\n");
				}

			} else if (keyEditCat.equals("4")) {
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("��سҡ�͡��¾ѹ�����Ƿ���ͧ��è���䢢ͧ�����Ţ��ͧ "+manyOwner.get(ownerI) + "\n" + "= ");
					String catBreed = kb.next();
					((CatInformation) dict.get(manyOwner.get(ownerI)).get(6)).setBreed(catBreed);
					System.out.print("\n");
				}

			} else if (keyEditCat.equals("5")) {
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("��سҡ�͡�բ���Ƿ���ͧ��è���䢢ͧ�����Ţ��ͧ "+manyOwner.get(ownerI) + "\n" + "= ");
					String catFurColor = kb.next();
					((CatInformation) dict.get(manyOwner.get(ownerI)).get(6)).setFurColor(catFurColor);
					System.out.print("\n");
				}
			
			}else if (keyEditCat.equals("6")) {
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("��سҡ�͡�ä��Шӵ�Ǣͧ��Ƿ���ͧ��è���䢢ͧ�����Ţ��ͧ "+manyOwner.get(ownerI) + "\n" + "= ");
					String catCongenitalDisease = kb.next();
					((CatInformation) dict.get(manyOwner.get(ownerI)).get(6)).setCongenitalDisease(catCongenitalDisease);
					System.out.print("\n");
				}
			
			}else if (keyEditCat.equals("7")) {
				
				for(int ownerI = 0;ownerI < manyOwner.size();ownerI++)
				{
					System.out.print("��سҡ�͡˹ѧ����Ѥ�չ��Ƿ���ͧ��è���䢢ͧ�����Ţ��ͧ "+manyOwner.get(ownerI) + "\n" + "= ");
					String catCatVaccineBook = kb.next();
					((CatInformation) dict.get(manyOwner.get(ownerI)).get(6)).setCatVaccineBook(catCatVaccineBook);
					System.out.print("\n");
				}
			
			}else if(keyEditCat.equals("0"))
			{
				System.out.print("\n");
				continuekey = false;
			} else {
				System.out.println("\n"+"�س��͡������͡�Դ!!"+" "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
			}
		}
	
	}
	
	public static void editDataSimple(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{

		while(true)
		{
			Scanner kb = new Scanner(System.in);
			ShowData.lineEnd();
			System.out.print("\n"+"<<�к���䢢����Ţͧ��ͧ�ѡ�������>>"+"\n");
			System.out.println("\n"+"��س����͡��觷���ͧ��è���䢵��������͡�ѧ���仹��" + "\n"+"\n" + "1.��䢢�������Ңͧ���"
					+ " | " + "2.��䢢��������" + "\n" + "3.��䢢�������ͧ"+" | " +"0.��ش��÷ӧҹ�ͧ�����䢢�����");
			System.out.print("= ");
			String key = kb.next();

			
			//��䢢�������Ңͧ���
			if (key.equals("1")) {
				
				System.out.print("\n"+"<<�к���䢢�������Ңͧ���>>"+"\n");
				System.out.print("\n"+"��س����͡��觷���ͧ��è���䢵��������͡�ѧ���仹��" + "\n"+"\n" 
				+ "1.��䢢�������Ңͧ���Ẻ��ͧ����"+ " | " + "2.��䢢�������Ңͧ���Ẻ������ͧ������ѹ" + " | "+"3.��䢢�������Ңͧ���Ẻ������ͧ������ѹ������" + "\n"+"= ");
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
						System.out.print("\n"+"<<�к���䢢�������Ңͧ���Ẻ��ͧ����>>"+"\n");
						System.out.print(
								"\n"+"��س����͡��觷���ͧ��è���䢵��������͡�ѧ���仹��" + "\n" + "1.��䢢����Ū�����Ңͧ���"
										+ "\n" + "2.��䢢�����������Ңͧ���" + "\n" + "3.��䢢����������õԴ�����Ңͧ���" + "\n"
										+ "4.��䢢����ŷ��������Ңͧ���" + "\n" + "5.��䢢������Ţ��ЪҪ���Ңͧ���" + "\n" +"0.�������ͧ��è���䢢���������"+"\n"+"= ");
						String keyEditOwner = kb.next();

						if (keyEditOwner.equals("1")) {
							System.out.print("��سҡ�͡������Ңͧ��Ƿ���ͧ��è����" + "\n" + "= ");
							String ownerName = kb.next();
							((OwnerInformation) dict.get(numberRoom).get(5)).setFullName(ownerName);
							dict.get(numberRoom).set(1,ownerName);
							System.out.print("\n");

						} else if (keyEditOwner.equals("2")) {
							System.out.print("��سҡ�͡������Ңͧ��Ƿ���ͧ��è����" + "\n" + "= ");
							kb.nextLine();
							String ownerAge = kb.nextLine();
							((OwnerInformation) dict.get(numberRoom).get(5)).setAge(ownerAge);
							System.out.print("\n");

						} else if (keyEditOwner.equals("3")) {
							System.out.print("��سҡ�͡����Դ�����Ңͧ��Ƿ���ͧ��è����" + "\n" + "= ");
							String ownerContactNumber = kb.next();
							((OwnerInformation) dict.get(numberRoom).get(5)).setContactNumber(ownerContactNumber);
							System.out.print("\n");

						} else if (keyEditOwner.equals("4")) {
							System.out.print("��سҡ�͡���������Ңͧ��Ƿ���ͧ��è����" + "\n" + "= ");
							String ownerAddress = kb.next();
							((OwnerInformation) dict.get(numberRoom).get(5)).setAddress(ownerAddress);
							System.out.print("\n");

						} else if (keyEditOwner.equals("5")) {
							System.out.print("��سҡ�͡�Ţ��ЪҪ���Ңͧ��Ƿ���ͧ��è����" + "\n" + "= ");
							String ownerIdCard = kb.next();
							((OwnerInformation) dict.get(numberRoom).get(5)).setIdCard(ownerIdCard);
							System.out.print("\n");
						
						}else if(keyEditOwner.equals("0"))
						{
							System.out.print("\n");
							break;
						} else {
							System.out.println("\n"+"�س��͡������͡�Դ!!"+" "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
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
					System.out.println("\n"+"�س��͡������͡�Դ!!"+" "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
				}
					
			//��䢢��������
			} else if (key.equals("2")) {
				
				System.out.print("\n"+"<<�к���䢢��������>>"+"\n");
				System.out.print("\n"+"��س����͡��觷���ͧ��è���䢵��������͡�ѧ���仹��" + "\n"+"\n" 
				+ "1.��䢢��������Ẻ��ͧ����"+ " | " + "2.��䢢��������Ẻ������ͧ������ѹ"+ "\n"+"= ");
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
						System.out.print("\n"+"<<�к���䢢��������Ẻ��ͧ����>>"+"\n");
						System.out.print(
								"\n"+"��س����͡��觷���ͧ��è���䢵��������͡�ѧ���仹��" + "\n" + "1.��䢢����Ū������"
										+ "\n" + "2.��䢢�������������" + "\n" + "3.��䢢����Ź��˹ѡ���" + "\n"
										+ "4.��䢢�������¾ѹ������" + "\n" + "5.��䢢������բ����" + "\n" 
										+"6.��䢢������ä��Шӵ�Ǣͧ���"+"\n"+"7.��䢢�����˹ѧ����Ѥ�չ���"+"\n"+"0.�������ͧ��è���䢢���������"+"\n"+"= ");
						String keyEditCat = kb.next();

						if (keyEditCat.equals("1")) {
							System.out.print("��سҡ�͡������Ƿ���ͧ��è����" + "\n" + "= ");
							String catName = kb.next();
							((CatInformation) dict.get(numberRoom).get(6)).setCatName(catName);
							dict.get(numberRoom).set(2,catName);
							System.out.print("\n");

						} else if (keyEditCat.equals("2")) {
							System.out.print("��سҡ�͡������Ңͧ��Ƿ���ͧ��è����" + "\n" + "= ");
							kb.nextLine();
							String catAge = kb.nextLine();
							((CatInformation) dict.get(numberRoom).get(6)).setCatAge(catAge);
							System.out.print("\n");
							
						} else if (keyEditCat.equals("3")) {
							System.out.print("��سҡ�͡������Ңͧ��Ƿ���ͧ��è����" + "\n" + "= ");
							double catWeight = kb.nextDouble();
							((CatInformation) dict.get(numberRoom).get(6)).setWeight(catWeight);
							System.out.print("\n");

						} else if (keyEditCat.equals("4")) {
							System.out.print("��سҡ�͡��¾ѹ�����Ƿ���ͧ��è����" + "\n" + "= ");
							String catBreed = kb.next();
							((CatInformation) dict.get(numberRoom).get(6)).setBreed(catBreed);
							System.out.print("\n");

						} else if (keyEditCat.equals("5")) {
							System.out.print("��سҡ�͡�բ���Ƿ���ͧ��è����" + "\n" + "= ");
							String catFurColor = kb.next();
							((CatInformation) dict.get(numberRoom).get(6)).setFurColor(catFurColor);
							System.out.print("\n");
						
						}else if (keyEditCat.equals("6")) {
							System.out.print("��سҡ�͡�ä��Шӵ�Ǣͧ��Ƿ���ͧ��è����" + "\n" + "= ");
							String catCongenitalDisease = kb.next();
							((CatInformation) dict.get(numberRoom).get(6)).setCongenitalDisease(catCongenitalDisease);
							System.out.print("\n");
						
						}else if (keyEditCat.equals("7")) {
							System.out.print("��سҡ�͡˹ѧ����Ѥ�չ��Ƿ���ͧ��è����" + "\n" + "= ");
							String catCatVaccineBook = kb.next();
							((CatInformation) dict.get(numberRoom).get(6)).setCatVaccineBook(catCatVaccineBook);
							System.out.print("\n");
						
						}else if(keyEditCat.equals("0"))
						{
							System.out.print("\n");
							break;
						} else {
							System.out.println("\n"+"�س��͡������͡�Դ!!"+" "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
						}
					}
				}else if (key2.equals("2")) 
				{
					editDataManyCats(dict, mandatoryNumberRoom);
				}else {
					System.out.println("\n"+"�س��͡������͡�Դ!!"+" "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
				}
				

				
			//��䢢�������ͧ
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
					System.out.print("\n"+"<<�к���䢢�������ͧVipRoom>>"+"\n");
					System.out.print(
							"\n"+"��س����͡��觷���ͧ��è���䢵��������͡�ѧ���仹��" + "\n" + "1.��䢢�������Ҿѡ����ѹ"
									+ "\n" +"0.�������ͧ��è���䢢���������"+"\n"+"= ");
					String keyEditCat = kb.next();

					if (keyEditCat.equals("1")) {
						System.out.print("��سҡ�͡�ӹǹ�ѹ�����Ҿѡ����ͧ��è����" + "\n" + "= ");
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
						System.out.println("\n"+"�س��͡������͡�Դ!!"+" "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
					}
				}
				
				while (numberRoom.equals("11") || numberRoom.equals("12") || numberRoom.equals("13") || numberRoom.equals("14") ||
						numberRoom.equals("15") || numberRoom.equals("16") || numberRoom.equals("17") || numberRoom.equals("18") ||
						numberRoom.equals("19") || numberRoom.equals("20")) 
				{
					ShowData.lineEnd();
					System.out.print("\n"+"<<�к���䢢�������ͧStandardRoom>>"+"\n");
					System.out.print(
							"\n"+"��س����͡��觷���ͧ��è���䢵��������͡�ѧ���仹��" + "\n" + "1.��䢢������Ţ��ͧ"
									+ "\n" +"0.�������ͧ��è���䢢���������"+"\n"+"= ");
					String keyEditCat = kb.next();

					if (keyEditCat.equals("1")) {
						
						System.out.print("��سҡ�͡�ӹǹ�ѹ�����Ҿѡ����ͧ��è����" + "\n" + "= ");
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
						System.out.println("\n"+"�س��͡������͡�Դ!!"+" "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
					}
				}
			
			//��ش��÷ӧҹ�ͧ�����䢢�����
			} else if(key.equals("0")) 
			{
				System.out.print("\n");
				break;
				
			}else {
				System.out.println("\n"+"�س��͡������͡�Դ!!"+" "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
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
			System.out.print("\n"+"��ͧ���ź��������ͧ�����Ţ����"+"\n"+"= ");
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
					System.out.print("\n"+"�к���ӡ��ź�����Ţͧ��ͧ�����Ţ "+numbeRoom+" ���º��������"+"\n");
					
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
					System.out.println("\n"+"��سҡ�͡�����Ţ��ͧ���١��ͧ!!"+"\n");
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
			System.out.print("\n"+"��ͧ���ź�������ա�������? | ��͡Y����͵�ͧ��÷ӡ���礵�� ��͡N����͵�ͧ����͡�ҡ�����"+"\n"+"= ");
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
					System.out.println("\n"+"�س��͡������͡�Դ!!"+" | "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
					continue;
				}
			}
		}
		return leavekey;
	}
	
}
