package com.t3t.bookstoreapi.property;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Redis 서버에 연결하기 위해 필요한 속성을 저장하는 프로퍼티 클래스
 * @author Yujin-nKim(김유진)
 */
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {
    private String serverIpAddress;
    private String serverPassword;
    private String serverPort;
    private Integer database;
}