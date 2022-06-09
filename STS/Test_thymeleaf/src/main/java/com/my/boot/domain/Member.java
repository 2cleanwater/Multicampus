package com.my.boot.domain;

import lombok.Data;

@Data // Pojo를 간단하게 구현할 수 있는 모듈
public class Member {
	private String userId;
	private String password;
	private String tell;
	private String grade;
	private Integer loginCnt;
	private String regDate;
}
