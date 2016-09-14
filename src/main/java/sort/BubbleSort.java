package sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author ChengJianLong
 */
public class BubbleSort {
    private static final Logger logger = LoggerFactory.getLogger(BubbleSort.class);

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
            logger.info("第{}次排序（交换{}次）: {}", i + 1, count, Arrays.toString(array));

            // 无交换，则说明排序已完成
            if (count == 0) {
                break;
            }
        }
    }

    public static void test(int length, int range) {
        long start = System.currentTimeMillis();
        int[] array = GeneralRandomArray.init(length, range);
        bubbleSort(array);
        logger.info("冒泡排序结果: {}", Arrays.toString(array));
        logger.info("用时: {}ms", System.currentTimeMillis() - start);
    }
}
