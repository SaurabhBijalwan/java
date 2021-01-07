package in.nic.greencardtest;

import java.util.stream.Collectors;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@RequestMapping("/demo")
    public String demo(Authentication auth) {
        return String.format("Hello, %s. You have authorities: %s", auth.getPrincipal(),
                auth.getAuthorities().stream().map(a -> a.getAuthority()).collect(Collectors.joining(", ")));
    }
}
