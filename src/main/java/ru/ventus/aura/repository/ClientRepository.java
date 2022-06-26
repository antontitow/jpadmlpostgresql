package ru.ventus.aura.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.ventus.aura.model.Client;

/**
 * @autor : antontitow {@literal antontitow@bk.ru}
 * @created : 27.06.2022, 1:29
 */
@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {}
