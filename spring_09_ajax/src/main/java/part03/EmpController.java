package part03;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

// http://localhost:8090/myapp/empsearch.do

@Controller
public class EmpController {
	private EmployeesDAO dao;

	public EmpController() {

	}

	public void setDao(EmployeesDAO dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/empsearch.do", method = RequestMethod.GET)
	public String execute() {
		return "part03/empList";

	} // end execute()

	// @ResponseBody : List를 배열로 바꿔주는 어노테이션. json형태로 바꿔준다. json라이브러리 필요
	@ResponseBody
	@RequestMapping(value = "/empsearch.do", method = RequestMethod.POST)
	public List<EmployeesDTO> process(String data) {
		System.out.println(data);
		System.out.println(dao.search(data));
		return dao.search(data);
	} // end process()
	
} // end class

/*
 * [DTO, DTO] : List => DTO => Object => Array
 * 아래의 결과는 json형태이다.
 * [{employee_id:100, first_name:'Steven', salary:24000},
 * 	{employee_id:128, first_name:'Steven', salary:2200}]
 */
