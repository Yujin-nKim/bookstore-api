package com.t3t.bookstoreapi.config;

import com.t3t.bookstoreapi.keymanager.service.SecretKeyManagerService;
import com.t3t.bookstoreapi.property.ObjectStorageProperties;
import com.t3t.bookstoreapi.property.SecretKeyProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Object Storage 연결에 필요한 속성을 설정하는 클래스
 * @author Yujin-nKim(김유진)
 */
@Configuration
public class ObjectStoragePropertiesConfig {

    /**
     * Object Storage 연결에 필요한 속성을 ObjectStorageProperties 객체에 설정하고 반환
     * @return Object Storage 연결에 필요한 속성이 정의된 객체 ObjectStorageProperties
     * @author Yujin-nKim(김유진)
     */
    @Bean
    public ObjectStorageProperties localObjectStorageProperties(
            @Value("${object-storage.storage-url}") String storageUrl,
            @Value("${object-storage.auth-url}") String authUrl,
            @Value("${object-storage.tenant-id}") String tenantId,
            @Value("${object-storage.user-name}") String userName,
            @Value("${object-storage.password}") String password) {
        return ObjectStorageProperties.builder()
                .storageUrl(storageUrl)
                .authUrl(authUrl)
                .tenantId(tenantId)
                .userName(userName)
                .password(password)
                .build();
    }

}
