package com.example.demo.controller;
import com.example.demo.dto.ResponseDTO;
import com.example.demo. dto. TestRequestBodyDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind. annotation. GetMapping;
import org.springframework.web.bind. annotation.PathVariable;
import org.springframework.web.bind. annotation.RequestBody;
import org.springframework.web.bind. annotation.RequestMapping;
import org.springframework.web.bind. annotation.RequestParam;
import org.springframework.web.bind. annotation. RestController;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("test")
public class TestController {
// /test 경로는 이미 존재하므로 /test/testRequestBody로 지정했다.
	@GetMapping("/testRequestBody")
	public String testControllerRequestBody(@RequestBody TestRequestBodyDTO
			testRequestBodyDTO) {
		return "Hello world! ID " + testRequestBodyDTO.getId() + " Message: " +
				testRequestBodyDTO.getMessage();
	}
	
	@GetMapping("/testResponseEntity")
	public ResponseEntity<?> testControllerResponseEntity() {
	List<String> list = new ArrayList<>();
	list.add("Hello world! I'm ResponseEntity. And you got 400!");
	ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
	// http status 4000374
	return ResponseEntity.badRequest().body(response);
	}
}