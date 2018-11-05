
import com.itheima.dao.bookDao;
import com.itheima.domain.Book;
import com.itheima.domain.Kind;
import com.itheima.domain.Total;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class booktest {
    public static void main(String[] args) throws IOException {
        //读取配置文件
        InputStream stream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建sqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = builder.build(stream);
        //生产sqlSession对象
        SqlSession session = build.openSession(true);
        //使用SqlSession创建dao接口的代理对象
        bookDao dao = session.getMapper(bookDao.class);
        //注解查询
       /* List<Book> all = dao.findAll();
        for (Book book : all) {
            System.out.println(book);
        }*/
       //注解删除
       /* dao.del(5);*/

        //注解添加
        /*dao.save("数学类");*/

        /*List<Book> books = dao.find();
        for (Book book : books) {
            System.out.println(book.getBookname());
            System.out.println(book.getKind().getKind_name());
        }*/

       /* List<Kind> list = dao.findByKind();
        for (Kind kind : list) {
            System.out.println(kind.getKind_name());
            System.out.println(kind.getList().get(0).getBookname());
        }*/
        //查询小于一百元的书籍信息
       /* List<Book> byPrice = dao.findByPrice(100);
        for (Book book : byPrice) {
            System.out.println(book.getBookname());
        }*/
       //查询书籍的价格数量以及总价钱
        List<Total> byInfo = dao.findByInfo();
        for (Total total : byInfo) {
            System.out.print(total.getBook().getBookname()+"     ");
            System.out.print(total.getBook().getPrice()+"     ");
            System.out.print(total.getNums()+"     ");
            System.out.println(total.getNum());
        }
        session.close();
    }
}