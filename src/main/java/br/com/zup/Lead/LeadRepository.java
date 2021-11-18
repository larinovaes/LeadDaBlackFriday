package br.com.zup.Lead;

import br.com.zup.Lead.model.LeadModel;
import org.springframework.data.repository.CrudRepository;

public interface LeadRepository extends CrudRepository<LeadModel, String> {

}
