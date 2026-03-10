package fr.a_irch.to_do.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.a_irch.to_do.model.Task;
import java.util.List;


public interface TaskRepository extends JpaRepository<Task, Long>{
    List<Task> findByDone(boolean done);
    List<Task> findByTitleContaining(String title);
}
