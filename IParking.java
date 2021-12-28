package 停车场管理;

import java.util.Scanner;

public interface IParking extends IParams{

	// 打印输出结果
	public void print();
	public boolean addCar(int carType);
	// 解析命令行输入的参数（格式），如文档描述
	public static IParams parse() throws Exception{
	return new ParkingSystem();
	};

}