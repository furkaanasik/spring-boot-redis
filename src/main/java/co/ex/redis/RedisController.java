package co.ex.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @PostMapping("/cache/{key}")
    public ResponseEntity<Map<String, Object> > cacheData(@PathVariable String key, @RequestBody Map<String, Object> data) {
        Map<String, Object> cachedData = this.redisService.getCachedData(data);
        return ResponseEntity.ok(cachedData);
    }

}
