package sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;

/**
 * 随机数组生成器
 *
 * @author ChengJianLong
 */
public class GeneralRandomArray {
    private static final Logger logger = LoggerFactory.getLogger(GeneralRandomArray.class);

    public static int[] init(int length, int range) {
        int[] array = new int[length];
        Random r = new Random();
        for (int i = 0; i < length; ++i) {
            array[i] = r.nextInt(range);
        }
        logger.info("原始数组: {}", Arrays.toString(array));
        return array;
    }
}
