package co.ex.redis;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RedisService {

    @Cacheable(value = "myCache", key = "#key")
    public Map<String, Object> getCachedData(Map<String, Object> key) {
        System.out.println(key);
        return key;
    }
}
