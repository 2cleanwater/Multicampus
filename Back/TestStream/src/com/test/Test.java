package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("���1", "���2", "���3", "���4");
		
		String[] array = { "������1", "������ 2", "������3", "������ 4" };

		Stream<String> stream1 = list.stream();// ����Ʈ�� ��Ʈ������

		// Stream ���
		PrintStream(stream1);
	}

	private static void PrintStream(Stream<String> m_stream) {
		m_stream.forEach(e -> System.out.printf("%5s", e));
		System.out.println("\n============================");
	}
}
