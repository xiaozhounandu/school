package Interface;

import java.util.List;

/**
 * @ClassName BookMapper
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-03-21-00
 */


public interface BookMapper {


    int addBooks(Books book);

    int deleteBookById(int id);

    int updateBook(Books books);

    Books queryBooksById(int id);

    List<Books> queryAll();



}
