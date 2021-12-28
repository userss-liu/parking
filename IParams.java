package 停车场管理;

import java.util.ArrayList;

public interface IParams {
	//获取大车位
	public int getBig();
	//获取中车位
	public int getMedium();
	//获取小车位
	public int getSmall();
	//获取停车序列
	public ArrayList<Integer> getPlanParking();
}
