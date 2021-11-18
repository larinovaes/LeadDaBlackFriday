package br.com.zup.Lead;

import br.com.zup.Lead.dtos.LeadDTO;
import br.com.zup.Lead.model.Lead;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/lead")
public class LeadController {
    @Autowired
    private LeadService leadService;
    @Autowired
    private ModelMapper modelMapper;


    @PostMapping
    public LeadDTO cadastrar(@RequestBody @Valid LeadDTO leadDTO) {
       Lead lead = modelMapper.map(leadDTO, Lead.class);
        leadService.salvarLeadComProdutos(lead);
        leadDTO = modelMapper.map(lead, LeadDTO.class);
        return leadDTO;
    }

}
