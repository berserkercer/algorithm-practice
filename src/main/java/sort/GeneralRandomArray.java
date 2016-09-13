package sort;

import java.util.Random;

/**
 * 随机数组生成器
 *
 * @author ChengJianLong
 */
public class GeneralRandomArray {
    public static int[] init(int length, int range) {
        int[] array = new int[length];
        Random r = new Random();
        for (int i = 0; i < length; ++i) {
            array[i] = r.nextInt(range);
        }
        return array;
    }
}
