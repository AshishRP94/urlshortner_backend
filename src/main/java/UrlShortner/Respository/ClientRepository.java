package UrlShortner.Respository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import UrlShortner.Entity.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client,Long>
{
    Optional<Client> findByClientName(String name);

}
