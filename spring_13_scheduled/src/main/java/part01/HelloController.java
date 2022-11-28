package part01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import scheduler.SchedulerBean;

// http://localhost:8090/myapp/main.do

@Controller
public class HelloController {

	@RequestMapping("/main.do")
	public String execute() {
		return "part01/form";
	}

	// @Scheduled(fixedDelay = 1000)
	public void scheduledProcess() {
		System.out.println(new Date() + "스케쥴링 처리완료");
	}
}
