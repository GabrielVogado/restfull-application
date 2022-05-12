package com.dio.study.restfullapplication.service;

import com.dio.study.restfullapplication.controller.request.SoldadoEditRequest;
import com.dio.study.restfullapplication.dto.SoldadoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SoldadoService {

    public SoldadoDTO buscaSoldado(String cpf){

        SoldadoDTO soldadoDTO = new SoldadoDTO();

        soldadoDTO.setCpf(cpf);
        soldadoDTO.setNome("Legolas");
        soldadoDTO.setRaca("Elfo da Floresta");
        soldadoDTO.setArma("Arco e Flecha");

        return soldadoDTO;
    }

    public void criarSoldado(SoldadoDTO soldadoDTO){

    }

    public void alterarSoldado(String cpf, SoldadoEditRequest soldadoEditRequest) {
    }

    public void excluirSoldado(String cpf) {
    }

    public List<SoldadoDTO> buscaSoldados() {

        SoldadoDTO soldadoDTO1 = new SoldadoDTO();

        soldadoDTO1.setCpf("123");
        soldadoDTO1.setNome("Aramis");
        soldadoDTO1.setRaca("Humano");
        soldadoDTO1.setArma("Espada de Mordor");

        SoldadoDTO soldadoDTO2 = new SoldadoDTO();

        soldadoDTO2.setCpf("321");
        soldadoDTO2.setNome("Legolas");
        soldadoDTO2.setRaca("Elfo da Floresta");
        soldadoDTO2.setArma("Arco e Flecha");


        return Arrays.asList(soldadoDTO1, soldadoDTO2);
    }
}
