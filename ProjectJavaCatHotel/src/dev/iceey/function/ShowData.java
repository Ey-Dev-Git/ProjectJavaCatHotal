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
		System.out.println("<<�����Ţ��ͧ����ѧ��ҧ����>>"+"\n");
		
		

		for(int numberOfRooms = 1 ; numberOfRooms <= dict.size();numberOfRooms++ ) 
		{
			String roomnumber = "";
			if(numberOfRooms<=9) 
			{
				roomnumber = "0"+numberOfRooms;
				if(numberOfRooms == 1) 
				{
					System.out.print("\n"+"��ͧVipRoom"+"\n"+"\n"+"��ͧ�����Ţ : ");
				}
				
				if(dict.get(roomnumber).size() == 0)
				{
					System.out.print(roomnumber+",");
					
				}

			}else if(numberOfRooms<=20)
			{
				if(numberOfRooms == 11) 
				{
					System.out.print("\n"+"\n"+"��ͧStandardRoom"+"\n"+"\n"+"��ͧ�����Ţ : ");
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
				System.out.print("��������ͧ�����Ţ "+roomnumber+" VipRoom"+" : ");
			}else if(numberOfRooms<=20)
			{
				if(numberOfRooms == 10) 
				{
					roomnumber = roomnumber+numberOfRooms;
					System.out.print("��������ͧ�����Ţ "+roomnumber+" VipRoom"+" : ");
				}
				else 
				{
					roomnumber = roomnumber+numberOfRooms;
					System.out.print("��������ͧ�����Ţ "+roomnumber+" StandardRoom"+" : ");	
				}
				
			}
			
			for(int dataNumber = 0;dataNumber<=4;dataNumber++) 
			{
				if(dict.get(roomnumber).size() != 0) 
				{
					if(dataNumber == 0) 
					{
						System.out.print("�����Ţ��ͧ = "+dict.get(roomnumber).get(dataNumber)+" | ");
					}else if(dataNumber == 1) 
					{
						System.out.print("���ͧ͢��Ңͧ��ͧ = "+dict.get(roomnumber).get(dataNumber)+" | ");

					}else if(dataNumber == 2) 
					{
						System.out.print("��ͧ͢������ͧ = "+dict.get(roomnumber).get(dataNumber)+" | ");

					}else if(dataNumber == 3) 
					{
						System.out.print("�ӹҹ�ѹ�����Ҿѡ = "+dict.get(roomnumber).get(dataNumber)+" �ѹ"+" | ");
						
					}else if(dataNumber == 4) 
					{
						System.out.println("�Ҥ��������ͧ���� = "+dict.get(roomnumber).get(dataNumber)+" �ҷ");
					}
					
					else 
					{
						System.out.println("error!!");
					}
					
				}else if(dict.get(roomnumber).size() == 0 && dataNumber==0)
				{
					System.out.println("�ѧ��ҧ����");
				}
				
			}
		}
	}
	
	public static void showmeDataOwnerInof(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("\n"+"��ͧ����ʴ������Ţͧ��Ңͧ��ͧ�����Ţ����"+"\n"+"= ");
		String numbeRoomKey= kb.next();
		

		if(mandatoryNumberRoom.contains(numbeRoomKey)) 
		{
			numbeRoomKey = numbeRoomKey;

		}else 
			{while(true) 
			{
				System.out.println("��سҡ�͡�����Ţ��ͧ���١��ͧ!!"+"\n");
				System.out.print("\n"+"��ͧ����ʴ������Ţͧ��Ңͧ��ͧ�����Ţ����"+"\n"+"= ");
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
			System.out.print("\n"+"��辺������"+"\n");
		}
	}
	
	public static void showmeDataCatInof(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("��ͧ����ʴ������Ţͧ��Ǣͧ��ͧ�����Ţ����"+"\n"+"= ");
		String numbeRoomKey= kb.next();
		

		if(mandatoryNumberRoom.contains(numbeRoomKey)) 
		{
			numbeRoomKey = numbeRoomKey;

		}else 
			{while(true) 
			{
				System.out.println("��سҡ�͡�����Ţ��ͧ���١��ͧ!!"+"\n");
				System.out.print("��ͧ����ʴ������Ţͧ��Ǣͧ��ͧ�����Ţ����"+"\n"+"= ");
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
			System.out.print("\n"+"��辺������"+"\n");
		}
	}
	
	public static void showmeDataRoomInof(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("\n"+"��ͧ����ʴ������Ţͧ��ͧ�����Ţ����"+"\n"+"= ");
		String numbeRoomKey= kb.next();
		

		if(mandatoryNumberRoom.contains(numbeRoomKey)) 
		{
			numbeRoomKey = numbeRoomKey;

		}else 
		{	while(true) 
			{
				System.out.println("��سҡ�͡�����Ţ��ͧ���١��ͧ!!"+"\n");
				System.out.print("\n"+"��ͧ����ʴ������Ţͧ��ͧ�����Ţ����"+"\n"+"= ");
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
			System.out.print("\n"+"��辺������"+"\n");
		}
	}
	private static void showDataRoom(HashMap<String, ArrayList<Object>> dict,ArrayList<String> numberVipRoom,ArrayList<String> numberStandardRoom,ArrayList<String> mandatoryNumberRoom)
	{
		Scanner kb = new Scanner(System.in);
		while (true) 
		{
			System.out.print("\n"+"1.��ʶҹ���ͧ�ѡ������"+" | "+"2.��ʶҹ���ͧ�ѡẺVipRoom������"+" | "
					+"3.��ʶҹ���ͧ�ѡẺStandardRoom������"+" | "+"4.�礢����Ţͧ��ͧ�ѡẺ�к������Ţ��ͧ"+"\n"+"= ");
			String mainKey2 = kb.next();
			if(mainKey2.equals("1")) 
			{
				System.out.print("\n"+"<<�к���ʶҹ���ͧ�ѡ������>>"+"\n");
				showDataSimple(dict);
				lineEnd();
				break;
				
			}else if(mainKey2.equals("2"))
			{
				System.out.print("\n"+"<<�к���ʶҹ���ͧ�ѡẺVipRoom������>>"+"\n");
				System.out.print("\n");
				for(int numberOfRooms = 1 ; numberOfRooms <= numberVipRoom.size();numberOfRooms++ ) 
				{
					String roomnumber = "";
					if(numberOfRooms<=10) 
					{
						if(numberOfRooms == 10) 
						{
							roomnumber = roomnumber+numberOfRooms;
							System.out.print("��������ͧ�����Ţ "+roomnumber+" VipRoom"+" : ");
						}else 
						{
							roomnumber = "0"+numberOfRooms;
							System.out.print("��������ͧ�����Ţ "+roomnumber+" VipRoom"+" : ");
						}
					}
					for(int dataNumber = 0;dataNumber<=4;dataNumber++) 
					{
						if(dict.get(roomnumber).size() != 0) 
						{
							if(dataNumber == 0) 
							{
								System.out.print("�����Ţ��ͧ = "+dict.get(roomnumber).get(dataNumber)+" | ");
							}else if(dataNumber == 1) 
							{
								System.out.print("���ͧ͢��Ңͧ��ͧ = "+dict.get(roomnumber).get(dataNumber)+" | ");

							}else if(dataNumber == 2) 
							{
								System.out.print("��ͧ͢������ͧ = "+dict.get(roomnumber).get(dataNumber)+" | ");

							}else if(dataNumber == 3) 
							{
								System.out.print("�ӹҹ�ѹ�����Ҿѡ = "+dict.get(roomnumber).get(dataNumber)+" �ѹ"+" | ");
								
							}else if(dataNumber == 4) 
							{
								System.out.println("�Ҥ��������ͧ���� = "+dict.get(roomnumber).get(dataNumber)+" �ҷ");
							}
							
							else 
							{
								System.out.println("error!!");
							}
							
						}else if(dict.get(roomnumber).size() == 0 && dataNumber==0)
						{
							System.out.println("�ѧ��ҧ����");
						}
						
					}
				
				}lineEnd();
				break;
			}else if(mainKey2.equals("3"))
			{
				System.out.print("\n"+"<<�к���ʶҹ���ͧ�ѡẺStandardRoom������>>"+"\n");
				System.out.print("\n");
				for(int numberOfRooms = 11 ; numberOfRooms <= 20;numberOfRooms++ ) 
				{
					String roomnumber = "";
					roomnumber = roomnumber+numberOfRooms;
					System.out.print("��������ͧ�����Ţ "+roomnumber+" StandardRoom"+" : ");
					
					for(int dataNumber = 0;dataNumber<=4;dataNumber++) 
					{
						if(dict.get(roomnumber).size() != 0) 
						{
							if(dataNumber == 0) 
							{
								System.out.print("�����Ţ��ͧ = "+dict.get(roomnumber).get(dataNumber)+" | ");
							}else if(dataNumber == 1) 
							{
								System.out.print("���ͧ͢��Ңͧ��ͧ = "+dict.get(roomnumber).get(dataNumber)+" | ");

							}else if(dataNumber == 2) 
							{
								System.out.print("��ͧ͢������ͧ = "+dict.get(roomnumber).get(dataNumber)+" | ");

							}else if(dataNumber == 3) 
							{
								System.out.print("�ӹҹ�ѹ�����Ҿѡ = "+dict.get(roomnumber).get(dataNumber)+" �ѹ"+" | ");
								
							}else if(dataNumber == 4) 
							{
								System.out.println("�Ҥ��������ͧ���� = "+dict.get(roomnumber).get(dataNumber)+" �ҷ");
							}
							
							else 
							{
								System.out.println("error!!");
							}
							
						}else if(dict.get(roomnumber).size() == 0 && dataNumber==0)
						{
							System.out.println("�ѧ��ҧ����");
						}
						
					}
					
				}lineEnd();break;
			}else if(mainKey2.equals("4")) 
			{
				System.out.print("\n"+"<<�к��礢����Ţͧ��ͧ�ѡẺ�к������Ţ��ͧ>>"+"\n");
				showmeDataRoomInof(dict,mandatoryNumberRoom);
				lineEnd();
				break;
			}else 
			{
				System.out.println("\n"+"�س��͡������͡�Դ!!"+" | "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
				continue;
			}
		}
	}
	
	private static void showDataOnwerAndCatInfo(HashMap<String, ArrayList<Object>> dict,ArrayList<String> mandatoryNumberRoom) 
	{
		Scanner kb = new Scanner(System.in);
		while (true) 
		{
			System.out.print("\n"+"1.�礢����Ţͧ��Ңͧ��ͧ"+" | "+"2.�礢����Ţͧ���"+"\n"+"= ");
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
				System.out.println("\n"+"�س��͡������͡�Դ!!"+" | "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
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
			System.out.print("\n"+"<<�к���ʶҹ���ͧ�ѡ��Т���������>>"+"\n");
			System.out.print("\n"+"1.��ʶҹ���ͧ�ѡ"+" | "+"2.�礢����Ţͧ�����Ҿѡ"+"\n"+"= ");
			
			String mainKey1 = kb.next();
			if(mainKey1.equals("1"))
			{
				lineEnd();
				System.out.print("\n"+"<<�к�����ʶҹ���ͧ�ѡ>>"+"\n");
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
				System.out.print("\n"+"<<�礢����Ţͧ�����Ҿѡ>>"+"\n");
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
				System.out.println("\n"+"�س��͡������͡�Դ!!"+" | "+"��سҡ�͡������͡�������������ҹ��!!"+"\n");
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
			System.out.print("\n"+"��ͧ��÷ӡ����ʶҹ���ͧ�ѡ��Т������������ա�������? | ��͡Y����͵�ͧ��÷ӡ���礵�� ��͡N����͵�ͧ����͡�ҡ�����"+"\n"+"= ");
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
