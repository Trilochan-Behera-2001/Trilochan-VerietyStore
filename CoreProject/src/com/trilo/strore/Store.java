package com.trilo.strore;

import java.util.Scanner;

public class Store {
	
	
		static int count,addAll=0,sumAdd;
		double percentAdd;
		
		static int s_no[]=new int[20];
		
		static int price[]=new int[20];
		
		static int quantity[]=new int[20];

		static String productArr[]=new String[20];
		
		static int i;
		static int counting=-1;
		
		int store() {
				System.out.println("--------------------------------------");
				System.out.println("|         1)Fruits                   |");
				System.out.println("|         2)Vegetables               |");
				System.out.println("|         3)Cosmetics                |");
				System.out.println("|         4)Masala Powders           |");
				System.out.println("|         5)Exit                     |");
				System.out.println("--------------------------------------");
				Scanner sc = new Scanner(System.in);
				System.out.println("Please choose your option:");
					int x=sc.nextInt();
					return x;
			}
		int fruits() {
			while(true) {
			System.out.println("--------------------------------------");
			System.out.println("|   101)Mango------------1kg---Rs.200--|");
			System.out.println("|   102)Apple------------1kg---Rs.250--|");
			System.out.println("|   103)Banana-----------1kg----Rs.50--|");
			System.out.println("|   104)Pineapple--------1kg----Rs.70--|");
			System.out.println("|   105)Papaya-----------1kg----Rs.60--|");
			System.out.println("--------------------------------------");
			System.out.println("Please choose your product code:");
			Scanner sc = new Scanner(System.in);
			int x=sc.nextInt();
				switch(x) {
				case 101:
					System.out.println("How many kgs do you need?");
					int mangoC=sc.nextInt();
					quantity[i]=mangoC;
					price[i]=mangoC*200;
					addAll+=mangoC*200; //addAll=addAll+mangoC*200
					productArr[i]="mango";
					s_no[i]=++count;
					i++;
					break;
				case 102:
					System.out.println("How many kgs do you need?");
					int apple=sc.nextInt();
					quantity[i]=apple;
					price[i]=apple*250;
					addAll+=apple*250;
					productArr[i]="apple";
					s_no[i]=++count;
					i++;
					break;
				case 103:
					System.out.println("How many kgs do you need?");
					int Banana=sc.nextInt();
					quantity[i]=Banana;
					price[i]=Banana*50;
					addAll+=Banana*50;
					s_no[i]=++count;
					productArr[i]="Banana";
					i++;
					break;
				case 104:
					System.out.println("How many kgs do you need?");
					int Pineapple=sc.nextInt();
					quantity[i]=Pineapple;
					price[i]=Pineapple*70;
					addAll+=Pineapple*70;
					s_no[i]=++count;
					productArr[i]="Pineapple";
					i++;
					break;
				case 105:
					System.out.println("How many kgs do you need?");
					int Papaya=sc.nextInt();
					quantity[i]=Papaya;
					price[i]=Papaya*60;
					addAll+=Papaya*60;
					s_no[i]=++count;
					productArr[i]="Papaya";
					i++;
					break;
				default:
					System.out.println("----X---Invalid Number---X----");
					continue;
				}
				while(true) {
					System.out.println("Press 1 to continue Shopping");
					System.out.println("Press 2 for exit from Shopping");
					int z=sc.nextInt();
						switch(z) {
						case 1:
							return z;
						case 2:
							return z;
						default :
							System.out.println("----X---Invalid Number---X----");
							continue;
						}
				}
			}
		}
		
		int vegetables() {
			while(true){
			System.out.println("--------------------------------------");
			System.out.println("|   201)Tomato------------1kg-------Rs.60--|");
			System.out.println("|   202)Spinach-----------1Bundle---Rs.20--|");
			System.out.println("|   203)Beetroot----------1kg-------Rs.50--|");
			System.out.println("|   204)Potato------------1kg-------Rs.35--|");
			System.out.println("|   205)Brinjal-----------1kg-------Rs.45--|");
			System.out.println("--------------------------------------");
			System.out.println("Please choose your product code:");
			Scanner sc = new Scanner(System.in);
			int x=sc.nextInt();
				switch(x) {
				case 201:
					System.out.println("How many kgs do you need?");
					int tomato=sc.nextInt();
					quantity[i]=tomato;
					price[i]=tomato*60;
					addAll+=tomato*200;
					productArr[i]="tomato";
					s_no[i]=++count;
					i++;
					break;
				case 202:
					System.out.println("How many bundle do you need?");
					int spinach=sc.nextInt();
					quantity[i]=spinach;
					price[i]=spinach*20;
					addAll+=spinach*20;
					productArr[i]="spinach";
					s_no[i]=++count;
					i++;
					break;
				case 203:
					System.out.println("How many kgs do you need?");
					int Beetroot=sc.nextInt();
					quantity[i]=Beetroot;
					price[i]=Beetroot*50;
					addAll+=Beetroot*50;
					productArr[i]="Beetroot";
					s_no[i]=++count;
					i++;
					break;
				case 204:
					System.out.println("How many kgs do you need?");
					int Potato=sc.nextInt();
					quantity[i]=Potato;
					price[i]=Potato*35;
					addAll+=Potato*35;
					productArr[i]="Potato";
					s_no[i]=++count;
					i++;
					break;
				case 205:
					System.out.println("Papaya . How many kgs do you need?");
					int Brinjal=sc.nextInt();
					quantity[i]=Brinjal;
					price[i]=Brinjal*45;
					addAll+=Brinjal*45;
					productArr[i]="Brinjal";
					s_no[i]=++count;
					i++;
					break;
				default:
					System.out.println("----X---Invalid Number---X----");
					continue;
				}
				while(true){
				System.out.println("Press 1 to continue Shopping");
				System.out.println("Press 2 for exit from Shopping");
				int z=sc.nextInt();
				int abz=z;
					switch(z) {
					case 1:
						return z;
					case 2:
						return z;
					default :
						System.out.println("----X---Invalid Number---X----");
						continue;
				}
				
				}
			}
		}
		
		int cosmetics() {
			while(true) {
				System.out.println("--------------------------------------");
				System.out.println("|   301)Kajal------------1----Rs.50--|");
				System.out.println("|   302)Lip stick--------1----Rs.20--|");
				System.out.println("|   303)Nail polish------1----Rs.30--|");
				System.out.println("|   304)Face Powder------1----Rs.70--|");
				System.out.println("|   305)Lotion-----------1----Rs.120--|");
				System.out.println("--------------------------------------");
				System.out.println("Please choose your product code:");
				Scanner sc = new Scanner(System.in);
				int x=sc.nextInt();
					switch(x) {
					case 301:
						System.out.println("How many quantity do you need?");
						int Kajal=sc.nextInt();
						quantity[i]=Kajal;
						price[i]=Kajal*50;
						addAll+=Kajal*50; //addAll=addAll+mangoC*200
						productArr[i]="Kajal";
						s_no[i]=++count;
						i++;
						break;
					case 302:
						System.out.println("How many quantity do you need?");
						int lip=sc.nextInt();
						quantity[i]=lip;
						price[i]=lip*20;
						addAll+=lip*20;
						productArr[i]="Lip stick";
						s_no[i]=++count;
						i++;
						break;
					case 303:
						System.out.println("How many quantity do you need?");
						int polish=sc.nextInt();
						quantity[i]=polish;
						price[i]=polish*30;
						addAll+=polish*30;
						s_no[i]=++count;
						productArr[i]="Nail polish";
						i++;
						break;
					case 304:
						System.out.println("How many quantity do you need?");
						int powder=sc.nextInt();
						quantity[i]=powder;
						price[i]=powder*70;
						addAll+=powder*70;
						s_no[i]=++count;
						productArr[i]="Face powder";
						i++;
						break;
					case 305:
						System.out.println("How many quantity do you need?");
						int lotion=sc.nextInt();
						quantity[i]=lotion;
						price[i]=lotion*60;
						addAll+=lotion*50;
						s_no[i]=++count;
						productArr[i]="Lotion";
						i++;
						break;
					default:
						System.out.println("----X---Invalid Number---X----");
						continue;
					}
					while(true) {
						System.out.println("Press 1 to continue Shopping");
						System.out.println("Press 2 for exit from Shopping");
						int z=sc.nextInt();
							switch(z) {
							case 1:
								return z;
							case 2:
								return z;
							default :
								System.out.println("----X---Invalid Number---X----");
								continue;
							}
					}
				}
		}
		
		int masala() {
			while(true) {
				System.out.println("--------------------------------------");
				System.out.println("|   401)Turmeric Powder-----1kg----Rs.330--|");
				System.out.println("|   402)Garam Masala--------1kg----Rs.600--|");
				System.out.println("|   403)Sambar Powder-------1kg----Rs.360--|");
				System.out.println("|   404)Ginger Powder-------1kg----Rs.350--|");
				System.out.println("|   405)Chicken Masala------1kg----Rs.370--|");
				System.out.println("--------------------------------------");
				System.out.println("Please choose your product code:");
				Scanner sc = new Scanner(System.in);
				int x=sc.nextInt();
					switch(x) {
					case 401:
						System.out.println("How many kgs do you need?");
						int turmeric=sc.nextInt();
						quantity[i]=turmeric;
						price[i]=turmeric*330;
						addAll+=turmeric*330; //addAll=addAll+mangoC*200
						productArr[i]="Turmeric Pow.";
						s_no[i]=++count;
						i++;
						break;
					case 402:
						System.out.println("How many kgs do you need?");
						int garam=sc.nextInt();
						quantity[i]=garam;
						price[i]=garam*600;
						addAll+=garam*600;
						productArr[i]="Garam Masala";
						s_no[i]=++count;
						i++;
						break;
					case 403:
						System.out.println("How many kgs do you need?");
						int sambar=sc.nextInt();
						quantity[i]=sambar;
						price[i]=sambar*360;
						addAll+=sambar*360;
						s_no[i]=++count;
						productArr[i]="Sambar Pow.";
						i++;
						break;
					case 404:
						System.out.println("How many kgs do you need?");
						int ginger=sc.nextInt();
						quantity[i]=ginger;
						price[i]=ginger*350;
						addAll+=ginger*350;
						s_no[i]=++count;
						productArr[i]="Ginger Pow.";
						i++;
						break;
					case 405:
						System.out.println("How many kgs do you need?");
						int chicken=sc.nextInt();
						quantity[i]=chicken;
						price[i]=chicken*370;
						addAll+=chicken*370;
						s_no[i]=++count;
						productArr[i]="Chicken Masala";
						i++;
						break;
					default:
						System.out.println("----X---Invalid Number---X----");
						continue;
					}
					while(true) {
						System.out.println("Press 1 to continue Shopping");
						System.out.println("Press 2 for exit from Shopping");
						int z=sc.nextInt();
							switch(z) {
							case 1:
								return z;
							case 2:
								return z;
							default :
								System.out.println("----X---Invalid Number---X----");
								continue;
							}
					}
				}
		}
		
		void sumOfAll() {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter your name:");
			String x=sc.next();
			System.out.print("Enter your address:");
			String y=sc.next();
			System.out.print("Enter your contact no:");
			long z=sc.nextLong();
			System.out.println("--------------------------------------");
			System.out.println("-------WELCOME TO TRILOCHAN VERIETY STORE-----");
			System.out.println("---------------------------------------");
			System.out.println("S.no   |   Qty  | Name                | Price");
			System.out.println("-----------------------------------------------");
			for(int k=0;k<count;k++) {
				System.out.printf("%d          %-2d     %-20s   %-6d\n",s_no[k],quantity[k],productArr[k],price[k]);
			} 
			System.out.println("------------------------------------------");
			System.out.println("Total bill of purchased items:      "+addAll);
			if(addAll>500) {
				percentAdd=addAll*0.05;
				addAll-=percentAdd;
				System.out.println("you received a discount of 5% : "+percentAdd);
			}
			System.out.println("FINAL BILL IS:                      "+addAll);
			System.out.println("=====THANKYOU FOR SHOPPING YOU SAVED RS."+percentAdd+"======");
			System.out.println("------------------------------------------------");
			System.out.println("Billed Entered By::");
			System.out.println("NAME :"+x);
			System.out.println("ADDRESS: "+y);
			System.out.println("CONTACT NO. :"+z);
			System.out.println("================JAVA IS AWESOME===============");
			
	}
		
		public static void main(String[] args) {
			System.out.println("--------------------------------------");
			System.out.println("-------WELCOME TO TRILOCHAN VERIETY STORE-----");
			Store objStore=new Store();
			int x=0;
			while(x<10) {
				x=objStore.store();
				if(x==1) {
					int val=objStore.fruits();
					if(val==1) {
						continue;
					}
					if(val==2) {
						objStore.sumOfAll();
						return;
					}
				}
				else if(x==2) {
					int reu=objStore.vegetables();
					if(reu==1) {
						continue;
					}
					if(reu==2) {
						objStore.sumOfAll();
						return;
					}
					
				}
				else if(x==3) {
					int reu=objStore.cosmetics();
					if(reu==1) {
						continue;
					}
					if(reu==2) {
						objStore.sumOfAll();
						return;
					}
					
				}
				else if(x==4) {
					int reu=objStore.masala();
					if(reu==1) {
						continue;
					}
					if(reu==2) {
						objStore.sumOfAll();
						return;
					}
					
				}
				
				else if(x==5 && count>0) {
					objStore.sumOfAll();
				}
				else if(x==5 && count==0) {
					return;
				}
				else {
					System.out.println("----X---Invalid Number---X----");
				}
			}
		}
		
	}
