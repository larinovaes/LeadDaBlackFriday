package br.com.zup.Lead.respository;

import br.com.zup.Lead.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
