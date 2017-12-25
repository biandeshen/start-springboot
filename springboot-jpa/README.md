#### 使用SpringBoot以及Spring-Data-Jpa,简化对数据库操作语句的编写。
就单表操作而言，没有过于复杂的操作，无非是增删改查等基本操作
然而，它们除了字段不同，语句其实基本一致，我们却需要为每个单
独编写代码来实现。
所以，为了减少自己的工作量，完全可以将这些行为抽象出来。

通过SpringBoot-Data-Jpa就可以进行处理。

#####准备步骤
1. 添加依赖

`<dependency
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>`

2. 配置文件

`spring.datasource.url=jdbc:mysql://localhost:3306/test
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.jdbc.Driver

spring.jpa.properties.hibernate.hbm2ddl.auto=create-drop`

更多参考本项目配置文件application.properties

3. 创建实体

为实体需要的属性添加主键以及自动增长列的注解
参考本项目内实体

4. 创建数据访问接口

首先需要继承JpaRepository接口，可以实现一些基本操作。
（如创建save，更新，删除delete，查询findAll、findOne等）
就无需自己再定义

也可自定义方法，实现对数据的操作
本项目中有简单示例
更多请参考文章
[@Query注解的用法(Spring Data JPA)](https://www.cnblogs.com/zj0208/p/6008627.html)

5. 运行

运行程序，即可自动在数据库中生成表

6. 其他

方法测试可自行编写