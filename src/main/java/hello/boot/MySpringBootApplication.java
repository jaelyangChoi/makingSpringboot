package hello.boot;

import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented //문서화
@ComponentScan //컴포넌트 스캔 기능
public @interface MySpringBootApplication {
}
