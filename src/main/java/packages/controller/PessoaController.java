package packages.controller;

import javax.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import packages.domain.Pessoa;
import packages.dto.PessoaDTO;
import packages.dto.PessoaInsertionDTO;
import packages.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController extends GenericController {

    private final PessoaService pessoaService;

    @Autowired
    public PessoaController(PessoaService pessoaService, ModelMapper modelMapper) {
        super(modelMapper);
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public ResponseEntity<PessoaDTO> inserirPessoa (@Valid PessoaInsertionDTO pessoaInsertionDTO){
        Pessoa pessoa = convertToService(pessoaInsertionDTO, Pessoa.class);
        return responseCreated(pessoaService.inserirPessoa(pessoa), PessoaDTO.class);
    }

}
