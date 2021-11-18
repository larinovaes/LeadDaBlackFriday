package br.com.zup.Lead;

import br.com.zup.Lead.model.Lead;
import br.com.zup.Lead.model.Produto;
import br.com.zup.Lead.respository.LeadRepository;
import br.com.zup.Lead.respository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        for (Lead leadRef: leadRepository.findAll()) {
            if (leadRef.getEmail().equalsIgnoreCase(lead.getEmail())) {
                atualizarListaDeProduto(lead.getProdutos(), lead);
            }
        }
        produtoRepository.saveAll(lead.getProdutos());
        return salvarLead(lead);
    }

    public void atualizarListaDeProduto(List<Produto> produtos, Lead lead) {
        for (Produto produtoRef : produtos) {
            lead.getProdutos().add(produtoRef);
        }
    }

}
