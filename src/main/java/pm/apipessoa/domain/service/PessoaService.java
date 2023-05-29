package pm.apipessoa.domain.service;

import org.springframework.stereotype.Service;
import pm.apipessoa.domain.exception.PessoaNaoEncontradaException;
import pm.apipessoa.domain.model.Pessoa;
import pm.apipessoa.domain.repository.PessoaRepository;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }


    public Mono<Pessoa> buscarOuFalhar(Long pessoaCodigo) {
        return Mono.fromCallable(() -> pessoaRepository.findById(pessoaCodigo))
                .publishOn(Schedulers.boundedElastic())
                .flatMap(Mono::justOrEmpty)
                .switchIfEmpty(Mono.error(() -> new PessoaNaoEncontradaException(pessoaCodigo)));
    }
}
