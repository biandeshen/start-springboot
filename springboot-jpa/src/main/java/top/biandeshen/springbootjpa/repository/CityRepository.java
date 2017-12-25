/**
 * FileName: CityRepository
 * Author:   fanjiangpan
 * Date:     2017/12/25 16:08
 * Description: CityRepository
 * History:
 * <author>          <time>          <version>
 * fanjiangpan           2017/12/25           版本号
 */
package top.biandeshen.springbootjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import top.biandeshen.springbootjpa.entity.City;

import java.util.List;

/**
 * 〈CityRepository〉
 *
 * @author fanjiangpan
 * @since 1.0.0
 */
public interface CityRepository extends JpaRepository<City,Integer>{

    /*
        需要加上nativeQuery，否则运行出错
     */
    @Query(value = "select c from City c where c.cityId =: id",nativeQuery = true)
    City findByCityId(@Param("id") Integer id);

    @Query(value = "select c from City c where c.cityName =: name" , nativeQuery = true)
    City findByCityName(@Param("name") String name);

    @Query(value = "select c from City c where c.cityLevel =: level" , nativeQuery = true)
    City findByCityLevel(@Param("level") Integer level);

}
