package com.csse.csse_tms_back_end.services;

import com.csse.csse_tms_back_end.model.TimeTable;
import com.csse.csse_tms_back_end.repo.repository.TimeTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TimeTableService {

    @Autowired
    private TimeTableRepository timeTableRepository;


    public TimeTable saveOrUpdateTimeTable(TimeTable timetable) {

        timetable.setId(timetable.getId());
         return timeTableRepository.save(timetable);
//        try {
//            project.setId(project.getId());
//            return projectRepository.save(project);
//        } catch (Exception e) {
//             throw new ProjectIdException("Project ID '"+project.getProjectIdentifier().toUpperCase()+"' already exists");
//        }
    }
//
    public TimeTable findTimeTableById(String projectId){

        TimeTable project = timeTableRepository.findByTimetableId(projectId.toUpperCase());

        if(project == null){
          //  throw new ProjectIdException("Project ID '"+projectId+"' does not exist");

        }

        return project;
    }

    public Iterable<TimeTable> findAllProjects(){
        return timeTableRepository.findAll();
    }

    public void deleteProjectByIdentifier(String timetableId) {
        TimeTable project = timeTableRepository.findByTimetableId(timetableId.toUpperCase());

        if(project == null){
          //  throw  new  ProjectIdException("Cannot Project with ID '"+projectid+"'. This project does not exist");
        }

        timeTableRepository.delete(project);
    }
}
