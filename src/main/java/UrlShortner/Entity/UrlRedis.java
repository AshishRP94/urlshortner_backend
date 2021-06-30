package UrlShortner.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.data.redis.core.RedisHash;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@RedisHash
public class UrlRedis
{
    @Id
    private String id;
    private String longUrl;

}
