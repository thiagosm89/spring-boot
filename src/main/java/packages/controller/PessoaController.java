package packages.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import packages.domain.Pessoa;
import packages.dto.PessoaInsertionDTO;
import packages.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    private final PessoaService pessoaService;
    private  final ModelMapper modelMapper;

    @Autowired
    public PessoaController(PessoaService pessoaService, ModelMapper modelMapper) {
        this.pessoaService = pessoaService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoa inserirPessoa (PessoaInsertionDTO pessoaInsertionDTO){
        Pessoa pessoa = modelMapper.map(pessoaInsertionDTO, Pessoa.class);
        return pessoaService.inserirPessoa(pessoa);
    }

}
