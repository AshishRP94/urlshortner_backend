package UrlShortner.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfiguration {
	@Bean
	RedisConnectionFactory redisConnectionFactory()
	{
		RedisStandaloneConfiguration redis=new RedisStandaloneConfiguration();
		redis.setHostName("127.0.0.1");
		redis.setPort(6379);
		redis.setDatabase(1);
		return new JedisConnectionFactory( redis);
	}


	
	@Bean
	public RedisTemplate<String, Object> redisTemplate() {
	    RedisTemplate<String, Object> template = new RedisTemplate<>();
	    template.setConnectionFactory(redisConnectionFactory());
	    return template;
	}
	
	
}