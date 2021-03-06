package com.org.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@RequestMapping("/src/sample")
	public SampleResponse Sample(@RequestParam(value="name",defaultValue="RestFul WebService")String name){
		SampleResponse res=new SampleResponse();
		res.setId(105);
		res.setName("your service is : "+name);
		return res;
	}
	
	@RequestMapping("/goodPage")
	public String goodPage() {
		String s="This is my RestFul srvices and here we are usng HTTP method -->for request and response";
		return s;
	}
	
	@RequestMapping(value="/test",method=RequestMethod.POST)
	public PostResponse Test(@RequestBody PostRequest inputload) {
		PostResponse res =new PostResponse();
		res.setId(inputload.getId());
		res.setMessage("Hello "+inputload.getName());
		res.setRef("taking ref from some friends");
		return res;
	}
}
