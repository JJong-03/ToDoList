package dev.jong.todoapp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "ToDo")// entity의 이름
@Table(name = "todo")// entity가 어디랑 연결
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동 증가
    private Long id;


    public void setTodo(String todo) {
    }
}
