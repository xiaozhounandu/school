package Interface;

import java.util.List;

/**
 * @ClassName booksImpl
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-03-21-08
 */


public class booksImpl implements bookService{
//调用dao层的操作，设置一个set接口，方便Spring管理
    private BookMapper bookMapper;

    //spring
    public void  setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBooks(Books book) {
        return bookMapper.addBooks(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBooksById(int id) {
        return bookMapper.queryBooksById(id);
    }

    @Override
    public List<Books> queryAll() {
        return bookMapper.queryAll();
    }

}
