package com.myjpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;
import lombok.Data;

//@Document - 비정형 서버로 관리
@Entity // 테이블 관리 -> 정형 서버로 관리 
@Data

public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(max=255)
	private String title;
}