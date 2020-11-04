import java.util.ArrayList;
public class homework11_5_13_3 {
    //主方法
	public static void main(String[] args) {
		//创建arraylist
		ArrayList<Number> list = new ArrayList<>();

		//向表中添加数字
		list.add(2);
		list.add(4);
		list.add(3.2);
		list.add(5.22);
		list.add(4.5);
		list.add(3.11);
		list.add(5.445);
		list.add(5.0);

		System.out.println(list.toString());

		// 排序
		sort(list);

		//显示排序后的数字
		System.out.println(list.toString());
	}

	//排序数字的ArrayList
	public static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			// Find the mimimum in the list
			Number min = list.get(i);
			int minIndex = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (min.doubleValue() > list.get(j).doubleValue()) {
					min = list.get(j);
					minIndex = j;
				}
			}

			// 可以将list.get(i)与list.get(minIndex)交换
			if (minIndex != i) {
				list.set(minIndex, list.get(i));
				list.set(i, min);
			} 
		}
	}
}
