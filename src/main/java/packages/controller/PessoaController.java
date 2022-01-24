package packages.controller;

import javax.validation.Valid;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import packages.domain.Pessoa;
import packages.dto.PessoaDTO;
import packages.dto.PessoaInsertionDTO;
import packages.dto.PessoaUpdateDTO;
import packages.service.PessoaService;

@RestController
@RequestMapping("pessoa")
public class PessoaController extends GenericController {

    private final PessoaService pessoaService;

    @Autowired
    public PessoaController(PessoaService pessoaService, ModelMapper modelMapper) {
        super(modelMapper);
        this.pessoaService = pessoaService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PessoaDTO> inserirPessoa(@Valid @RequestBody PessoaInsertionDTO pessoaInsertionDTO) {
        Pessoa pessoa = convertToService(pessoaInsertionDTO, Pessoa.class);
        return responseCreated(pessoaService.inserirPessoa(pessoa), PessoaDTO.class);
    }

    @PutMapping
    public ResponseEntity<PessoaDTO> atualizarPessoa(@Valid PessoaUpdateDTO pessoaUpdateDTO) {
        Pessoa pessoa = convertToService(pessoaUpdateDTO, Pessoa.class);
        return responseOk(pessoaService.atualizarPessoa(pessoa), PessoaDTO.class);
    }
}
