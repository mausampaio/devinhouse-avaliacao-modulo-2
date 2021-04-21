package br.com.devinhouse.projeto04.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.devinhouse.projeto04.entity.Processo;

public interface ProcessoRepository extends CrudRepository<Processo, Long> {
}