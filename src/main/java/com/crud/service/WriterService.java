package com.crud.service;


import com.crud.model.Writer;
import com.crud.repository.Hibernate.HiberWriterRepository;
import com.crud.repository.WriterRepository;

import java.util.List;

public class WriterService {

    WriterRepository writerRepository;

    public WriterService(){
        this.writerRepository = new HiberWriterRepository();
    }

    public List<Writer> getAll() {
        return null;
    }


    public Writer getById(Integer integer) {
        return null;
    }


    public Writer create(Writer writer) {
        return null;
    }


    public Writer update(Writer writer) {
        return null;
    }


    public void deleteById(Integer id) {

    }
}
