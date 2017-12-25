/**
 * FileName: City
 * Author:   fanjiangpan
 * Date:     2017/12/25 16:03
 * Description: City 类
 * History:
 * <author>          <time>          <version>
 * fanjiangpan           2017/12/25           版本号
 */
package top.biandeshen.springbootjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 〈City 类〉
 *
 * @author fanjiangpan
 * @since 1.0.0
 */
@Entity
public class City {
    @Id
    @GeneratedValue
    private Integer cityId;

    @Column(nullable = false)
    private String cityName;

    @Column(nullable = false)
    private Integer cityLevel;

    @Column(nullable = true)
    private Integer citySize;

    public City() {
    }

    public City(String cityName, Integer cityLevel) {
        this.cityName = cityName;
        this.cityLevel = cityLevel;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getCityLevel() {
        return cityLevel;
    }

    public void setCityLevel(Integer cityLevel) {
        this.cityLevel = cityLevel;
    }

    public Integer getCitySize() {
        return citySize;
    }

    public void setCitySize(Integer citySize) {
        this.citySize = citySize;
    }
}
