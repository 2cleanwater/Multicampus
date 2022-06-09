package my.com.admin;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import my.com.entity.Member;



public interface AdminMemberRepository extends JpaRepository<Member, String>{

	List<Member> findByIsLeaveEquals(Boolean isLeave);
	
}
