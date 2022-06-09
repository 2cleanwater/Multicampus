package my.com.entity;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@ToString(exclude = "files")
public class Board {	
	
	@Id
	@GeneratedValue
	private Long bdIdx; // 테이블 기본키
	
	@Column(columnDefinition = "datetime default now()")
	private LocalDate regDate; // 작성날짜
	
	private String title;//제목
	private String content;//내용
	
	@Column(columnDefinition = "int default 0")
	private Boolean isDel;//삭제유무
	
	@ManyToOne//N:1관계
	@JoinColumn(name = "userId") // 테이블 외래키의 속성
	private Member member;
	
}






