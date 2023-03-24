package draw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;

/**
 * @author Zen.Liu
 * @since 2023-03-23
 */
@EnableMBeanExport
@SpringBootApplication
public class Launcher {
    public static void main(String[] args) {
        SpringApplication.run(Launcher.class,args);
    }
}
