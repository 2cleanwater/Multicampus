package com.myjpa.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.myjpa.domain.Book;
//dao 에서 사용자 조건 코드를 추가하고 싶다면 class로 만들어서 Repository 재정의
// jpa가 주는 메소드를 그대로 실행하고 싶다면 interface로 extends한다. ([Repository]+)

@Repository("pageRepository")
public interface PageRepository extends PagingAndSortingRepository<Book, Long>{
	
}
