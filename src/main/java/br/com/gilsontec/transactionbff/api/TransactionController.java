package br.com.gilsontec.transactionbff.api;

import br.com.gilsontec.transactionbff.dto.RequestTransactionDto;
import br.com.gilsontec.transactionbff.dto.TransactionDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("transaction")
public class TransactionController {

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDto> buscarTransacao(@PathVariable("id") final String uuid){
        return Mono.empty();
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDto> enviarTransacao(@RequestBody final RequestTransactionDto requestTransactionDto){
        return Mono.empty();
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDto> removerTransacao(@PathVariable("id") final String uuid){
        return Mono.empty();
    }

    @PatchMapping(value = "/{id}/confirmar")
    public Mono<TransactionDto> confirmarTransacao(@PathVariable("id") final String uuid){
        return Mono.empty();
    }
}
