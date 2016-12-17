package qin.goods7.test;

import org.junit.Test;

/**
 * Created by Administrator on 2016/12/11 12-011-11.<br/>
 */
@SuppressWarnings("all")
public class Save14 extends SpringTest
{
    @Test
    public void printCode()
    {
        String[] s = {
                  "音像",
                  "少儿",
                  "教育",
                  "文艺",
                  "经管励志",
                  "人文社科",
                  "生活",
                  "科技",
                  "刊/原版",
                  "电子书",
                  "数字音乐"
        };

        makeCode(s);
    }

    @Test
    public void all()
    {
//        saveChildren0();
//        saveChildren1();
//        saveChildren2();
//        saveChildren3();
//        saveChildren4();
//        saveChildren5();
//        saveChildren6();
//        saveChildren7();
//        saveChildren8();
//        saveChildren9();
        saveChildren10();
      /*  saveChildren11();
        saveChildren12();*/
        transaction.commit();
    }
}