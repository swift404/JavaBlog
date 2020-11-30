import java.util.Arrays;

public class GetMaxTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i = 0;
        do {
            if ((i+1) * 1.0 / arr.length > 0.8) {
                // break;
                System.out.println("\n继续添加将超出数组容量80%，进行" + 1.5 + "倍扩容");
              	// 定义一个新数组，长度为原数组1.5倍
                int[] newArr = new int[(int) (arr.length * 1.5)];
              	// 赋值原数组数据到新数组
                System.arraycopy(arr, 0, newArr, 0, arr.length);
              	// 复制原数组元素至新数组
                arr = newArr;
            }
            arr[i] = i + 1;
            System.out.printf("添加第%d个元素，当前数组长度为%d:%s\n", i + 1, arr.length, Arrays.toString(arr));
            i += 1;
        } while (i < 14);
    }
}