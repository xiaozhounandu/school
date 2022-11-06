package Interface;

import java.util.List;

/**
 * @ClassName bookService
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-03-21-39
 */


public interface bookService {

    int addBooks(Books book);
    int deleteBookById(int id);

    int updateBook(Books books);

    Books queryBooksById(int id);


    List<Books> queryAll();
}
