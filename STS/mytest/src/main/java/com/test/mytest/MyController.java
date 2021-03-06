package com.test.mytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController // 화면구성을 위한 view로 리턴되지 않고 결과를 데이터 직렬화로 http response에 직접 쓴다.
				// @Controller and @ResponseBody
public class MyController {
	@Autowired
	private MyService myservice;

	// request get 방식으로 연동해 주는 spring webMvc / produces는 리턴되는 미디어 타입
	@GetMapping(value="/server", produces=MediaType.TEXT_EVENT_STREAM_VALUE)
	Flux<Address> serviceAddress(){
		return this.myservice.getAllAddress();
	}
}