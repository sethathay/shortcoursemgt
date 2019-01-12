package com.ckcc.shortcourse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ckcc.shortcourse.models.Student;

@Repository
public interface StudentInterface extends CrudRepository<Student, Integer> {

}
