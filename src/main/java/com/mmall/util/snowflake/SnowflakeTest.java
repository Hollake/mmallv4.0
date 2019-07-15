package com.mmall.util.snowflake;

/**
 * Created by Hollake on 2019\7\14 0014 23:15.
 */
public class SnowflakeTest {
    public static void main(String[] args) {
        // 构造方法设置机器码：第2个机房的第5台机器
        SnowflakeUtil snowflake = new SnowflakeUtil(2, 5);
// 连续产生6个序号
        for (int i = 0; i < 20; i++) {
            long id = snowflake.nextId();
            System.out.println(String.format("%s => id: %d, hex: %s, bin: %s", snowflake.formatId(id), id,
                    BinHexUtil.hex(id), BinHexUtil.bin(id)));
        }
    }
}
