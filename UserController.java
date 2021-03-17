@Controller
public class UserController {

	@RequestMapping("/user/insert.do")
	public String insert() {
	logger.info("경로 : login");
	return "user/login";
	logger.info("경로 : insert");
	return "user/insert";

	}

	@RequestMapping("/user/insert.do")
	public String insert() {
	logger.info("경로 : insert");
	return "user/insert";

	}

	@RequestMapping("/user/update.do")
	public String update() {
	logger.info("경로 : update");
	return "user/update";

	}
}