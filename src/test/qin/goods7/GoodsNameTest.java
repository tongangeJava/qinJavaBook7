package qin.goods7;

import org.junit.Test;
import qin.goods7.domain.GoodsType;
import qin.goods7.test.SpringTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GoodsNameTest extends SpringTest
{
    /**
     * 显示所有分类
     */
    @Test
    public void test1()
    {
        List<GoodsType> parentList = session
                  .createQuery("from GoodsType where goodsTypeParent is null ")
                  .list();
        List<String> nameList = new ArrayList<>();

        for (Iterator<GoodsType> it = parentList.iterator(); it.hasNext(); )
        {
            GoodsType g = it.next();
            nameList.add(g.getGoodsTypeName());
        }

        StringBuilder sb = new StringBuilder();
        List<Long> ints = new ArrayList<>();

        for (Iterator<String> it = nameList.iterator(); it.hasNext(); )
        {
            String names = it.next();
            List<GoodsType> gt1 = session
                      .createQuery("from GoodsType where goodsTypeParent.id=(select id from GoodsType where goodsTypeName='" + names + "')")
                      .list();
            sb.append("\n").append(names).append("类型:");
            for (Iterator<GoodsType> it1 = gt1.iterator(); it1.hasNext(); )
            {
                GoodsType goodsType = it1.next();
                //<a>
                sb.append("<a id=\"_").append(goodsType.getId()).append("\">");
                sb.append(goodsType.getGoodsTypeName() + "\t");
                //</a>
                sb.append("</a>");
                ints.add(goodsType.getId());
            }
            //sb.append("\n");
        }

        StringBuilder js = new StringBuilder()
                  .append("<script type=\"text/javascript\">\n")
                  .append("    $(function ()\n")
                  .append("        {\n")
                  .append("");

        for (Iterator<Long> it = ints.iterator(); it.hasNext(); )
        {
            Long l = it.next();
            js
                      .append("            $('#_")
                      .append(l)
                      .append("').click(function ()\n")
                      .append("                {\n")
                      .append("                    window.location.href = \"/mall/details.com?id=")
                      .append(l)
                      .append("\";\n")
                      .append("                }\n")
                      .append("            );\n");
        }

        js.append("        }\n").append("    );\n").append("</script>");

        sb.append(js);

        System.out.println(sb.toString());
    }

    private void printCollection(Collection c)
    {
        for (Iterator it = c.iterator(); it.hasNext(); )
        {
            System.out.println(it.next());
        }
    }
}














