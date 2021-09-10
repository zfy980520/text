package com.zfy.text.until;

import javax.xml.bind.SchemaOutputResolver;

/**
 * @author zfy
 * 测试类
 * @date 2021/7/27
 */
public class text {
    public static void main(String[] args) {
        String str = "asdfhjklertyuiocvbnm";
        getString(str);
    }

// 返回此 String 的指定文本范围中的 Unicode 代码点数。
    public static void getString(String str){
        System.out.println(str.codePointCount(3,8));
        //按字典顺序比较两个字符串。
        System.out.println(str.compareTo("zxcvbnmsdFGhjkwertyu"));
        //不考虑大小写，按字典顺序比较两个字符串。
        System.out.println(str.compareToIgnoreCase("zxcvbnmsdfghjkwertyu"));
        //将指定字符串联到此字符串的结尾
        System.out.println(str.concat("aaaaa"));
        //当且仅当此字符串包含 char 值的指定序列时，才返回 true。
        System.out.println(str.contains("asd"));
    }
}
