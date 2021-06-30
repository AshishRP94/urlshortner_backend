package UrlShortner.Respository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import UrlShortner.Entity.Url;

@Repository
public interface UrlRepository extends CrudRepository<Url,Long>
{
    Optional<Url> findByUrl(String url);
}
