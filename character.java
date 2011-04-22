// template
// Howard Rutledge
// March 8, 2011
// Pathfinder RPG Character Development Program

import java.util.*;
import java.io.*;

public class character
{

	public static void main (String[] args)
	{
		int strMod =0;
		int dexMod =0;
		int conMod = 0;
		int inttMod =0;
		int wisMod = 0;
		int chrMod = 0;
		int ac =10;
		int ab =0;
		int sb =0;
		String armortype=" ";
		String shieldtype=" ";
		int basesave =0;
		int magicmod =0;
		int fortitude =0;
		int reflex = 0;
		int will = 0;
		int level=1;
		String racename=" ";
		String classname=" ";
		int rstrMod =0;
		int rdexMod =0;
		int rconMod = 0;
		int rintMod = 0;
		int rwisMod = 0;
		int rchrMod = 0;
		int baseattack=0;
		int cmb =0;
		int cmd=10;
		int sizeMod=0;
		int rAcMod=0;
		Vector skills = new Vector();
		Vector languages = new Vector();
		Vector ability = new Vector();

		 // display operational messages
				System.out.println("Pathfinder RPG Character Creation Program");
				// character name
				System.out.print("Character Name :");
		       // System.out.println();  // print a blank line
				Scanner sc = new Scanner(System.in);
				String name = sc.next();

				////////////
								// character Strength
								System.out.print("Str: ");
								//System.out.println();
								int str = sc.nextInt();
								if (str>=18)
									{ strMod = 4;}
								if (str<18&&str>=16)
									{strMod = 3;}
								if (str<16&&str>=14)
								{strMod = 2;}
								if (str<14&&str>=12)
								{strMod = 1;}
								if (str<12&&str>=10)
								{strMod = 0;}
								if (str<10&&str>=9)
								{strMod = -1;}
								if (str<9&&str>=7)
								{strMod = -2;}
								if (str<7&&str>=5)
								{strMod = -3;}
								if (str<5&&str>=3)
								{strMod = -4;}
								if (str<3)
								{strMod = -5;}

								//character Dexterity
								System.out.print("Dex: ");
								//System.out.println();
								int dex = sc.nextInt();

												if (dex>=18)
													{ dexMod = 4;}
												if (dex<18&&dex>=16)
													{dexMod = 3;}
												if (dex<16&&dex>=14)
												{dexMod = 2;}
												if (dex<14&&dex>=12)
												{dexMod = 1;}
												if (dex<12&&dex>=10)
												{dexMod = 0;}
												if (dex<10&&dex>=9)
												{dexMod = -1;}
												if (dex<9&&dex>=7)
												{dexMod = -2;}
												if (dex<7&&dex>=5)
												{dexMod = -3;}
												if (dex<5&&dex>=3)
												{dexMod = -4;}
												if (dex<3)
												{dexMod = -5;}

								//character Constitution
								System.out.print("Con: ");
								//System.out.println();
								int con = sc.nextInt();

												if (con>=18)
													{ conMod = 4;}
												if (con<18&&con>=16)
													{conMod = 3;}
												if (con<16&&con>=14)
												{conMod = 2;}
												if (con<14&&con>=12)
												{conMod = 1;}
												if (con<12&&con>=10)
												{conMod = 0;}
												if (con<10&&con>=9)
												{conMod = -1;}
												if (con<9&&con>=7)
												{conMod = -2;}
												if (con<7&&con>=5)
												{conMod = -3;}
												if (con<5&&con>=3)
												{conMod = -4;}
												if (con<3)
												{conMod = -5;}

								//character Intelligence
								System.out.print("Int: ");
								//System.out.println();
								int intt = sc.nextInt();

												if (intt>=18)
													{ inttMod = 4;}
												if (intt<18&&intt>=16)
													{inttMod = 3;}
												if (intt<16&&intt>=14)
												{inttMod = 2;}
												if (intt<14&&intt>=12)
												{inttMod = 1;}
												if (intt<12&&intt>=10)
												{inttMod = 0;}
												if (intt<10&&intt>=9)
												{inttMod = -1;}
												if (intt<9&&intt>=7)
												{inttMod = -2;}
												if (intt<7&&intt>=5)
												{inttMod = -3;}
												if (intt<5&&intt>=3)
												{inttMod = -4;}
												if (intt<3)
												{inttMod = -5;}

								//character Wisdom
								System.out.print("Wis: ");
								//System.out.println();
								int wis = sc.nextInt();

												if (wis>=18)
													{ wisMod = 4;}
												if (wis<18&&wis>=16)
													{wisMod = 3;}
												if (wis<16&&wis>=14)
												{wisMod = 2;}
												if (wis<14&&wis>=12)
												{wisMod = 1;}
												if (wis<12&&wis>=10)
												{wisMod = 0;}
												if (wis<10&&wis>=9)
												{wisMod = -1;}
												if (wis<9&&wis>=7)
												{wisMod = -2;}
												if (wis<7&&wis>=5)
												{wisMod = -3;}
												if (wis<5&&wis>=3)
												{wisMod = -4;}
												if (wis<3)
												{wisMod = -5;}

								//character Charisma
								System.out.print("Chr: ");
								//System.out.println();
								int chr = sc.nextInt();

												if (chr>=18)
													{ chrMod = 4;}
												if (chr<18&&chr>=16)
													{chrMod = 3;}
												if (chr<16&&chr>=14)
												{chrMod = 2;}
												if (chr<14&&chr>=12)
												{chrMod = 1;}
												if (chr<12&&chr>=10)
												{chrMod = 0;}
												if (chr<10&&chr>=9)
												{chrMod = -1;}
												if (chr<9&&chr>=7)
												{chrMod = -2;}
												if (chr<7&&chr>=5)
												{chrMod = -3;}
												if (chr<5&&chr>=3)
												{chrMod = -4;}
												if (chr<3)
												{chrMod = -5;}
		System.out.println();

//character race
				System.out.println("Races:(1=Elf, 2= Half-Elf, 3=Halfling, 4=Human, 5=Dwarve, 6=Gnome, 7=Half-Orc)");
				System.out.println();
				System.out.print("Character Race :");


				int race = sc.nextInt();

				if(race==1)
				{	racename = "Elf";
					rdexMod = 2;
					rintMod = 2;
					rconMod = -2;
					languages.add("Elven");
					languages.add("Common");


				}

				if(race==2)
				{	racename = "Half-Elf";
					System.out.println("Pick a Character Trait to add a Racial Modifier of +2");
					System.out.println("1=Str, 2=Con, 3=Dex, 4=Int, 5=Wis, 6=Chr");
					int trait = sc.nextInt();
					if(trait==1)
					{rstrMod=2;}
					if(trait==2)
					{rconMod=2;}
					if(trait==3)
					{rdexMod=2;}
					if(trait==4)
					{rintMod=2;}
					if(trait==5)
					{rwisMod=2;}
					if(trait==6)
					{rchrMod=2;}
					languages.add("Elven");
					languages.add("Common");

				}

				if(race==3)
				{	racename = "Halfling";
					rdexMod= 2;
					rchrMod=2;
					rstrMod=-2;
					languages.add("Halfling");
					languages.add("Common");
					sizeMod=-1;
					rAcMod=1;
				}

				if(race==4)
				{	racename = "Human";
				System.out.println("Pick a Character Trait to add a Racial Modifier of +2");
				System.out.println("1=Str, 2=Con, 3=Dex, 4=Int, 5=Wis, 6=Chr");
				int trait = sc.nextInt();
				if(trait==1)
				{rstrMod=2;}
				if(trait==2)
				{rconMod=2;}
				if(trait==3)
				{rdexMod=2;}
				if(trait==4)
				{rintMod=2;}
				if(trait==5)
				{rwisMod=2;}
				if(trait==6)
				{rchrMod=2;}

				languages.add("Common");

				}

				if(race==5)
				{	racename = "Dwarve";
					rconMod=2;
					rwisMod = 2;
					rchrMod = -2;

					languages.add("Dwarven");
					languages.add("Common");

				}

				if(race==6)
				{	racename = "Gnome";
					rconMod=2;
					rchrMod=2;
					rstrMod=-2;

					languages.add("Gnome");
					languages.add("Common");
					languages.add("Sylvan");
					sizeMod=-1;
					rAcMod=1;
				}

				if(race==7)
				{	racename = "Half-Orc";
					System.out.println("Pick a Character Trait to add a Racial Modifier of +2");
					System.out.println("1=Str, 2=Con, 3=Dex, 4=Int, 5=Wis, 6=Chr");
					int trait = sc.nextInt();
					if(trait==1)
					{rstrMod=2;}
					if(trait==2)
					{rconMod=2;}
					if(trait==3)
					{rdexMod=2;}
					if(trait==4)
					{rintMod=2;}
					if(trait==5)
					{rwisMod=2;}
					if(trait==6)
					{rchrMod=2;}

					languages.add("Orc");
					languages.add("Common");

				}



				// character class
				System.out.println("1=Barbaian");
				System.out.println("2=Bard");
				System.out.println("3=Cleric");
				System.out.println("4=Druid");
				System.out.println("5=Fighter");
				System.out.println("6=Monk");
				System.out.println("7=Paladin");
				System.out.println("8=Ranger");
				System.out.println("9=Rouge");
				System.out.println("10=Sorcerer");
				System.out.println("11=Wizard");
				System.out.print("Character Class :");
				//System.out.println();
				int clss = sc.nextInt();

				if (clss==1)
				{
					classname = "Barbarian";
					skills.add("Acrobatics");
					skills.add("Climb");
					skills.add("Craft");
					skills.add("Handle Animal");
					skills.add("Intimidate");
					skills.add("Knowledge-nature");
					skills.add("Perception");
					skills.add("Profession");
					skills.add("Ride");
					skills.add("Survival");
					skills.add("Swim");
					baseattack=1;
					ability.add("Fast Movement");
					ability.add("Rage");
				}
				if (clss==2)
				{
					classname = "Bard";
					skills.add("Acrobatics");
					skills.add("Appraise");
					skills.add("Bluff");
					skills.add("Climb");
					skills.add("Craft");
					skills.add("Diplomacy");
					skills.add("Disguise");
					skills.add("Escape-Artist");
					skills.add("Intimidate");
					skills.add("Knowledge - arcana");
					skills.add("Knowledge - dungeoneering");
					skills.add("Knowledge - engineering");
					skills.add("Knowledge - geography");
					skills.add("Knowledge - history");
					skills.add("Knowledge - local");
					skills.add("Knowledge - nature");
					skills.add("Knowledge - nobility");
					skills.add("Knowledge - planes");
					skills.add("Knowledge - religion");
					skills.add("Linguistics");
					skills.add("Perception");
					skills.add("Perform");
					skills.add("Profession");
					skills.add("Sense Motive");
					skills.add("Sleight of Hand");
					skills.add("Spellcraft");
					skills.add("Stealth");
					skills.add("Use Magic Device");

					ability.add("Bardic Knowledge");
					ability.add("Bardic Performance");
					ability.add("Cantrips");
					ability.add("CounterSong");
					ability.add("Distraction");
					ability.add("Fascinate");
					ability.add("Inspire Courage +1");

				}
				if (clss==3)
				{
					classname = "Cleric";
					skills.add("Appraise");
					skills.add("Craft");
					skills.add("Diplomacy");
					skills.add("Heal");
					skills.add("Knowledge - arcana");
					skills.add("Knowledge-history");
					skills.add("Knowledge - nobility");
					skills.add("Knowledge - planes");
					skills.add("Knowledge - religion");
					skills.add("Lingquistics");
					skills.add("Profession");
					skills.add("Sense Movtive");
					skills.add("Spellcraft");

					ability.add("Aura");
					ability.add("Channel Energy - 1d6");
					ability.add("Domains");
					ability.add("Orisons(3 per day)");

				}
				if (clss==4)
				{
					classname = "Druid";
					skills.add("Climb");
					skills.add("Craft");
					skills.add("Fly");
					skills.add("Handle - Animal");
					skills.add("Heal");
					skills.add("Knowledge-geography");
					skills.add("Knowledge - nature");
					skills.add("Perception");
					skills.add("Profession");
					skills.add("Ride");
					skills.add("Spellcraft");
					skills.add("Survival");
					skills.add("Swim");
					languages.add("Druidic");

					ability.add("Nature Bond");
					ability.add("Nature Sense");
					ability.add("Orisons (3 per day)");
					ability.add("Wild Empathy");


				}
				if (clss==5)
				{
					classname = "Fighter";
					skills.add("Climb");
					skills.add("Craft");
					skills.add("Handle - Animal");
					skills.add("Intimidate");
					skills.add("Knowledge-dungeoneering");
					skills.add("Knowledge - engineering");
					skills.add("Profession");
					skills.add("Ride");
					skills.add("Survival");
					skills.add("Swim");
					baseattack=1;


				}
				if (clss==6)
				{
					classname = "Monk";
					skills.add("Climb");
					skills.add("Craft");
					skills.add("Escape Artist");
					skills.add("Intimidate");
					skills.add("Knowledge-history");
					skills.add("Knowledge - religion");
					skills.add("Perception");
					skills.add("Perform");
					skills.add("Profession");
					skills.add("Ride");
					skills.add("Sense Motive");
					skills.add("Stealth");
					skills.add("Swim");

					ability.add("Flurry of Blows");
					ability.add("Stunning Fist");
					ability.add("Unarmed Strike");



				}
				if (clss==7)
				{
					classname = "Paladin";
					skills.add("Craft");
					skills.add("Diplomacy");
					skills.add("Handle Animal");
					skills.add("Heal");
					skills.add("Knowledge-nobility");
					skills.add("Knowledge - religion");
					skills.add("Profession");
					skills.add("Ride");
					skills.add("Sense Motive");
					skills.add("Spellcraft");
					baseattack =1;

					ability.add("Aura of Good");
					ability.add("Detect Evil");
					ability.add("Smite Evil (1 per day)");

				}
				if (clss==8)
				{
					classname = "Ranger";
					skills.add("Climb");
					skills.add("Craft");
					skills.add("Handle Animal");
					skills.add("Heal");
					skills.add("Intimidate");
					skills.add("Knowledge-dungeoneering");
					skills.add("Knowledge-geography");
					skills.add("Knowledge-nature");
					skills.add("Perception");
					skills.add("Profession");
					skills.add("Ride");
					skills.add("Spellcraft");
					skills.add("Stealth");
					skills.add("Survival");
					skills.add("Swim");
					baseattack=1;
					String fe =" ";
					System.out.println();
					System.out.println("Choose a Favored Enemy");
					System.out.println("1=Abberation");
					System.out.println("2=Animal");
					System.out.println("3=Construct");
					System.out.println("4=Dragon");
					System.out.println("5=Fey");
					System.out.println("6=Humanoid - aquatic");
					System.out.println("7=Humanoid - dwarf");
					System.out.println("8=Humanoid - elf");
					System.out.println("9=Humanoid - giant");
					System.out.println("10=Humanoid - goblin");
					System.out.println("11=Humanoid - gnome");
					System.out.println("12=Humanoid - halfling");
					System.out.println("13=Humanoid - human");
					System.out.println("14=Humanoid - orc");
					System.out.println("15=Humanoid - reptilian");
					System.out.println("16=Humanoid - other");
					System.out.println("17=Magical Beast");
					System.out.println("18=Monstrous Humanoid");
					System.out.println("19=Ooze");
					System.out.println("20=Outsider - air");
					System.out.println("21=Outsider - chaotic");
					System.out.println("22=Outsider - earth");
					System.out.println("23=Outsider - evil");
					System.out.println("24=Outsider - fire");
					System.out.println("25=Outsider - good");
					System.out.println("26=Outsider - lawful");
					System.out.println("27=Outsider - native");
					System.out.println("28=Outsider - water");
					System.out.println("29=Plant");
					System.out.println("30=Undead");
					System.out.println("31=Vermin");
					System.out.println();
					System.out.print("Choosen Favorite Enemy: ");
					int faven = sc.nextInt();
					if(faven ==1)
					{fe ="Abberation";}
					if(faven==2){fe="Animal";}
					if(faven==3){fe="Construct";}
					if(faven==4){fe="Dragon";}
					if(faven==5){fe="Fey";}
					if(faven==6){fe="Humanoid - aquatic";}
					if(faven==7){fe="Dwarf";}
					if(faven==8){fe="Elf";}
					if(faven==9){fe="Giant";}
					if(faven==10){fe="Goblin";}
					if(faven==11){fe="Gnome";}
					if(faven==12){fe="Halfling";}
					if(faven==13){fe="Human";}
					if(faven==14){fe="Orc";}
					if(faven==15){fe="Humanoid - reptilian";}
					if(faven==16){fe="Humanoid - other";}
					if(faven==17){fe="Magical Beast";}
					if(faven==18){fe="Monstrous Humanoid";}
					if(faven==19){fe="Ooze";}
					if(faven==20){fe="Outsider - air";}
					if(faven==21){fe="Outsider - chaotic";}
					if(faven==22){fe="Outsider - earth";}
					if(faven==23){fe="Outsider - evil";}
					if(faven==24){fe="Outsider - fire";}
					if(faven==25){fe="Outsider - good";}
					if(faven==26){fe="Outsider - lawful";}
					if(faven==27){fe="Outsider - native";}
					if(faven==28){fe="Outsider - water";}
					if(faven==29){fe="Plant";}
					if(faven==30){fe="Undead";}
					if(faven==31){fe="Vermin";}
					ability.add("Favored Enemy = "+fe);
					ability.add("Track");
					ability.add("Wild Empathy");

				}
				if (clss==9)
				{
					classname = "Rouge";
					skills.add("Acrobatics");
					skills.add("Appraise");
					skills.add("Bluff");
					skills.add("Climb");
					skills.add("Craft");
					skills.add("Diplomacy");
					skills.add("Disable Device");
					skills.add("Disguise");
					skills.add("Escape Artist");
					skills.add("Intimidate");
					skills.add("Knowledge - dungeoneering");
					skills.add("Knowledge - local");
					skills.add("Linguistics");
					skills.add("Perception");
					skills.add("Perform");
					skills.add("Profession");
					skills.add("Sense Motive");
					skills.add("Sleight of Hand");
					skills.add("Stealth");
					skills.add("Swim");
					skills.add("Use Magic Device");

					ability.add("Sneak Attack (1d6)");
					ability.add("trapfinding");
				}
				if (clss==10)
				{
					classname = "Sorcerer";
					skills.add("Appraise");
					skills.add("Bluff");
					skills.add("Craft");
					skills.add("Fly");
					skills.add("Intimidate");
					skills.add("Knowledge - arcana");
					skills.add("Profession");
					skills.add("Spellcraft");
					skills.add("Use Magic Device");

					ability.add("Bloodline Power");
					ability.add("Cantrips");
					ability.add("Eschew Materials");
				}
				if (clss==11)
				{
					classname = "Wizard";
					skills.add("Appraise");
					skills.add("Craft");
					skills.add("Fly");
					skills.add("Knowledge - arcana");
					skills.add("Knowledge - dungeoneering");
					skills.add("Knowledge - engineering");
					skills.add("Knowledge - geography");
					skills.add("Knowledge - history");
					skills.add("Knowledge - local");
					skills.add("Knowledge - nature");
					skills.add("Knowledge - nobility");
					skills.add("Knowledge - planes");
					skills.add("Knowledge - religion");
					skills.add("Profession");
					skills.add("Spellcraft");

					String as=" ";
						System.out.println();
						System.out.println("Choose a Favored Arcane School");
						System.out.println("1=Abjuration");
						System.out.println("2=Conjuration");
						System.out.println("3=Divination");
						System.out.println("4=Enchantment");
						System.out.println("5=Evocation");
						System.out.println("6=Illusion");
						System.out.println("7=Necromancy");
						System.out.println("8=Transmutation");
						System.out.println("9=Universalist");
						System.out.println();
						System.out.print("Choosen Arcane School: ");

					int favas = sc.nextInt();
						if(favas ==1)
						{as ="Abberation School";}
						if(favas==2){as="Conjuration School";}
						if(favas==3){as="Divination School";}
						if(favas==4){as="Enchantment School";}
						if(favas==5){as="Evocation School";}
						if(favas==6){as="Illusion School";}
						if(favas==7){as="Necromancy School";}
						if(favas==8){as="Transmutation School";}
						if(favas==9){as="Universalist School";}


					ability.add("Arcane Bond");
					ability.add("Arcane Affiliation: "+as);
					ability.add("Cantrips");
					ability.add("Scribe Scroll");

				}
				System.out.println();


		// Armor Class computation
		System.out.println("Types of Armor- (0=No Armor, 1=padded, 2= leather, 3= studded, 4= chain shirt, 5= hide, 6= scale, 7= chain-mail, 8= breastplate, 9 = splint-mail, 10= Banded mail, 11= Half plate, 12= Full Plate) ");
		System.out.println();
		System.out.print("Type of Armor: ");
		int armor = sc.nextInt();
				if(armor ==1)
				{ ab = 1;
				armortype ="Padded";}
				if(armor ==2)
				{ ab = 2;
				armortype ="Leather";}
				if(armor ==3)
				{ ab = 3;
				armortype ="Studded";}
				if(armor ==4)
				{ ab = 4;
				armortype = "Chain Shirt";}
				if(armor ==5)
				{ ab = 4;
				armortype = "Hide";}
				if(armor ==6)
				{ ab = 5;
				armortype = "Scale Mail";}
				if(armor ==7)
				{ ab = 6;
				armortype ="Chain-Mail";}
				if(armor ==8)
				{ ab = 6;
				armortype ="Breast Plate";
				}
				if(armor ==9)
				{ ab = 7;
				armortype ="Splint - Mail";}
				if(armor ==10)
				{ ab = 7;
				armortype ="Banded Mail";}
				if(armor ==11)
				{ ab = 8;
				armortype="Half - Plate";}
				if(armor ==12)
				{ ab = 9;
				armortype="Full-Plate";}
				if(armor==0)
				{ab =0;}
		System.out.println();
		System.out.println("Types of Shield:( 0 = No Shield, 1= Buckler, 2= light wood, 3= light steel, 4= heavy wood, 5= heavy steel, 6= tower)");
		System.out.println();
		System.out.print("Type of Shield: ");
		int shield = sc.nextInt();
						if(shield ==1)
						{ sb = 1;
						shieldtype ="Buckler";}
						if(shield ==2)
						{ sb = 2;
						shieldtype ="Light Wood";}
						if(shield ==3)
						{ sb = 3;
						shieldtype ="Light Steel";}
						if(shield ==4)
						{ sb = 4;
						shieldtype ="Heavy Wood";}
						if(shield ==5)
						{ sb = 4;
						shieldtype ="Heavy Steel";}
						if(shield ==6)
						{ sb = 5;
						shieldtype ="Tower";}
						if(shield ==0)
						{ sb = 0;
						shieldtype ="None";}

		ac = ac + ab + sb + dexMod+rAcMod;

		// savings throws
		fortitude = basesave +conMod+magicmod;
		reflex = basesave+dexMod+magicmod;
		will = basesave+wisMod+magicmod;

		//attack throws
		cmb=baseattack+strMod+sizeMod;
		cmd=cmd+baseattack+strMod+dexMod+sizeMod;

		System.out.println();
		System.out.println("Pathfinder Character");
		System.out.println();
		System.out.println("Name: " + name );
		System.out.println( "Race: "+racename);
		System.out.println("Class: "+classname);
		System.out.println("Level: "+level);
		System.out.println();

		System.out.println("STR: "+str+ " + "+strMod+" + "+rstrMod);
		System.out.println("DEX: "+dex+ " + "+dexMod+" + "+rdexMod);
		System.out.println("CON: "+con+ " + "+conMod+" + "+rconMod);
		System.out.println("INT: "+intt+ " + "+inttMod+" + "+rintMod);
		System.out.println("WIS: "+wis+ " + "+wisMod+" + "+rwisMod);
		System.out.println("CHR: "+chr+ " + "+chrMod+" + "+rchrMod);
		System.out.println("Armor Type : " +armortype);
		System.out.println("Shield Type: " +shieldtype);
		System.out.println("AC: " +ac);
		System.out.println();
		System.out.println("Savings Throws");
		System.out.println("Fortitude: "+fortitude);
		System.out.println("Reflex: "+reflex);
		System.out.println("Will: "+will);
		System.out.println();
		System.out.println("Base Attack Bonus: "+baseattack);
		System.out.println("CMB: "+cmb);
		System.out.println("CMD: "+cmd);
		System.out.println();
		System.out.println("Skills");
		System.out.println();
		for(int i=0; i< skills.size();i++)
		{
			String skill = (String)skills.get(i);
			System.out.println((i+1)+". "+ skill);
		}
		System.out.println();
		System.out.println("Languages");
		System.out.println();

		for(int i=0; i< languages.size();i++)
				{
					String language = (String)languages.get(i);
					System.out.println((i+1)+". "+ language);
				}
		System.out.println();
		System.out.println("Special Abilities");
		System.out.println();
		for(int i=0; i< languages.size();i++)
						{
							String abilitys = (String)ability.get(i);
							System.out.println((i+1)+". "+ abilitys);
				}
		System.out.println();
		try
		{

		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter(name+".txt",true)));

				out.println("Pathfinder Character");
				out.println();
				out.println("Name: " + name );
				out.println( "Race: "+racename);
				out.println("Class: "+classname);
				out.println("Level: "+level);
				out.println();

				out.println("STR: "+str+ " + "+strMod+" + "+rstrMod);
				out.println("DEX: "+dex+ " + "+dexMod+" + "+rdexMod);
				out.println("CON: "+con+ " + "+conMod+" + "+rconMod);
				out.println("INT: "+intt+ " + "+inttMod+" + "+rintMod);
				out.println("WIS: "+wis+ " + "+wisMod+" + "+rwisMod);
				out.println("CHR: "+chr+ " + "+chrMod+" + "+rchrMod);
				out.println("Armor Type : " +armortype);
				out.println("Shield Type: " +shieldtype);
				out.println("AC: " +ac);
				out.println();
				out.println("Savings Throws");
				out.println("Fortitude: "+fortitude);
				out.println("Reflex: "+reflex);
				out.println("Will: "+will);
				out.println();
				out.println("Base Attack Bonus: "+baseattack);
				out.println("CMB: "+cmb);
				out.println("CMD: "+cmd);
				out.println();
				out.println("Skills");
				out.println();
						for(int i=0; i< skills.size();i++)
						{
							String skill = (String)skills.get(i);
							out.println((i+1)+". "+ skill);
						}
				out.println();
				out.println("Languages");
				out.println();
				for(int i=0; i< languages.size();i++)
								{
									String language = (String)languages.get(i);
									out.println((i+1)+". "+ language);
				}
				out.println();
				out.println("Special Abilities");
				out.println();
				for(int i=0; i< languages.size();i++)
										{
											String abilitys = (String)ability.get(i);
											out.println((i+1)+". "+ abilitys);
								}
		System.out.println();

		out.close();
		}

		catch(IOException ioe)
				{System.out.println("File Not Found");}


	}
}