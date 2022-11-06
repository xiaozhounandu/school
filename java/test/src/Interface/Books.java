package Interface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Son
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-03-20-54
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private int bookId;
    private String bookName;
    private int bookCounts;
    private String detail;



}
