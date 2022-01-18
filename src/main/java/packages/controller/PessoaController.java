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

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

@Autowired
    ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void inserirPessoa (PessoaInsertionDTO pessoaInsertionDTO){
        Pessoa pessoa = new Pessoa();
        pessoa = modelMapper.map(pessoaInsertionDTO, Pessoa.class);
    }

}
