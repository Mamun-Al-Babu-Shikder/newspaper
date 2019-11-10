package com.mcubes.newspaper.dao;

import com.mcubes.newspaper.entity.Admin;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by A.A.MAMUN on 11/11/2019.
 */
@Transactional
public interface  AdminDao extends CrudRepository<Admin, Integer> {


}
