package 停车场管理;

import java.util.ArrayList;
import java.util.Scanner;

public class ParkingSystem implements IParking{
	Scanner scan=new Scanner(System.in);
	int big,medium,small;
	static int j=0;
	ArrayList<Integer> array=new ArrayList<Integer>();
	ArrayList<String> output=new ArrayList<String>();
	public ParkingSystem(int big, int medium, int small) {
		this.big=big;
		this.medium=medium;
		this.small=small;
	}

	public ParkingSystem() {
		String input1=new String();
		String input2=new String();
		input1=scan.nextLine();
		String[] str1=parse(input1);
		input2=scan.nextLine();
		String[] str2=parse(input2);
		for(int i=0;i<str1.length;i++) {
			if(str1[i].equals("ParkingSystem")) {
				j=i;
				break;
			}
		}
		for(int i=0;i<str2.length;i++) {
			if(j==i) {
				big=Integer.parseInt(str2[i]);
				i++;
				medium=Integer.parseInt(str2[i]);
				i++;
				small=Integer.parseInt(str2[i]);
			}else {
				array.add(Integer.parseInt(str2[i]));
			}
		}
	}

	public static void main(String[] args) throws Exception{
		IParams params =IParking.parse();
		ParkingSystem ps=new ParkingSystem(params.getBig(),params.getMedium(),params.getSmall());
		ArrayList<Integer> plan=params.getPlanParking();
		for(int i=0;i<plan.size();i++){
		ps.addCar(plan.get(i));
		}
		ps.print();
	}

	@Override
	public void print() {
		output.add(j, "null");
		System.out.println(output);
	}

	@Override
	public boolean addCar(int carType) {
		if(carType==1 && big!=0) {
			big--;
			output.add("true");
			return true;
		}else if(carType==2 && medium!=0) {
			medium--;
			output.add("true");
			return true;
		}else if(carType==3 && small!=0) {
			small--;
			output.add("true");
		return true;
		}else{
			output.add("false");
			return false;
		}	
	}
	
	public int getBig() {
		return big;
	}

	@Override
	public int getMedium() {
		return medium;
	}

	@Override
	public int getSmall() {
		return small;
	}

	@Override
	public ArrayList<Integer> getPlanParking() {
		return array;
	}
	
	public String[] parse(String input) {
		String str="";
		String[] str1=new String[100];
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)!='[' && input.charAt(i)!=']' && input.charAt(i)!='\"' && input.charAt(i)!=' ') {
				str+=input.charAt(i);
			}
		}
		str1=str.split(",");
		return str1;
	}
}
