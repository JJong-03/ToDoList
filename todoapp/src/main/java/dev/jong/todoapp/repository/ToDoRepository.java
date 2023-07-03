package dev.jong.todoapp.repository;
//입력, 수정, 삭제를 도와줌

import dev.jong.todoapp.domain.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> { // Todo는 Entity 이름,Long = Domain의 id의 타입.
}
