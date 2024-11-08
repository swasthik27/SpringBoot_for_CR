package com.CRM.CRManager.service;

import com.CRM.CRManager.model.Query;
import com.CRM.CRManager.repository.QueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryService {

    @Autowired
    private QueryRepository queryRepository;

    public List<Query> getAllQueries() {
        return queryRepository.findAll();
    }

    public Query saveQuery(Query query) {
        return queryRepository.save(query);
    }

    public void deleteQuery(Long id) {
        queryRepository.deleteById(id);
    }
}
