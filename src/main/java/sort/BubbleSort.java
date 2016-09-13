package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author ChengJianLong
 */
public class BubbleSort {
    public static void bubbleSort(int[] array) {
        if (array == null || array.length == 0) { return; }

        int length = array.length;
        for (int i = 0; i < length - 1; ++i) {
            int count = 0;
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    array[j + 1] += array[j];
                    array[j] = array[j + 1] - array[j];
                    array[j + 1] -= array[j];
                    ++count;
                }
            }
            System.out.println("第" + (i + 1) + "次排序（交换" + count + "次）: " + Arrays.toString(array));

            // 无交换，则说明排序已完成
            if (count == 0) {
                break;
            }
        }
    }

    public static void test(int length, int range) {
        long start = System.currentTimeMillis();
        int[] array = GeneralRandomArray.init(length, range);
        System.out.println("原始数组: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("冒泡排序结果: " + Arrays.toString(array));
        System.out.println("用时: " + (System.currentTimeMillis() - start) + " ms");
    }
}
