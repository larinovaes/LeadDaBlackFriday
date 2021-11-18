package br.com.zup.Lead;

import br.com.zup.Lead.model.Lead;
import br.com.zup.Lead.respository.LeadRepository;
import br.com.zup.Lead.respository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeadService {
    @Autowired
    private LeadRepository leadRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    public Lead salvarLead(Lead lead) {
        return leadRepository.save(lead);
    }

    public  Lead salvarLeadComProdutos(Lead lead) {
        produtoRepository.saveAll(lead.getProdutos());
        return salvarLead(lead);
    }
}
