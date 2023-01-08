package com.example.task.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "Task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "task_name")
    private String name;

    @ManyToOne
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "scheduleTask_id", referencedColumnName = "id")
    private ScheduleTask scheduleTask;

    @Column(name = "link_project")
    private String linkProject;

    @Column(name = "link_task")
    private String linkTask;

    @Column(name = "description_task")
    private String description;

    private String note;

    private String point;

    @Column(name = "estimate_time")
    private int estimateTime;

    @Column(name = "real_time")
    private String realTime;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "update_by")
    private String updateBy;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "task_detail",
            joinColumns = {@JoinColumn(name = "task_id")},
            inverseJoinColumns = {@JoinColumn(name = "project_id")})
    private Set<Project> projects;


}
