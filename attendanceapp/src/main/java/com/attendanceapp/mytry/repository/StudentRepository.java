package com.attendanceapp.mytry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.attendanceapp.mytry.entity.*;

public interface StudentRepository extends JpaRepository<Student, Long>  {

}
