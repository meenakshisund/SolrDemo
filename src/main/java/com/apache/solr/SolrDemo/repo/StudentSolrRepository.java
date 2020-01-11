package com.apache.solr.SolrDemo.repo;

import com.apache.solr.SolrDemo.model.Student;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentSolrRepository extends SolrCrudRepository<Student, String> {

    public Student findStudentByAge(Integer age);
    public List<Student> findStudentByAgeBetween(Integer age1, Integer age2);
}