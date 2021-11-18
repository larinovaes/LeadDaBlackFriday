package br.com.zup.Lead.respository;

import br.com.zup.Lead.model.Lead;
import org.springframework.data.repository.CrudRepository;

public interface LeadRepository extends CrudRepository<Lead, String> {

}
