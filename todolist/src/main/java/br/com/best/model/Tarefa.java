package br.com.best.model;

import java.sql.Date;
//import java.util.Date;

public class Tarefa {

    private Long taksId;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private Date createdAt;

    public Tarefa() {
    }

    // criação do construtor

    public Tarefa(Long taksId, String name, String description, Date startDate, Date endDate,
            Date createdAt) {
        this.taksId = taksId;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createdAt = createdAt;
    }

    public Long getTarefaId() {
        return taksId;
    }

    public void setTarefaId(Long taksId) {
        this.taksId = taksId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /*
     * public Date getCreatedAt() {
     * return Date();
     * }
     */

    /*
     * public void setCreatedAt(Date createdAt) {
     * this.createdAt = createdAt;
     * }
     */

    @Override
    public String toString() {
        return "Tarefa{" +
                "taksId=" + taksId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", createdAt=" + createdAt +
                '}';
    }
}
