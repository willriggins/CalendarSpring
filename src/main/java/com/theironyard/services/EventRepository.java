package com.theironyard.services;

import com.theironyard.entities.Event;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by will on 6/23/16.
 */
public interface EventRepository extends CrudRepository<Event, Integer> {
}
