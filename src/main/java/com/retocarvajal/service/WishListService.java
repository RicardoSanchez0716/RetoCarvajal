package com.retocarvajal.service;

import com.retocarvajal.model.WishList;
import com.retocarvajal.repository.WishListRepository;
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
public class WishListService implements  WishListRepository{

    @Autowired
    private WishListRepository wishListRepository;

    @Override
    public List<WishList> findAll() {
        return wishListRepository.findAll();
    }

    @Override
    public List<WishList> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<WishList> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<WishList> findAllById(Iterable<Long> longs) {
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
    public void delete(WishList entity) {
        wishListRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends WishList> entities) {

    }

    @Override
    public void deleteAll() {
        wishListRepository.deleteAll();
    }

    @Override
    public <S extends WishList> S save(S entity) {
        return wishListRepository.save(entity);
    }

    @Override
    public <S extends WishList> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<WishList> findById(Long aLong) {
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
    public <S extends WishList> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends WishList> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<WishList> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public WishList getOne(Long aLong) {
        return null;
    }

    @Override
    public WishList getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends WishList> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends WishList> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends WishList> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends WishList> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends WishList> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends WishList> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends WishList, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
