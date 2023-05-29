package pm.apipessoa.api.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pm.apipessoa.api.assembler.PessoaModelAssembler;
import pm.apipessoa.api.model.PessoaModel;
import pm.apipessoa.domain.model.Pessoa;
import pm.apipessoa.domain.service.PessoaService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/pessoa", produces = MediaType.APPLICATION_JSON_VALUE)
public class PessoaController {

    private final PessoaService pessoaService;

    private PessoaModelAssembler pesssoaModelAssembler;



    public PessoaController(PessoaService pessoaService, PessoaModelAssembler pesssoaModelAssembler) {
        this.pessoaService = pessoaService;
        this.pesssoaModelAssembler = pesssoaModelAssembler;
    }

    @GetMapping("{codigo}")
    public PessoaModel obterPessoa(@PathVariable Long codigo) {

        Mono<Pessoa> pessoaConsulta = pessoaService.buscarOuFalhar(codigo);
        Pessoa pessoa = pessoaConsulta.block();


        return pesssoaModelAssembler.toModel(pessoa);

    }
}
