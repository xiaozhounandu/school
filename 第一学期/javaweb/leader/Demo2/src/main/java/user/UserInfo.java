package user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName user.UserInfo
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-13-21-17
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

        private String userName;    // 用户名
        private String userPwd;     // 密码
        private int userAge;        // 年龄
        private String email;       // Email


}
