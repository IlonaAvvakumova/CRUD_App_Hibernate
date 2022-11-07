package com.crud.service;

import com.crud.model.Label;
import com.crud.repository.Hibernate.HiberLabelRepository;
import com.crud.repository.LabelRepository;

import java.util.List;

public class LabelService {
    LabelRepository labelRepository;


    public LabelService() {
        this.labelRepository = new HiberLabelRepository();
    }



    public List<Label> getAll() {
        return null;
    }


    public Label getById(Integer integer) {
        return null;
    }


    public Label create(Label label) {
        return null;
    }


    public Label update(Label label) {
        return null;
    }


    public void deleteById(Integer id) {

    }
}
