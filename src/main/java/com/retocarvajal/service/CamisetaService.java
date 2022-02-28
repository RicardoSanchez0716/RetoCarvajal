package com.retocarvajal.service;

import java.util.ArrayList;
import java.util.Iterator;


import com.retocarvajal.model.Camiseta;
import com.retocarvajal.repository.CamisetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Service
public class CamisetaService implements CamisetaRepository{

    @Autowired
    private CamisetaRepository camisetaRepository;

    @Override
    public List<Camiseta> findAll() {
        return camisetaRepository.findAll();

    }

    @Override
    public List<Camiseta> findAll(Sort sort) {
        return camisetaRepository.findAll(sort);
    }

    @Override
    public Page<Camiseta> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Camiseta> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Camiseta entity) {
        camisetaRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Camiseta> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Camiseta> S save(S entity) {
        return camisetaRepository.save(entity);
    }

    @Override
    public <S extends Camiseta> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Camiseta> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Camiseta> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Camiseta> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Camiseta> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Camiseta getOne(Long aLong) {
        return null;
    }

    @Override
    public Camiseta getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Camiseta> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Camiseta> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Camiseta> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Camiseta> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Camiseta> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Camiseta> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Camiseta, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
