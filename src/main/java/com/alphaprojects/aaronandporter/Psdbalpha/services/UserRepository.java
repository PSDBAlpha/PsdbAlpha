package com.alphaprojects.aaronandporter.Psdbalpha.services;

import com.alphaprojects.aaronandporter.Psdbalpha.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jeffryporter on 6/8/17.
 */
public interface UserRepository extends CrudRepository<User, Integer>
{
}
