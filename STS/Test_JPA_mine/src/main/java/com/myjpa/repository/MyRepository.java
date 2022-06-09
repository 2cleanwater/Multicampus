package com.myjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myjpa.domain.Book;

/*커스텀 DAO를 만들고 싶다.
* 1. JpaRepository extends ->CRUD / page
	메소드 추가

2. JpaRepository implements를 한 후 class로 만들어 메소드 추가.

3. 여러개의 다중 테이블을 가지고 다중 매핑 (매핑과 조인), 동적 쿼리 =
4.8.1. Querydsl Extension *
https: //docs.spring.io/spring-data/jpa/docs/current/reference/html/#core. extensions. queryds1


	1차 = spring-boot (spring-jdbc, mapper_mybatis) + f
	2차 = spring-boot (jpa Querydsl Extension , f , 기능추가)
*/
@Repository
public interface MyRepository extends JpaRepository<Book, Long>{

}