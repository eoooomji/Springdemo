package part01.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/*
 * preHandle() - 요청 컨트롤러에 들어가기 전 접근
 * postHandle() - 요청 컨트롤러 접근 후 View 페이지 접근 전
 * afterCompletion() - 요청 컨트롤러 접근 후 View 페이지 접근 후 response 하기 전
 */
public class SampleInterceptor extends HandlerInterceptorAdapter{
	public SampleInterceptor() {
		
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle...");
		return true;
		// true란 정상적으로 처리 되었을 때 다음을 실행하라 라는 뜻
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle...");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion...");
	}
}
