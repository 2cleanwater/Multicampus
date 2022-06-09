package my.com.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@Data
@Entity
@DynamicInsert // Insert를 할 때 Entity 속성 중 null인 속성은 제외하고 쿼리 생성
@DynamicUpdate // update
public class Member {
	
	@Id
	private String userId;
	private String password;
	private String email;
	private String grade;
	private String tell;
	
	@Column(columnDefinition = "datetime default now()")
	private LocalDate regDate; //가입날짜
	
	@Column(columnDefinition = "int default 0")
	private Boolean isLeave; // 탈퇴유무
	
}
