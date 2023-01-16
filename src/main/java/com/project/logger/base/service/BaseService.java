package com.project.logger.base.service;

import com.project.logger.base.repository.BaseRepository;
import jakarta.persistence.MappedSuperclass;

import java.util.List;


@MappedSuperclass

public abstract class BaseService<T,ID extends Number>{

    private  final BaseRepository<T,ID> baseRepository;

    protected BaseService(BaseRepository<T, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }


    public T findById(ID id){
        return baseRepository.findById(id).orElse(null);
    }

    public List<T> findAll(){
        return baseRepository.findAll();
    }

    public T insert(T  model){
        return baseRepository.save( model);
    }

    public T update(T  model){
        return baseRepository.save( model);
    }

    void deleteById(ID id){
         baseRepository.deleteById(id);
    }

    void deleteAll(List<ID> ids){
        ids.forEach(id -> {
            baseRepository.deleteById(id);
        });
    }

}
