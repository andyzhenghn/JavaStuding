package B_Base;

public class ArrayType {
    public static void main(String[] args) {
        // java数组的特点：
        // 1. 数组所有元素初始化为默认值，整型都是 0，浮点型是 0.0，布尔型是 false
        // 2. 数组一旦创建后，大小不可改变
        int [] ns = new int[5];
        ns[0] = 1;
        ns[1] = 2;
        ns[2] = 3;
        ns[3] = 4;
        ns[4] = 5;
        
        int len = ns.length;
        // 索引超出范围报错

        // 直接初始化数组
        int [] nss = new int[] {2, 3, 4, 5, 6};
        // 进一步简写
        int [] nsss = {2, 3, 4, 5, 6};

        // 字符串数组
        String[] names = {
          "hah", "haha", "hahah"
        };

    }
}

/**
 * 小结：
 * 数组是同一个数据类型的集合，数组一旦创建后，大小不可变
 * 可以通过索引访问数组元素，但索引超出范围将报错
 * 数组元素可以是值类型或引用类型，但数组本身是引用类型
 */