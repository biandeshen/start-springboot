/**
 * FileName: UserRepository
 * Author:   fanjiangpan
 * Date:     2017/12/25 15:55
 * Description: UserRepository
 * History:
 * <author>          <time>          <version>
 * fanjiangpan           2017/12/25           版本号
 */
package top.biandeshen.springbootjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import top.biandeshen.springbootjpa.entity.User;

/**
 * 〈UserRepository〉
 *
 * @author fanjiangpan
 * @since 1.0.0
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

    User findByNameAndAge(String name, Integer age);

    @Query("from User u where u.name=:name")
    User findUser(@Param("name") String name);


}
