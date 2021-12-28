这是停车系统的代码！
关于停车系统。停车场总共有三种不同大小的车位：大，中和小，每种尺寸分别有固定数目的车位。
实现 ParkingSystem 类：
ParkingSystem(Integer big, Integer medium, Integer small) 初始化 ParkingSystem 类，三个参数分别对应每种停车位的数目。
bool addCar(Integer carType) 检查是否有 carType 对应的停车位。 carType 有三种类型：大，中，小，分别用数字 1， 2 和 3 表示。一辆车只能停在  carType 对应尺寸的停车位中。如果没有空车位，请返回 false ，否则将该车停入车位并返回 true 。
String[] parse(String input) 解析输入字符串（格式见示例）,返回字符串数组
void print() 输出结果（格式见示例）

示例
输入：
["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]
[[1, 1, 0], [1], [2], [3], [1]]
输出：
[null, true, true, false, false]
