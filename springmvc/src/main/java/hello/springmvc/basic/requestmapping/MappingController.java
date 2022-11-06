package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class MappingController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/hello-basic", method = RequestMethod.GET)
    public String mappingGetV1(){
        log.info("helloBasic");
        return "ok";
    }

    @GetMapping(value = "mapping-get-v2")
    public String mappingGetV2(){
        log.info("helloBasic");
        return "ok";
    }

    @GetMapping("/mapping/{userId}")
    public String mappingPath(@PathVariable String userId){
        log.info("mappingPath userId={}", userId);
        return "ok";
    }

    @GetMapping("/mapping/users/{userId}/orders/{orderId}")
    public String mappingPath(@PathVariable String userId, @PathVariable int orderId){
        log.info("mappingPath userId={}", userId);
        log.info("mappingPath orderId={}", orderId);
        return "ok";
    }

    @GetMapping(value="/mapping-params", params="mode=debug")
    public String mappingParams(){
        log.info("mappingParam");
        return "ok";
    }

    @GetMapping(value="/mapping-headers", headers="mode=debug")
    public String mappingHeader(){
        log.info("mappingHeader");
        return "ok";
    }

    @PostMapping(value="/mapping-consume", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String mappingConsumes(){
        log.info("mappingConsumes");
        return "ok";
    }

    @PostMapping(value="/mapping-produce", produces= MediaType.TEXT_HTML_VALUE)
    public String mappingProduces(){
        log.info("mappingProduces");
        return "ok";
    }
}
