package qin.goods7.test;

import org.junit.Test;
import qin.goods7.domain.Goods;

public class SaveGoodsData extends SpringTest
{
    @Test
    public void deleteGoods()
    {
        Goods goods = (Goods) session
                  .createQuery("from Goods where id=1")
                  .list()
                  .get(0);

        session.delete(goods);
        transaction.commit();
    }
}
























