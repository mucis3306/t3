import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import java.io.*;
import java.util.*;
import java.text.*;
import javax.swing.filechooser.*;

public class Character_v2
{
	public static void main(String[] args)
	{
		JFrame frame = new CharacterFrame();
		frame.setVisible(true);

	}
}

class CharacterFrame extends JFrame
{
	public CharacterFrame()
	{
		setTitle("Pathfinder RPG Character");
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new CharacterPanel();
		this.add(panel);
		this.pack();
		centerWindow(this);


	}

	private void centerWindow(Window w)
	{
		//ToolKit tk = Toolkit.getDefaultToolkit();
		//Dimension d = tk.getScreenSize();
		//setLocation((d.width-w.getWidth())/2, (d.height-w.getHeight())/2);
	}
}

 class CharacterPanel extends JPanel implements ActionListener
{
	private JTextArea   notesTA;
	private JTextField	characterNameTextField,
						raceTextField,
						classTextField,
						algTextField,
						xpTextField,
						acTextField,
						cmbTextField,
						cmdTextField,
						fortTextField,
						reflexTextField,
						willTextField,
						levelTextField,
						strTextField,
						dexTextField,
						conTextField,
						intTextField,
						wisTextField,
						chaTextField;


	private JLabel		characterNameLabel,
						raceLabel,
						classLabel,
						algLabel,
						xpLabel,
						acLabel,
						cmbLabel,
						cmdLabel,
						fortLabel,
						reflexLabel,
						willLabel,
						levelLabel,
						strLabel,
						dexLabel,
						conLabel,
						intLabel,
						wisLabel,
						chaLabel,
						weapon1Label,
						weapon2Label,
						weapon3Label,
						armor1Label,
						armor2Label;

	private JList		raceList,
						classList,
						weapon1List,
						weapon2List,
						weapon3List,
						armor1List,
						armor2List;

	private JButton		submitButton, exitButton;

	private JMenuItem   newMI, openMI,saveAsMI,printMI, exitMI, aboutMI;

public CharacterPanel()
	{
	setLayout (new GridBagLayout());

	//character Bio information
	JPanel bioPanel = new JPanel();
	bioPanel.setBorder(BorderFactory.createTitledBorder("Basic Information"));

	characterNameLabel = new JLabel("Name");
			bioPanel.add(characterNameLabel);
	characterNameTextField = new JTextField(20);
			characterNameTextField.setHorizontalAlignment(JTextField.LEFT);
			bioPanel.add(characterNameTextField);

	/*raceLabel = new JLabel("Race");
	bioPanel.add(raceLabel);
	raceTextField = new JTextField(20);
	raceTextField.setHorizontalAlignment(JTextField.LEFT);
	bioPanel.add(raceTextField);*/

	classLabel = new JLabel("Class");
		bioPanel.add(classLabel);
	String[] classNames ={"Bard","Cleric","Druid","Fighter","Ranger","Paladin","Rouge","Sorcerer","Wizard"};
		classList= new JList(classNames);
		classList.setFixedCellWidth(100);
		classList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		classList.setVisibleRowCount(5);
		JScrollPane classScrollPane = new JScrollPane(classList);
	bioPanel.add(classScrollPane);



	raceLabel = new JLabel("Race");
		bioPanel.add(raceLabel);
	String[] raceNames ={"Elf","Dwarf","Half-Elf","Half-Orc","Human","Halfling"};
	raceList= new JList(raceNames);
	raceList.setFixedCellWidth(100);
	raceList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	raceList.setVisibleRowCount(5);
	JScrollPane raceScrollPane = new JScrollPane(raceList);
	bioPanel.add(raceScrollPane);

	algLabel = new JLabel("Alignment");
				bioPanel.add(algLabel);
		algTextField = new JTextField(20);
				algTextField.setHorizontalAlignment(JTextField.LEFT);
			bioPanel.add(algTextField);

	add(bioPanel,getConstraints(0,0,3,1, GridBagConstraints.WEST));
	// physical abilities
	JPanel abilityPanel = new JPanel();
	abilityPanel.setBorder(BorderFactory.createTitledBorder("Abilities"));
	strLabel = new JLabel("STR");
	abilityPanel.add(strLabel);
	strTextField = new JTextField(2);
	strTextField.setHorizontalAlignment(JTextField.LEFT);
	abilityPanel.add(strTextField);

	dexLabel = new JLabel("DEX");
		abilityPanel.add(dexLabel);
		dexTextField = new JTextField(2);
		dexTextField.setHorizontalAlignment(JTextField.LEFT);
	abilityPanel.add(dexTextField);

	conLabel = new JLabel("CON");
		abilityPanel.add(conLabel);
		conTextField = new JTextField(2);
		conTextField.setHorizontalAlignment(JTextField.LEFT);
	abilityPanel.add(conTextField);

	intLabel = new JLabel("INT");
		abilityPanel.add(intLabel);
		intTextField = new JTextField(2);
		intTextField.setHorizontalAlignment(JTextField.LEFT);
	abilityPanel.add(intTextField);

	wisLabel = new JLabel("WIS");
		abilityPanel.add(wisLabel);
		wisTextField = new JTextField(2);
		wisTextField.setHorizontalAlignment(JTextField.LEFT);
	abilityPanel.add(wisTextField);

	chaLabel = new JLabel("CHA");
		abilityPanel.add(chaLabel);
		chaTextField = new JTextField(2);
		chaTextField.setHorizontalAlignment(JTextField.LEFT);
	abilityPanel.add(chaTextField);

	add(abilityPanel,getConstraints(0,1,3,1,GridBagConstraints.WEST));

	//Weapon Selections
	JPanel weaponPanel = new JPanel();
	weaponPanel.setBorder(BorderFactory.createTitledBorder("Weapon Selections"));
	weapon1Label = new JLabel("Weapon 1");
	weaponPanel.add(weapon1Label);
	String[] weapon1Names ={"Club","Dagger","Long Sword","Long Bow","Battle Axe","Mace","Quarter Staff","Short Sword","Cross Bow -Light"};
			weapon1List= new JList(weapon1Names);
			weapon1List.setFixedCellWidth(100);
			weapon1List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			weapon1List.setVisibleRowCount(5);
			JScrollPane weapon1ScrollPane = new JScrollPane(weapon1List);
	weaponPanel.add(weapon1ScrollPane);

		weapon2Label = new JLabel("Weapon 2");
		weaponPanel.add(weapon2Label);
		String[] weapon2Names ={"Club","Dagger","Long Sword","Long Bow","Battle Axe","Mace","Quarter Staff","Short Sword","Cross Bow -Light"};
				weapon2List= new JList(weapon2Names);
				weapon2List.setFixedCellWidth(100);
				weapon2List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				weapon2List.setVisibleRowCount(5);
				JScrollPane weapon2ScrollPane = new JScrollPane(weapon2List);
	weaponPanel.add(weapon2ScrollPane);

		weapon3Label = new JLabel("Weapon 3");
		weaponPanel.add(weapon3Label);
		String[] weapon3Names ={"Club","Dagger","Long Sword","Long Bow","Battle Axe","Mace","Quarter Staff","Short Sword","Cross Bow -Light"};
				weapon3List= new JList(weapon3Names);
				weapon3List.setFixedCellWidth(100);
				weapon3List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				weapon3List.setVisibleRowCount(5);
				JScrollPane weapon3ScrollPane = new JScrollPane(weapon3List);
	weaponPanel.add(weapon3ScrollPane);

	add(weaponPanel,getConstraints(0,2,3,1,GridBagConstraints.WEST));


// Armor Selections
	JPanel armorPanel = new JPanel();
	armorPanel.setBorder(BorderFactory.createTitledBorder("Armor & Shield Selection"));
	armor1Label = new JLabel("Armor");
	armorPanel.add(armor1Label);
	String[] armor1Names ={"Padded","Leather","Hide","Chain Shirt","Chain Mail","Splint","Breast Plate","Full Plate"};
					armor1List= new JList(armor1Names);
					armor1List.setFixedCellWidth(100);
					armor1List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					armor1List.setVisibleRowCount(5);
					JScrollPane armor1ScrollPane = new JScrollPane(armor1List);
	armorPanel.add(armor1ScrollPane);

	armor2Label = new JLabel("Shield");
		armorPanel.add(armor2Label);
		String[] armor2Names ={"Light-Wood","Light-Steel","Heavy-Wood","Heavy-Steel","Tower"};
						armor2List= new JList(armor2Names);
						armor2List.setFixedCellWidth(100);
						armor2List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
						armor2List.setVisibleRowCount(5);
						JScrollPane armor2ScrollPane = new JScrollPane(armor2List);
	armorPanel.add(armor2ScrollPane);

	add(armorPanel,getConstraints(0,3,3,1,GridBagConstraints.WEST));

	//Attack Data
	JPanel attackPanel = new JPanel();
	attackPanel.setBorder(BorderFactory.createTitledBorder("Attack Data"));
	xpLabel = new JLabel("XP");
				attackPanel.add(xpLabel);
		xpTextField = new JTextField(10);
				xpTextField.setHorizontalAlignment(JTextField.LEFT);
			attackPanel.add(xpTextField);

	levelLabel = new JLabel("level");
					attackPanel.add(levelLabel);
			levelTextField = new JTextField(10);
					levelTextField.setHorizontalAlignment(JTextField.LEFT);
			attackPanel.add(levelTextField);


	acLabel = new JLabel("AC");
					attackPanel.add(acLabel);
			acTextField = new JTextField(2);
					acTextField.setHorizontalAlignment(JTextField.LEFT);
					acTextField.setEditable(false);
					acTextField.setText("10");
			attackPanel.add(acTextField);

	cmbLabel = new JLabel("CMB");
						//attackPanel.add(cmbLabel);
				cmbTextField = new JTextField(2);
						cmbTextField.setHorizontalAlignment(JTextField.LEFT);
			//attackPanel.add(cmbTextField);

	cmdLabel = new JLabel("CMD");
						//attackPanel.add(cmdLabel);
				cmdTextField = new JTextField(2);
						cmdTextField.setHorizontalAlignment(JTextField.LEFT);
			//attackPanel.add(cmdTextField);



	add(attackPanel,getConstraints(2,1,3,1,GridBagConstraints.EAST));

	//Saving Throws
	JPanel savePanel = new JPanel();
	savePanel.setBorder(BorderFactory.createTitledBorder("Saving Throws"));

	fortLabel = new JLabel("Fortitude");
						savePanel.add(fortLabel);
				fortTextField = new JTextField(2);
						fortTextField.setHorizontalAlignment(JTextField.LEFT);
						fortTextField.setText("0");
						fortTextField.setEditable(false);
			savePanel.add(fortTextField);

	reflexLabel = new JLabel("Reflex");
						savePanel.add(reflexLabel);
				reflexTextField = new JTextField(2);
						reflexTextField.setHorizontalAlignment(JTextField.LEFT);
						reflexTextField.setEditable(false);
						reflexTextField.setText("0");
			savePanel.add(reflexTextField);

	willLabel = new JLabel("Will");
							savePanel.add(willLabel);
					willTextField = new JTextField(2);
							willTextField.setHorizontalAlignment(JTextField.LEFT);
							willTextField.setEditable(false);
							willTextField.setText("0");
			savePanel.add(willTextField);

	add(savePanel,getConstraints(2,2,3,1,GridBagConstraints.EAST));


//private JTextArea notesTA;



			notesTA=new JTextArea(10,40);//rows, columns
			notesTA.setBackground(new Color(255,255,150));//Red, Green, Blue values
			notesTA.setLineWrap(true); //wraps text to next line
			notesTA.setWrapStyleWord(true); //moves whole words to next line
			JScrollPane noteSP = new JScrollPane(notesTA,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);  // Scroll Bars in Text Area
				notesTA.setText("Add any additional character Notes here, such as spells, history, etc.  To Use the program fill in the fields,  select race, class, weapons, armor and shield.  A text file with the character name will be created in the folder that the program resides in.");
			armorPanel.add(noteSP);


	//submit button
	submitButton= new JButton("Create");
	submitButton.addActionListener(this);
	add(submitButton, getConstraints(0,6,1,1,GridBagConstraints.EAST));

	// exit button
	exitButton = new JButton("Exit");
	exitButton.addActionListener(this);
	add(exitButton, getConstraints(2,6,1,1,GridBagConstraints.EAST));

	}




	//Character creation code
public class character

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
		Vector equipment = new Vector();



}






//Grid Bag Constraints
private GridBagConstraints getConstraints(int gridx, int gridy, int gridwidth, int gridheight, int anchor)
	{
	GridBagConstraints c = new GridBagConstraints();
	c.insets = new Insets(5,5,5,5);
	c.ipadx = 0;
	c.ipady = 0;
	c.gridx = gridx;
	c.gridy = gridy;
	c.gridwidth = gridwidth;
	c.gridheight = gridheight;
	c.anchor = anchor;
	return c;
	}

	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
			if (source == exitButton)
				System.exit(0);
			else if(source==submitButton)
					{

						 int str= Integer.parseInt(strTextField.getText());
						 int con= Integer.parseInt(conTextField.getText());
						 int dex= Integer.parseInt(dexTextField.getText());
						 int intt= Integer.parseInt(intTextField.getText());
						 int wis= Integer.parseInt(wisTextField.getText());
						 int cha= Integer.parseInt(chaTextField.getText());
						 int xp = Integer.parseInt(xpTextField.getText());
						 int level = Integer.parseInt(levelTextField.getText());


						 String Race = (String)raceList.getSelectedValue();
						String clss = (String)classList.getSelectedValue();
						String weapon1=(String)weapon1List.getSelectedValue();
						String weapon2 =(String)weapon2List.getSelectedValue();
						String armor1 =(String)armor1List.getSelectedValue();
						String armor2 =(String)armor2List.getSelectedValue();
						String weapon3 =(String)weapon3List.getSelectedValue();



						String Notes = (String)notesTA.getText();
						 String name = characterNameTextField.getText();
						 String alg = algTextField.getText();

						// Adjustment Modifier
						int strMod=0;
						int conMod=0;
						int dexMod=0;
						int inttMod=0;
						int wisMod=0;
						int chaMod=0;



						//Armor Class Adjustments String[] armor1Names ={"Padded","Leather","Hide","Chain Shirt","Chain Mail","Splint","Breast Plate","Full Plate"};
						int ab=0;
						if(armor1=="Padded")
						{ ab = 1;}
						if(armor1=="Leather")
						{ ab = 2;}
						if(armor1=="Hide")
						{ ab = 4;}
						if(armor1=="Chain Shirt")
						{ ab = 5;}
						if(armor1=="Chain Mail")
						{ ab = 6;}
						if(armor1=="Splint")
						{ ab = 7;}
						if(armor1=="Breast Plate")
						{ ab = 8;}
						if(armor1=="Full Plate")
						{ ab = 9;}

						//String[] armor2Names ={"Light-Wood","Light-Steel","Heavy-Wood","Heavy-Steel","Tower"};
						int sb =0;
						if(armor2=="Light-Wood")
						{sb=3;}
						if(armor2=="Light-Steel")
						{sb=4;}
						if(armor2=="Heavy-Wood")
						{sb=4;}
						if(armor2=="Heavy-Steel")
						{sb=5;}
						if(armor2=="Tower")
						{sb=6;}


						//strMod
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

						//dexMod
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

						//conMod
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

						//inttMod
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

						//wisMod
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
						//chaMod
						if (cha>=18)
							{ chaMod = 4;}
						if (cha<18&&cha>=16)
							{chaMod = 3;}
						if (cha<16&&cha>=14)
						{chaMod = 2;}
						if (cha<14&&cha>=12)
						{chaMod = 1;}
						if (cha<12&&cha>=10)
						{chaMod = 0;}
						if (cha<10&&cha>=9)
						{chaMod = -1;}
						if (cha<9&&cha>=7)
						{chaMod = -2;}
						if (cha<7&&cha>=5)
						{chaMod = -3;}
						if (cha<5&&cha>=3)
						{chaMod = -4;}
						if (cha<3)
						{chaMod = -5;}

						// Defense Factors
						int ac =10+ab+sb+dexMod;
						int fort = 0;
						int reflex =0;
						int will = 0;

						// Skills
						Vector skills = new Vector();
						Vector languages = new Vector();
						Vector ability = new Vector();

						if (clss=="Barbarian")
						{

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

						ability.add("Fast Movement");
						ability.add("Rage");
						}

						if (clss=="Bard")
						{

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

						if (clss=="Cleric")
						{

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

						if (clss=="Druid")
						{

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

						if (clss=="Fighter")
						{

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

						}

							if (clss=="Monk")
							{

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

							if (clss=="Paladin")
							{

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


							ability.add("Aura of Good");
							ability.add("Detect Evil");
							ability.add("Smite Evil (1 per day)");

							}

							if (clss=="Ranger")
							{

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
							ability.add("Favored Enemy =____________ ");
							ability.add("Track");
							ability.add("Wild Empathy");

							}

							if (clss=="Rouge")
						{

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

						if (clss=="Sorcerer")
						{

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
						if (clss=="Wizard")
						{

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
						ability.add("Arcane Bond");
						ability.add("Arcane Affiliation:__________ ");
						ability.add("Cantrips");
						ability.add("Scribe Scroll");

						}

						//Character Sheet OutPut
						try
						{

						System.out.println("Name: "+name+"\n");
						System.out.println("Alignment: "+alg+"\n");
						System.out.println("Race: "+Race+"\n");
						System.out.println("Class: "+clss+" XP: "+xp+" Level: "+level+"\n");
						System.out.println();
						System.out.println("STR: "+str+" + "+strMod);
						System.out.println("CON: "+con+" + "+conMod);
						System.out.println("DEX: "+dex+" + "+dexMod);
						System.out.println("INT: "+intt+" + "+inttMod);
						System.out.println("WIS: "+wis+" + "+wisMod);
						System.out.println("CHA: "+cha+" + "+chaMod);
						System.out.println();
						System.out.println("Weapons");
						System.out.println("1: "+weapon1);
						System.out.println("2: "+weapon2);
						System.out.println("3: "+weapon3);
						System.out.println();
						System.out.println("Armor");
						System.out.println(armor1+" armor");
						System.out.println(armor2+ "shield");
						System.out.println();
						System.out.println("Defenses");
						System.out.println("ArmorClass: "+ac);
						System.out.println("Fortitude: "+fort+" Reflex: "+reflex+" Will: "+will);
						System.out.println();
						System.out.println("Equipment");
						System.out.println("_______________________");
						System.out.println("_______________________");
						System.out.println("_______________________");
						System.out.println("_______________________");
						System.out.println("_______________________");
						System.out.println("_______________________");
						System.out.println("_______________________");
						System.out.println("_______________________");
						System.out.println("_______________________");
						System.out.println("_______________________");
						System.out.println();
						System.out.println("Skills");
								System.out.println();
								for(int i=0; i< skills.size();i++)
								{
									String skill = (String)skills.get(i);
									System.out.println((i+1)+". "+ skill);
								}
						System.out.println();

						System.out.println("Special Abilities");
								System.out.println();
								for(int i=0; i< ability.size();i++)
								{
									String abilitys = (String)ability.get(i);
									System.out.println((i+1)+". "+ abilitys);
								}
						System.out.println();
						System.out.println(Notes);
						System.out.println();

						PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter(characterNameTextField.getText()+".txt",true)));
						out.println("Name: "+name+"\n");
						out.println("Alignment: "+alg+"\n");
						out.println("Race: "+Race+"\n");
						out.println("Class: "+clss+" XP: "+xp+" Level: "+level+"\n");
						out.println();
						out.println("STR: "+str+" + "+strMod);
						out.println("CON: "+con+" + "+conMod);
						out.println("DEX: "+dex+" + "+dexMod);
						out.println("INT: "+intt+" + "+inttMod);
						out.println("WIS: "+wis+" + "+wisMod);
						out.println("CHA: "+cha+" +: "+chaMod);
						out.println();
						out.println("Weapons");
						out.println("1: "+weapon1);
						out.println("2: "+weapon2);
						out.println("3: "+weapon3);
						out.println();
						out.println("Armor");
						out.println(armor1+" armor");
						out.println(armor2+ "shield");
						out.println();
						out.println("Defenses");
						out.println("ArmorClass: "+ac);
						out.println("Fortitude: "+fort+" Reflex: "+reflex+" Will: "+will);
						out.println();
						out.println("Equipment");
						out.println("_______________________");
						out.println("_______________________");
						out.println("_______________________");
						out.println("_______________________");
						out.println("_______________________");
						out.println("_______________________");
						out.println("_______________________");
						out.println("_______________________");
						out.println("_______________________");
						out.println("_______________________");
						out.println();

						out.println("Skills");
						out.println();
							for(int i=0; i< skills.size();i++)
							{
								String skill = (String)skills.get(i);
								out.println((i+1)+". "+ skill);
							}
						out.println();

						out.println("Special Abilities");
						out.println();
							for(int i=0; i< ability.size();i++)
							{
								String abilitys = (String)ability.get(i);
								out.println((i+1)+". "+ abilitys);
							}
						out.println();
						out.println(Notes);
						out.println();

						out.close();
						}
						catch(IOException ioe)
						{}
						acTextField.setText("NA");
						//longitudeTextField.setText("");
						//pointNameTextField.setText("");

			}
	}
}