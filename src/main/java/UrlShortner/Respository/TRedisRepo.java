package UrlShortner.Respository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import UrlShortner.Entity.UrlRedis;

@Repository
public interface TRedisRepo extends CrudRepository<UrlRedis, String>
{
    
}
