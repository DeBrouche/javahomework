public class homework11_5_9_3 {
    public static void main(String[] args) {
        // 创建一个Date对象
        java.util.Date date = new java.util.Date();
    
        /*显示日期时间，流失时间分别为10000、   
        100000、1000000、10000000、100000000、1000000000、 
        10000000000、和100000000000*/
        System.out.println("\n流失时间为10000、 "  +
            "100000、1000000、10000000、\n100000000、1000000000、10000000000、" +
            "和100000000000的日期和时间分别是：");
        //从10e4迭代到10e10
        for (long i = 10000; i <= 1e11; i *= 10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}