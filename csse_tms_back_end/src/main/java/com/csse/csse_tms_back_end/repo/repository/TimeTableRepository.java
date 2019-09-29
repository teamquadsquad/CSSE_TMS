package com.csse.csse_tms_back_end.repo.repository;

import com.csse.csse_tms_back_end.model.TimeTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeTableRepository extends CrudRepository<TimeTable, Long> {

    TimeTable findByTimetableId(String timetableId);

    @Override
    Iterable<TimeTable> findAll();

}
