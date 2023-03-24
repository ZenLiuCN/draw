package tools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;

import java.nio.file.Paths;

/**
 * @author Zen.Liu
 * @since 2023-03-24
 */
@EnableMBeanExport
@SpringBootApplication
public class DevServer {

    public static void main(String[] args) {
        System.out.println(Paths.get("").toAbsolutePath());
        SpringApplication.run(DevServer.class,args);
    }
}
