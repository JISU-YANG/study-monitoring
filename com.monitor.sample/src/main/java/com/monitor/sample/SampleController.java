package com.monitor.sample;

import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class SampleController {

    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @GetMapping("/")
    public String hello(HttpServletResponse res) throws IOException {
        logger.info("Access denied, 403 Forbidden");
        res.sendError(HttpServletResponse.SC_FORBIDDEN, "Access denied");
        return null;
    }

}
