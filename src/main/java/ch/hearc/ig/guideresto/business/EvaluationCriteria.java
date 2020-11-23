package ch.hearc.ig.guideresto.business;

import javax.persistence.*;

public class EvaluationCriteria {
    @Id()
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="SEQ_CRITERES_EVALUATION")
    @SequenceGenerator(name="SEQ_CRITERES_EVALUATION", sequenceName="SEQ_CRITERES_EVALUATION")
    @Column(name="numero")
    private Integer id;
    @Column(name="nom", nullable = false)
    private String name;
    @Column(name="description")
    private String description;

    public EvaluationCriteria() {
        this(null, null);
    }

    public EvaluationCriteria(String name, String description) {
        this(null, name, description);
    }

    public EvaluationCriteria(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}