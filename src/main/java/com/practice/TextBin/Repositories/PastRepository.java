package com.practice.TextBin.Repositories;

import com.practice.TextBin.Entitys.Past;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public interface PastRepository extends JpaRepository<Past, Long> {

    @Query(value = "select * from past p where p.link =?1 ", nativeQuery = true)
    Past getByLink(String link);

    @Query(value = "delete * from past p where p.link =?1 ", nativeQuery = true)
    void deleteByLink(String link);


}
