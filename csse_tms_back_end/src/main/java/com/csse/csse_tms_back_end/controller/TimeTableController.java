package com.csse.csse_tms_back_end.controller;

import com.csse.csse_tms_back_end.model.TimeTable;
import com.csse.csse_tms_back_end.services.MapValidationErrorService;
import com.csse.csse_tms_back_end.services.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/timetable")
public class TimeTableController {

    @Autowired
    private TimeTableService timeTableService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @PostMapping("")
    public ResponseEntity<?> createNewProject(@Valid @RequestBody TimeTable timeTable, BindingResult result){

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap!=null) return errorMap;

        TimeTable timeTable1 = timeTableService.saveOrUpdateTimeTable(timeTable);
        return new ResponseEntity<TimeTable>(timeTable1, HttpStatus.CREATED);
    }

    @GetMapping("/{projectId}")
    public ResponseEntity<?> getTimetableById(@PathVariable String projectId){

        TimeTable project = timeTableService.findTimeTableById(projectId);

        return new ResponseEntity<TimeTable>(project, HttpStatus.OK);
    }

    @GetMapping("/all")
    public Iterable<TimeTable> getAllTimetables(){return timeTableService.findAllProjects();}

    @DeleteMapping("/{projectId}")
    public ResponseEntity<?> deleteProject(@PathVariable String projectId){
        timeTableService.deleteProjectByIdentifier(projectId);

        return new ResponseEntity<String>("Project with ID: '"+projectId+"' was deleted", HttpStatus.OK);
    }

}
