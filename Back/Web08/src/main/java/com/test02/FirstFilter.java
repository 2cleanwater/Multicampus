package com.test02;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpFilter;


@WebFilter(urlPatterns ="*.jsp", initParams= @WebInitParam(name = "encoding",value = "euc-kr"))
public class FirstFilter extends HttpFilter implements Filter {

    public FirstFilter() {
        super();
    }

	public void destroy() {
		// ���񽺰� ����Ǳ� ���� ȣ��Ǿ� ����� ���͸� �Ҹ��ϴ� ���  
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		if(request.getCharacterEncoding() ==null) {
			 request.setCharacterEncoding(encode);
		}
		chain.doFilter(request, response);
	}

	private String encode;
	public void init(FilterConfig fConfig) throws ServletException {
		// ���Ͱ� ����Ǳ� ���� �ѹ� ȣ��Ǿ� ������ ���� ������ �ʱ�ȭ 
		this.encode  =  fConfig.getInitParameter("encoding");
	}
}

