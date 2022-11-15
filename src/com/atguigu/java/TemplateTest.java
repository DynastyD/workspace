package com.atguigu.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Zihao
 * @date 2022/11/15 - 23:04
 */
public class TemplateTest {

    //模板六： prsf :可生成 private static final
  //  private static final Customer cust = new Customer();

    //变形：psf
   // public static final
    //变形：psfi
   // public static final int
    //变形：psfs
   // public static final String


    //模板一： psvm / main
    public static void main(String[] args) {
        // 模板二：sout
        System.out.println("hello");

        //变形： soutp / soutm / soutv / xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplateTest.main");
        int num1 = 0;
        int num2 = 20;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


        // 模板三：fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei", "Lilei"};
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        // 变型：iter 增强for循环
            for (String s : arr) {
                System.out.println(arr[i]);
            }
        }

        // 变型： itar 普通for 循环
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }


        //模板四： list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {

        }

        //变形：list.fori 遍历
        for (int i = 0; i < list.size(); i++) {

        }

        //变形：list.forr 倒叙遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

        public void method(){

        //模板五： ifn
            ArrayList list = new ArrayList();
            list.add(123);
            list.add(345);
            list.add(567);

            if (list == null) {

            }

        //变形:inn
            if (list != null) {

            }
        //变形： xxx.nn  / xxx.null
            if (list != null) {

            }


        }


}
