package com.dio.study.restfullapplication.controller;

import com.dio.study.restfullapplication.controller.request.SoldadoEditRequest;
import com.dio.study.restfullapplication.dto.SoldadoDTO;
import com.dio.study.restfullapplication.service.SoldadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {
    private final SoldadoService soldadoService;

    private SoldadoController(SoldadoService soldadoService) {
        this.soldadoService = soldadoService;
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<SoldadoDTO> buscarSoldado(@PathVariable("cpf") String cpf) {
        SoldadoDTO soldadoDTO = soldadoService.buscaSoldado(cpf);
        return ResponseEntity.ok(soldadoDTO);
    }

    @PostMapping
    public ResponseEntity criarSoldado(@RequestBody SoldadoDTO soldadoDTO) {

        soldadoService.criarSoldado(soldadoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{cpf}")
    public ResponseEntity editarSoldado(@PathVariable("cpf") String cpf,
                                        @RequestBody SoldadoEditRequest soldadoEditRequest) {
        soldadoService.alterarSoldado(cpf, soldadoEditRequest);

        return ResponseEntity.ok().build();

    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity deletarSoldado(@PathVariable("cpf") String cpf) {
        soldadoService.excluirSoldado(cpf);

        return ResponseEntity.ok().build();

    }

    @GetMapping
    public ResponseEntity<List<SoldadoDTO>> buscarSoldadoList() {
        List<SoldadoDTO> soldados = soldadoService.buscaSoldados();
        return ResponseEntity.ok(soldados);
    }


}
