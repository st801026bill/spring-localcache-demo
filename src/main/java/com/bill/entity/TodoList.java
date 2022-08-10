package com.bill.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "todo_list")
public class TodoList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seq_no", nullable = false)
	private Integer seqNo;
	
	@Column(name = "todo", nullable = false)
	private String todo;

	@Column(name = "is_done", nullable = false)
	private Boolean isDone;

	@Column(name = "create_date_time", nullable = false)
	private LocalDateTime createDateTime;
	
	@Column(name = "update_date_time", nullable = false)
	private LocalDateTime updateDateTime;
}
