package hello.exception.servlet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static javax.servlet.RequestDispatcher.*;

@Slf4j
@Controller
public class ErrorPageController {

    @RequestMapping("/error-page/404")
    public String errorPage404(HttpServletRequest request, HttpServletResponse response) {
        log.info("errorPage 404");
        printErrorInfo(request);
        return "error-page/404";
    }

    @RequestMapping("/error-page/500")
    public String errorPage500(HttpServletRequest request, HttpServletResponse response) {
        log.info("errorPage 500");
        printErrorInfo(request);
        return "error-page/500";
    }

    private void printErrorInfo(HttpServletRequest request) {
        log.info("{}", request.getAttribute(ERROR_EXCEPTION));
        log.info("{}", request.getAttribute(ERROR_EXCEPTION_TYPE));
        log.info("{}", request.getAttribute(ERROR_MESSAGE));
        log.info("{}", request.getAttribute(ERROR_REQUEST_URI));
        log.info("{}", request.getAttribute(ERROR_SERVLET_NAME));
        log.info("{}", request.getAttribute(ERROR_STATUS_CODE));
        log.info("dispatcherType {}", request.getDispatcherType());
    }
}
