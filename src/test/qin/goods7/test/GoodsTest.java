package qin.goods7.test;

import org.junit.Test;
import qin.goods7.domain.GoodsType;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GoodsTest extends SpringTest
{
    @Test
    public void searchGoods()
    {
        List list = session
                  .createQuery("from Goods ")
                  .list();

        Object obj = 0;
    }

    @Test
    public void printGoods() throws Exception
    {
        StringBuilder sb = new StringBuilder();

        //查询所有上级记录
        List<GoodsType> parentList = session
                  .createQuery("from GoodsType where goodsTypeParent is null ")
                  .list();

        for (int i = 0; i < parentList.size(); i++)
        {
            Set<GoodsType> gs = parentList.get(i).getGoodsType_childrenSet();

            sb.append(parentList.get(i).getGoodsTypeName()).append(":");

            //计数器用, 当到5时自动记录
            int index = 0;

            for (Iterator<GoodsType> it = gs.iterator(); it.hasNext(); index++)
            {
                GoodsType g = it.next();
                //只输出5条记录
                if (index == 5)
                {
                    sb.append("更多......");
                    break;
                }
                else
                {
                    sb.append(g.getGoodsTypeName()).append('\t');
                }
            }

            sb.append("\n");
        }

        /*
        Set<GoodsType> gs1 = parentList.get(0).getGoodsType_childrenSet();

        for (Iterator<GoodsType> it = gs1.iterator(); it.hasNext(); ) {
            GoodsType g = it.next();
            sb.append(g.getGoodsTypeName()).append(',');
        }

        sb.append("\n");

        Set<GoodsType> gs2 = parentList.get(2).getGoodsType_childrenSet();

        for (Iterator<GoodsType> it = gs2.iterator(); it.hasNext(); ) {
            GoodsType g = it.next();
            sb.append(g.getGoodsTypeName()).append(',');
        }
        */

        System.out.println(sb.toString());
    }
}

















