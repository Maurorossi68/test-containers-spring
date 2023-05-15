package demo.maurorossi68.testcontainerdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.maurorossi68.testcontainerdemo.entity.NumberEntity;

@Repository
public interface NumberJDAO extends JpaRepository<NumberEntity, Long> {

}
