package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("사원1", "사원2", "사원3", "사원4");
		
		String[] array = { "관리자1", "관리자 2", "관리자3", "관리자 4" };

		Stream<String> stream1 = list.stream();// 리스트를 스트림으로

		// Stream 출력
		PrintStream(stream1);
	}

	private static void PrintStream(Stream<String> m_stream) {
		m_stream.forEach(e -> System.out.printf("%5s", e));
		System.out.println("\n============================");
	}
}
