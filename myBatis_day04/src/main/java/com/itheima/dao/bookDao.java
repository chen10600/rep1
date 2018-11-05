package com.itheima.dao;

import com.itheima.domain.Book;
import com.itheima.domain.Kind;
import com.itheima.domain.Total;
import org.apache.ibatis.annotations.*;
import sun.security.provider.NativePRNG;

import java.util.List;
import java.util.Map;

/*@CacheNamespace(blocking = true)*/
public interface bookDao {
    @Select("select * from book")
    List<Book> findAll();
    @Delete("delete from kind where id=#{i}")
    void del(int i);
    @Insert("insert into kind values(null,#{?})")
    void save(String string);


    @Select("select bookname,kind_name from book b,kind k where b.kind_id=k.id ")
    //column = "bookname"表示数据库中查询的数据   property = "bookname"表示把查询到的数据封装到javaBean的bookname属性中（也可以是其他的属性）
    @Results(@Result(column = "kind_name",property = "kind.kind_name"))
    List<Book> find();

    List<Kind> findByKind();

    List<Book> findByPrice(Integer integer);
    List<Total> findByInfo();
}
