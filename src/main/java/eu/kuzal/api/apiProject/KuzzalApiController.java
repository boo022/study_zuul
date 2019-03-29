package eu.kuzal.api.apiProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KuzzalApiController {


    Logger logger = LoggerFactory.getLogger(KuzzalApiController.class);

    @GetMapping("/test")
    public String test() {
        logger.info("===========");
        logger.info("test 입니다.");
        logger.info("============");
        return "Test";
    }
}
